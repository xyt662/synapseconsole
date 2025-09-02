package io.github.xyt662.synapseconsole.domain.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 聚合根：智能体
 * 说明：领域层对象，不直接耦合 ORM 注解；由 Repository 组装/持久化。
 */
public class Agent {

    private Long id;
    private String name;
    private String description;
    private AgentType type; // 领域枚举：SEQUENTIAL / CONCURRENT / HANDOFF
    private String configJson; // 结构化配置（解析后可扩展为独立值对象）
    private Long modelConfigId; // 关联当前激活模型配置
    private AgentStatus status; // DRAFT / ACTIVE / DISABLED / DEPRECATED
    private Long creatorId;
    private List<Long> boundToolIds; // 绑定工具ID集合（快照）
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long version; // 乐观锁版本

    /** 激活 */
    public void activate() { /* 规则校验：必须至少绑定一个工具且有模型配置 */ }
    /** 禁用 */
    public void disable() { /* 状态流转校验 */ }
    /** 绑定工具集（覆盖） */
    public void bindTools(List<Long> toolIds) { /* 校验工具合法性 -> 设置 */ }
    /** 切换模型配置 */
    public void switchModel(Long newModelConfigId) { /* 校验版本与状态 */ }

    // getter/setter 省略（实际生成 Lombok 或手写）
}