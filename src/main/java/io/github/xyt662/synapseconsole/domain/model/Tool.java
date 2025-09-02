package io.github.xyt662.synapseconsole.domain.model;

import java.time.LocalDateTime;

/** 聚合：工具 */
public class Tool {
    private Long id;
    private String name;
    private String description;
    private String category;
    private String mcpServer;
    private String schemaConfigJson;
    private String version;
    private ToolStatus status; // AVAILABLE / UNAVAILABLE
    private Long creatorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long versionNo;

    public void enable() { /* 状态流转校验 */ }
    public void disable() { /* 状态流转校验 */ }
    public void bumpVersion(String newSchema) { /* 版本递增策略 */ }
}