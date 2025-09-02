# 架构骨架说明

本文件描述当前代码分层与目录设计，仅提供骨架与职责说明，业务逻辑与实现细节待补充。

## 分层与包
- api: 控制器、请求/响应 DTO、全局异常与拦截器
- application: 用例编排（xxxApplicationService）、Command / Query / View 对象
- domain: 聚合模型、领域服务、领域事件、仓储接口
- infrastructure: 持久化（DO + Mapper + 仓储实现）、消息、缓存、配置、安全、对外集成
- common: 公共工具与异常
- job: 定时与调度任务

## 后续待实现
- 领域对象与 DO 转换装配器
- JWT 认证、权限注解
- 事件发布与消费（替换日志发布器）
- Redis 缓存策略与二级缓存
- Outbox 事件一致性机制

> 本骨架遵循之前讨论的解耦与可演进设计，支持后续微服务拆分。