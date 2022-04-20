(ns clj-count.core
  (:gen-class)
  (:require [clojure.java.io :as io]
            [clojure.pprint :as pp]
            [clojure.string :as str]
            [rewrite-clj.parser :as parser]
            [rewrite-clj.node :as node]
            [com.rpl.specter :as specter]
            [doric.core :as doric])
  (:import  java.nio.file.FileSystems))


(def clj-matcher (.getPathMatcher
                  (FileSystems/getDefault)
                  "glob:*.{clj,cljs,cljc}"))

(defn find-all-clojure-files [dir]
  (->> dir
       io/file              ;; 目录生成文件对象
       file-seq             ;; 遍历所有的文件(文件夹)
       (filter #(.isFile %)) ;; 过滤, 只要文件
       ;; 过滤, clj/cljs/cljc文件
       (filter #(.matches clj-matcher (.getFileName (.toPath %))))))


(defn doc-strings
  "返回当前node的doc-string, 如果当前node是`def`, `defn`, `ns`, 返回docsting
   的vector, vector的每一个元素是一行string
   如果没有docstirng, 返回nil"
  [node]
  (let [doc-str-vec (and (= (:tag node) :list)
                         (#{'def 'defn 'ns}  (-> node
                                                 :children
                                                 first
                                                 :value))
                         (try
                           (-> node
                               :children
                               (nth 5)
                               :lines)
                           (catch Exception _e
                             nil)))]
    doc-str-vec))


(defn src-lins
  "文件全部行数"
  [file]
  (-> file
      io/reader
      line-seq
      count))

(defn src-space-lines
  "文件空行数"
  [file]
  (->> file
       io/reader
       line-seq
       (remove (complement str/blank?))
       count))


(defn src-comment-lines
  "注释行数, 语句中所有含有;的语句都算"
  [file]
  (->> file
       io/reader
       line-seq
       (filter #(str/includes? % ";"))
       count))

(defn src-inline-comment-lines
  "注释行数, 代码和注释都出现在同一行的情况
   比如:
   `(+ 1 1) ;; 一加一等于二`
   "
  [file]
  (->> file
       io/reader
       line-seq
       (filter #(str/includes? % ";"))
       count))

(defn src-doc-string-lines
  "docstring的行数"
  [file]
  (->> file
       slurp
       parser/parse-string-all
       :children
       (map doc-strings)
       (filter vector?)
       (mapv count)
       (reduce +)
       ))

(defn rich-comment-node?
  "判断是不是一个`(comment ...)`节点"
  [node]
  (and (= :list (node/tag node))
       (some-> node
               :children
               first
               :value
               (= 'comment))))

(defn unevaled-node?
  "判断是不是一个`#_(...)`节点"
  [node]
  (= :uneval (node/tag node)))

(defn sexpr-to-str
  "输出一个表达式为字符串"
  [s]
  (with-out-str
    (pp/pprint s)))

(defn unevaled-lines
  "#_(...) 语句块的行数"
  [file]
  (->> file
       slurp
       parser/parse-string-all
       :children
       (filter unevaled-node?)
       (node/string)
       (re-seq #"\\n")
       count
       inc
       ))

(defn rich-comment-lines
  "(comment)语句块的行数"
  [file]
  (->> file
       slurp
       parser/parse-string-all
       :children
       (filter rich-comment-node?)
       node/sexprs
       sexpr-to-str
       str/split-lines
       count
       ))

(defn metrics
  "获得某个文件的全部统计数据"
  [file]
  (let [total-counts  (src-lins file)
        spaces-counts  (src-space-lines file)
        comments-counts (src-comment-lines file)
        doc-strings-count (src-doc-string-lines file)
        rich-comments-count (rich-comment-lines file)
        unevaled-count (unevaled-lines file)
        src-lines (- total-counts
                     spaces-counts
                     comments-counts
                     doc-strings-count
                     #_rich-comments-count
                     unevaled-count)]
    {:ext ".clj"
     :path (.getPath file)
     :files 1
     :lines (if (pos? src-lines) src-lines 0) 
     :spaces (+ rich-comments-count spaces-counts)
     :comments  (+ comments-counts
                   doc-strings-count
                   )}))


(comment
  (let [file (io/file "../device_sensor/backend/src/clj/device_sensor/socket/tcp.clj")]
    [(src-lins file)
     (src-space-lines file)
     (src-comment-lines file)
     (src-doc-string-lines file)
     (rich-comment-lines file)
     (unevaled-lines file)])


  (def s  (last *1))

  (inc   (count   (re-seq #"\\n" s)))
  )



;; Generating ASCII report

(def columns [{:name :ext   :align :left}
              {:name :path  :align :left :title "File"}
              {:name :files :align :right}
              {:name :lines :align :right :title "Lines of Code"}
              {:name :spaces :align :right}
              {:name :comments :align :right}])

(defn ascii-table [rows]
  (let [ks (-> rows first keys set)]
    (doric/table (filter #(contains? ks (:name %)) columns)
                 rows)))

(defn dash-row [rows]
  (reduce (fn [ret k]
            (let [col (->> columns (filter #(= (:name %) k)) first)]
              (assoc ret k (apply str
                                  (repeat (->> rows
                                               (map #(count (str (get % k))))
                                               (apply max
                                                      4
                                                      (count (name (:name col)))
                                                      (count (get col :title ""))))
                                          "_")))))
          {}
          (keys (first rows))))

(defn map-vals [f m]
  (reduce-kv (fn [r k v] (assoc r k (f v))) {} m))

(defn table-by-ext [fms]
  (let [by-ext (->> fms
                    (group-by :ext)
                    (map-vals (fn [ms]
                                (as-> ms $
                                  (map #(dissoc % :ext :path) $)
                                  (apply merge-with + $)
                                  (assoc $ :files (count ms)))))
                    (seq)
                    (map #(assoc (val %) :ext (key %))))
        totals (assoc (->> by-ext (map #(dissoc % :ext)) (apply merge-with +))
                      :ext "SUM:")]
    (ascii-table (concat (sort-by #(get % :lines -1) > by-ext)
                         [(dash-row by-ext)]
                         [totals]))))

(defn table-by-file [fms]
  (let [totals (assoc (->> fms (map #(dissoc % :ext :path)) (apply merge-with +))
                      :path "SUM:")]
    (ascii-table (concat (sort-by #(get % :lines -1) > fms)
                         [(dash-row fms)]
                         [totals]))))

(defn print-report [ms & [opts]]
  (let [info (get opts :info println)
        warn (get opts :warn println)
        errs (->> ms
                  (filter :error)
                  (map (fn [x] (merge (ex-data (:error x))
                                      x
                                      {:error (.getMessage (:error x))}))))
        fms (remove :error ms)]
    (info "Found" (count ms) "source files.")
    (when (seq errs)
      (warn "Encountered" (count errs) "reader errors:")
      (doseq [e errs]
        (warn (pr-str e))))
    (when (seq fms)
      (info "")
      (info (if (:by-file opts)
              (table-by-file fms)
              (table-by-ext fms))))))






(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (->> (find-all-clojure-files (first args))
       (mapv metrics)
       (#(print-report % {:by-file true}))
       ))


(comment

  (print-report [{:ext 100 :path "100"  :files 300 :lines 34 :spaces 5 :comments  12} ])

  (print-report [(metrics (io/file "/Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/tcp.clj"))])


  (->> (find-all-clojure-files "/Users/kevinli/sandbox/rc/device_sensor/backend")

       (mapv metrics)
       (#(print-report % {:by-file true}))
       )
  )
