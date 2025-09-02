package io.github.xyt662.synapseconsole.domain.event;

/** 工具变更事件 */
public class ToolUpdatedEvent extends DomainEvent {
    private final Long toolId;
    private final String newVersion;
    public ToolUpdatedEvent(Long toolId, String newVersion) { this.toolId = toolId; this.newVersion = newVersion; }
    public Long getToolId() { return toolId; }
    public String getNewVersion() { return newVersion; }
    @Override public String eventType() { return "tool.updated"; }
}