# Dubbo学习笔记

## 1、七个重要标签

| 标签                    | 标签描述                                     | 特殊说明                                     |
| --------------------- | ---------------------------------------- | ---------------------------------------- |
| <dubbo:application /> | 应用信息，即当前服务的项目配置信息                        |                                          |
| container             | 服务运行容器                                   | jetty log4j logback spring               |
| <dubbo:provider />    | 一些服务配置方的服务治理、性能调优配置。 服务提供者缺省值配置          | 该标签为 `<dubbo:service>` 和 `<dubbo:protocol>` 标签的缺省值设置。 |
| <dubbo:service />     | 服务提供者暴露服务配置。                             |                                          |
| <dubbo:consumer />    | 一些服务消费方的服务治理、性能调优配置。 服务提供者缺省值配置。服务消费者缺省值配置。 | 该标签为 `<dubbo:reference>` 标签的缺省值设置。       |
| <dubbo:reference />   | 服务消费者引用服务配置。                             |                                          |
| <dubbo:registry />    | 注册中心配置。                                  | 同时如果有多个不同的注册中心，可以声明多个 `<dubbo:registry>` 标签，并在 `<dubbo:service>` 或 `<dubbo:reference>` 的 `registry` 属性指定使用的注册中心。 |
| <dubbo:protocol />    | 服务提供者协议配置。                               | 如果需要支持多协议，可以声明多个 `<dubbo:protocol>` 标签，并在 `<dubbo:service>` 中通过 `protocol` 属性指定使用的协议。 |



