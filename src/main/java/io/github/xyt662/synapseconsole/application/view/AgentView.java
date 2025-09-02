package io.github.xyt662.synapseconsole.application.view;

import java.util.List;

/** 查询结果视图对象（返回给接口层） */
public class AgentView {
    public Long id;
    public String name;
    public String description;
    public String status;
    public String type;
    public List<Long> toolIds;
    public Long modelConfigId;
}