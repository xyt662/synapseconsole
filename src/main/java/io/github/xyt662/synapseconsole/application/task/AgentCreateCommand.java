package io.github.xyt662.synapseconsole.application.task;

import java.util.List;

/** 创建智能体命令（接口层 DTO -> Command） */
public class AgentCreateCommand {
    public String name;
    public String description;
    public String type;
    public String configJson;
    public Long modelConfigId;
    public List<Long> toolIds;
    public Long creatorId;
}