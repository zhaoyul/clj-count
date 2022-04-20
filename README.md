# clj-count

统计Clojure的代码行数, 使用rewrite-clj识别clojure的代码结构, 考虑doc-string, rich comments

## Installation

`lein ubjerjar` 进行编译

## Usage

在命令行执行

`$ java -jar clj-count-0.1.0-standalone.jar src-dir-path`


## Examples

$java -jar target/uberjar/clj-count-0.1.0-SNAPSHOT-standalone.jar ../device_sensor/backend/src
Found 165 source files.

```
Found 232 source files.

|------+---------------------------------------------------------------------------------------------------------------------------------+-------+---------------+--------+----------|
| Ext  | File                                                                                                                            | Files | Lines of Code | Spaces | Comments |
|------+---------------------------------------------------------------------------------------------------------------------------------+-------+---------------+--------+----------|
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/frames.clj                              |     1 |          1447 |    243 |      225 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/msg_parser.clj                          |     1 |           871 |    189 |      169 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/stream_detector.clj                                |     1 |           733 |    973 |      342 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416/frames.clj                               |     1 |           720 |    177 |      179 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/context.clj                                        |     1 |           640 |    118 |      204 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/structure.clj                                |     1 |           581 |     83 |       71 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/doc/doc_service.clj                               |     1 |           522 |     48 |       18 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/clj/device_sensor/manifold.clj                                          |     1 |           512 |    709 |      108 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/scheduler/core_test_data.clj                      |     1 |           497 |     12 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_service.clj                             |     1 |           477 |    121 |       93 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/data_to_101.clj                         |     1 |           438 |     63 |       23 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/tcp.clj                                            |     1 |           430 |    231 |      125 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/utils_test.clj                                    |     1 |           402 |    140 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416/msg_parser.clj                           |     1 |           401 |     51 |      110 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/codec/416a/frames_test.clj                        |     1 |           381 |     48 |       13 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/station/station_routes_test.clj                  |     1 |           354 |     39 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/fsmd/frames.clj                              |     1 |           341 |     38 |       67 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/task/load_balance_test.clj                       |     1 |           321 |     20 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/msg_handler.clj                         |     1 |           312 |     48 |       22 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/dchj_fusion_test.clj                          |     1 |           306 |     10 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/network/network_routes_test.clj                  |     1 |           299 |     10 |       13 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/tcp_test.clj                                      |     1 |           294 |     21 |       31 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/func_code_converter.clj                      |     1 |           293 |     11 |        5 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/scheduler/core.clj                                 |     1 |           286 |    123 |      116 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/ws.clj                                             |     1 |           264 |     75 |       42 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/utils.clj                                          |     1 |           247 |    121 |       22 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/412/frames.clj                               |     1 |           245 |     74 |       49 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/task/task_routes_test.clj                        |     1 |           243 |     32 |       34 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/load_balance.clj                             |     1 |           242 |     28 |       67 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/fsmd/fsmd_service.clj                        |     1 |           242 |     77 |       42 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/sensors.clj                                        |     1 |           240 |     95 |       47 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/jna_utils.clj                                      |     1 |           225 |    123 |       46 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/sensor_register.clj                                |     1 |           219 |    159 |      116 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/tasks.clj                               |     1 |           212 |     21 |       43 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/dchj.clj                |     1 |           208 |     12 |       20 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/utils.clj                                          |     1 |           193 |     63 |       50 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416/cmd_mock.clj                             |     1 |           191 |    299 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/reply_decoder.clj                       |     1 |           181 |     45 |       25 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/fusion_routes.clj                          |     1 |           174 |     43 |       44 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/sample_comparison.clj                          |     1 |           169 |     25 |       74 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/db/task_db_service.clj                                    |     1 |           163 |     74 |       31 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/cross_locating_java.clj                        |     1 |           162 |     60 |       24 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/network/network_service.clj                       |     1 |           162 |     29 |       29 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/test_utils.clj                                    |     1 |           153 |    119 |       38 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/dchj_fusion.clj                                |     1 |           132 |     24 |       60 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/config_routes.clj                             |     1 |           124 |     19 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/project.clj                                                                     |     1 |           123 |      4 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/cross_locating_test.clj                       |     1 |           119 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/smcx_test.clj          |     1 |           117 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/network/network_service_test.clj                 |     1 |           116 |      7 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/db/task_db.clj                                            |     1 |           114 |     21 |       19 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/temp_task.clj                                      |     1 |           114 |     10 |        5 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/fsmd/fsmd_decode.clj                         |     1 |           113 |     17 |       25 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416/msg_handler.clj                          |     1 |           113 |     29 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/routes/base.clj                                           |     1 |           108 |     19 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416a/constants.clj                           |     1 |           105 |     41 |        8 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task_template/task_template_service.clj           |     1 |           104 |     13 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/core.clj                                                  |     1 |           102 |     20 |       22 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_import_service.clj                      |     1 |           102 |     11 |       29 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416/tasks.clj                                |     1 |           102 |     46 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/mq/mq_gen_task.clj                                 |     1 |           101 |     10 |       16 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/sys/sys_user_routes_test.clj                     |     1 |           100 |     15 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/bg_noise_extract.clj                           |     1 |           100 |     23 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/monitoring_station/monitoring_station_service.clj |     1 |            98 |     13 |       15 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/kdzp.clj                |     1 |            97 |      7 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/sys/auth_routes_test.clj                         |     1 |            96 |     14 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/occupied_rate_old.clj                          |     1 |            96 |     35 |       24 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/monitoring_station/monitoring_station_routes.clj  |     1 |            95 |     18 |       15 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/scheduler/replay.clj                               |     1 |            93 |     70 |       26 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/large_singal_analysis.clj                      |     1 |            92 |     32 |       41 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/singal_active_law_fusion.clj                   |     1 |            88 |    110 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/network/network_routes.clj                        |     1 |            88 |     10 |       11 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_spec.clj                                |     1 |            87 |     17 |       16 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/mq/mq_msgs.clj                                     |     1 |            86 |     12 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/task_template/task_template_routes_test.clj      |     1 |            84 |      8 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/biz_error.clj                                      |     1 |            81 |      9 |        3 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/large_singal_analysis_test.clj                |     1 |            80 |     50 |       12 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/sensors_test.clj                                  |     1 |            80 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/task_utils.clj                                     |     1 |            79 |     14 |       21 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/sys_user_routes.clj                           |     1 |            78 |     13 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/dxhcx.clj               |     1 |            75 |      6 |       10 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/large_signal_statistics_service.clj        |     1 |            74 |      3 |        5 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/math.clj                                           |     1 |            72 |     26 |       12 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_export_service.clj                      |     1 |            71 |     16 |       22 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/center_station/center_station_routes.clj          |     1 |            68 |     10 |       10 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/clj/dev.clj                                                             |     1 |            67 |     14 |       10 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_cscl.clj           |     1 |            66 |      7 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/smcx.clj                |     1 |            66 |      3 |       17 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/scheduler/core_test.clj                           |     1 |            65 |     21 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/core.clj                |     1 |            65 |     27 |       51 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/codec/416/frames_test.clj                         |     1 |            64 |     39 |        5 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/cross_locating.clj                             |     1 |            63 |      4 |       25 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/416/constants.clj                            |     1 |            61 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/backup/backup_service.clj                         |     1 |            60 |     25 |       10 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/codec/416a/tasks_test.clj                         |     1 |            57 |      8 |        3 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/handler.clj                                               |     1 |            57 |      7 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/message_queue.clj                                  |     1 |            57 |      5 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/db/common_service.clj                                     |     1 |            56 |     13 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/moving_cross_locating_service.clj          |     1 |            56 |     22 |       65 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/doc/src/freemarker_clj/shim.clj                   |     1 |            56 |     17 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/412/constants.clj                            |     1 |            56 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_routes.clj                              |     1 |            55 |      2 |        8 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/utils.clj               |     1 |            54 |     10 |       59 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/token.clj                                          |     1 |            54 |     14 |        7 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/cross_locating_java_test.clj                  |     1 |            53 |     12 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/lsxdcx_test.clj        |     1 |            53 |      5 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/common/utils_test.clj                                    |     1 |            53 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/kdcx.clj                |     1 |            53 |      6 |        8 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/lsxdcx.clj              |     1 |            52 |      5 |        7 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task_data/task_data_service.clj                   |     1 |            52 |      7 |       40 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/signal_sample/signal_sample_routes.clj            |     1 |            52 |      6 |       29 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/singal_change_fusion.clj                       |     1 |            51 |    123 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/udp.clj                                            |     1 |            50 |     16 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_ksjg_test.clj     |     1 |            49 |      6 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/occupied_rate_service.clj                  |     1 |            49 |      4 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/bg_noise_extraction_service.clj            |     1 |            48 |      3 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/clj/device_sensor/experiment/logging.clj                                |     1 |            47 |     18 |       13 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/occupied_rate.clj                              |     1 |            47 |     18 |       65 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/pdsm_416_test.clj      |     1 |            45 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/message_queue_test.clj                            |     1 |            45 |      7 |       31 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/build_package.clj                                                               |     1 |            45 |     15 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_cscl_416_test.clj |     1 |            44 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/dxhcx_test.clj         |     1 |            44 |      6 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_cscl_test.clj     |     1 |            44 |      6 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/xhks_test.clj          |     1 |            44 |      4 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/db/core.clj                                               |     1 |            44 |      4 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/singal_energy_distribute_fusion.clj            |     1 |            43 |    110 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/center_station/center_station_service.clj         |     1 |            43 |      9 |       14 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/mq/mq_utils.clj                                    |     1 |            43 |     11 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/mq/mq_demand_converter.clj                         |     1 |            43 |     25 |       21 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/sys_user_service.clj                          |     1 |            42 |      8 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/hand_hold/share_task.clj                           |     1 |            40 |     12 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/utils.clj                                                |     1 |            39 |     10 |        7 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_ksjg_416_test.clj |     1 |            39 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/task/task_service_test.clj                       |     1 |            39 |     16 |        8 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/occupied_rate_test.clj                        |     1 |            38 |     11 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/singal_energy_distribute_fusion_test.clj      |     1 |            36 |     17 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/bg_noise_param_extractor/core.clj              |     1 |            36 |      7 |        3 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/ws_client.clj                                      |     1 |            36 |     33 |       17 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/middleware/exception.clj                                  |     1 |            35 |      4 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/station/station_service.clj                       |     1 |            35 |     11 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/sound.clj                                                 |     1 |            35 |     14 |        3 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/xhcs_test.clj          |     1 |            34 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/kdzp_test.clj          |     1 |            34 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/tdxh_test.clj          |     1 |            32 |      6 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/aes_utils.clj                                      |     1 |            32 |      8 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/auth_service.clj                              |     1 |            32 |      4 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/doc/doc_routes.clj                                |     1 |            32 |      8 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/backup/backup_routes.clj                          |     1 |            31 |      9 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/algo_utils.clj                                 |     1 |            30 |      5 |        7 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/doc/download_doc_routes.clj                       |     1 |            30 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/algo_utils_test.clj                           |     1 |            29 |      7 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/middleware/hugsql_upper_case_adapters.clj                 |     1 |            29 |     12 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/large_signal_param_extractor/core.clj          |     1 |            29 |      6 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/result.clj                                         |     1 |            29 |     10 |       11 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/mq/mq_demand_handler.clj                           |     1 |            28 |      6 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/kdcx_test.clj          |     1 |            27 |      4 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/xhcs_416_test.clj      |     1 |            27 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/coverage_analysis_service.clj              |     1 |            27 |      3 |        5 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/log_routes.clj                                |     1 |            27 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/fusion/signals_organize_service_test.clj         |     1 |            26 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/codec/416a/msg_parser_test.clj                    |     1 |            26 |      9 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/statistics_results.clj                     |     1 |            26 |      5 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_ksjg_416.clj       |     1 |            25 |      2 |       11 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/fusion/signals_organize_service.clj               |     1 |            25 |     12 |       17 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/auth_routes.clj                               |     1 |            25 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/math_test.clj                                     |     1 |            24 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/dxhcx_416.clj           |     1 |            24 |      5 |       13 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/response_utils.clj                                 |     1 |            24 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/doc/src/freemarker_clj/core.clj                   |     1 |            24 |      5 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/xhks.clj                |     1 |            23 |      6 |       15 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task_template/task_template_routes.clj            |     1 |            23 |      3 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/fusion_param_extractor/pdsm_test.clj          |     1 |            22 |      4 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/singal_active_law_fusion_test.clj             |     1 |            22 |     30 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/ws_test.clj                                       |     1 |            22 |      5 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_ksjg.clj           |     1 |            22 |      3 |        6 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/pdsm.clj                |     1 |            21 |      2 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_service_spec.clj                        |     1 |            21 |      8 |        8 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/station/station_routes.clj                        |     1 |            21 |      5 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/crc.clj                                            |     1 |            21 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/mq/mq_result_converter.clj                         |     1 |            21 |      7 |       76 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/lsxdcx_416.clj          |     1 |            20 |      3 |       11 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/pdsm_416.clj            |     1 |            20 |      2 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/ldmc_cscl_416.clj       |     1 |            20 |      6 |        7 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/middleware/log_interceptor.clj                            |     1 |            19 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/nrepl.clj                                                 |     1 |            19 |      4 |        4 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/xhcs.clj                |     1 |            19 |      2 |        9 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/tdxh.clj                |     1 |            19 |      5 |        7 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/sensors_stauts.clj                                 |     1 |            19 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/jna_utils_test.clj                                |     1 |            17 |     11 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/utils_format.clj                                   |     1 |            17 |      3 |       18 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/clj/device_sensor/env.clj                                               |     1 |            16 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/middleware.clj                                            |     1 |            16 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/fusion_param_extractor/xhcs_416.clj            |     1 |            16 |      3 |        3 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/fsmd/constants.clj                           |     1 |            16 |      5 |        2 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/log_service.clj                               |     1 |            14 |      4 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithms/sample_comparison_test.clj                    |     1 |            13 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/cljs/device_sensor/app.cljs                                             |     1 |            13 |      6 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/middleware/formats.clj                                    |     1 |            13 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/db/common_service_test.clj                               |     1 |            11 |      3 |        3 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/common_parser_for_ws.clj                     |     1 |            11 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/config.clj                                                |     1 |            11 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/clj/user.clj                                                            |     1 |            10 |      4 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/common_decoder.clj                           |     1 |            10 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/prod/clj/device_sensor/env.clj                                              |     1 |             9 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/dev/clj/device_sensor/dev_middleware.clj                                    |     1 |             9 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/hand_hold/core.clj                                 |     1 |             9 |     10 |       36 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/task/task_import_service_test.clj                |     1 |             7 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/common/encrypt.clj                                        |     1 |             7 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/constant.clj                                      |     1 |             5 |      2 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task/task_db.clj                                  |     1 |             5 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/doc/doc_db.clj                                    |     1 |             5 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/db/common_db.clj                                          |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/center_station/center_station_db.clj              |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/queries/queries_db.clj                            |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task_data/task_data_db.clj                        |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/monitoring_station/monitoring_station_db.clj      |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/station/station_db.clj                            |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/signal_sample/signal_sample_db.clj                |     1 |             4 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/env/prod/clj/device_sensor/app.cljs                                             |     1 |             3 |      3 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/network/network_db.clj                            |     1 |             3 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/task_template/task_template_db.clj                |     1 |             3 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/sys_user_db.clj                               |     1 |             3 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/sys/log_db.clj                                    |     1 |             3 |      2 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/modules/backup/backup_db.clj                              |     1 |             3 |      3 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/socket/context_test.clj                                  |     1 |             2 |      1 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/algorithms/data_format.clj                                |     1 |             2 |      6 |       33 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/modules/base/base_admin_routes_test.clj                  |     1 |             1 |      1 |        0 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/test/clj/device_sensor/algorithm_test.clj                                       |     1 |             0 |     17 |       54 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/atom/frames.clj                              |     1 |             0 |      1 |        1 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/rmtp2/frames.clj                             |     1 |             0 |      4 |       11 |
| .clj | /Users/kevinli/sandbox/rc/device_sensor/backend/src/clj/device_sensor/socket/codec/rmtp1/frames.clj                             |     1 |             0 |      1 |        2 |
| ____ | _______________________________________________________________________________________________________________________________ | _____ | _____________ | ______ | ________ |
|      | SUM:                                                                                                                            |   232 |         24274 |   7170 |     4274 |
|------+---------------------------------------------------------------------------------------------------------------------------------+-------+---------------+--------+----------|

```

### Bugs


## License

Copyright © 2022 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
