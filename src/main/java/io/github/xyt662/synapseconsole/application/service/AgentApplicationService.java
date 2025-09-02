package io.github.xyt662.synapseconsole.application.service;

import io.github.xyt662.synapseconsole.application.task.AgentActivationCommand;
import io.github.xyt662.synapseconsole.application.task.AgentCreateCommand;
import io.github.xyt662.synapseconsole.application.view.AgentView;

/** 应用服务：编排用例，控制事务与事件发布 */
public interface AgentApplicationService {
    Long createAgent(AgentCreateCommand cmd);
    void activateAgent(AgentActivationCommand cmd);
    AgentView getAgentDetail(Long id);
}