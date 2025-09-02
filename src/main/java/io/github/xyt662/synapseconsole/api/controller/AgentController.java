package io.github.xyt662.synapseconsole.api.controller;

import io.github.xyt662.synapseconsole.application.service.AgentApplicationService;
import io.github.xyt662.synapseconsole.application.task.AgentActivationCommand;
import io.github.xyt662.synapseconsole.application.task.AgentCreateCommand;
import io.github.xyt662.synapseconsole.application.view.AgentView;
import org.springframework.web.bind.annotation.*;

/** 智能体管理接口（示例骨架） */
@RestController
@RequestMapping("/api/v1/agents")
public class AgentController {

    private final AgentApplicationService agentApplicationService;
    public AgentController(AgentApplicationService agentApplicationService) { this.agentApplicationService = agentApplicationService; }

    @PostMapping
    public Long create(@RequestBody AgentCreateCommand cmd) { return agentApplicationService.createAgent(cmd); }

    @PostMapping("/{id}/activate")
    public void activate(@PathVariable Long id, @RequestHeader("X-User-Id") Long userId) {
        AgentActivationCommand command = new AgentActivationCommand();
        command.agentId = id; command.operatorId = userId;
        agentApplicationService.activateAgent(command);
    }

    @GetMapping("/{id}")
    public AgentView detail(@PathVariable Long id) { return agentApplicationService.getAgentDetail(id); }
}