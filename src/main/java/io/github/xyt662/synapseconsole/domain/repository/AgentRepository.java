package io.github.xyt662.synapseconsole.domain.repository;

import io.github.xyt662.synapseconsole.domain.model.Agent;
import java.util.List;
import java.util.Optional;

/** 领域仓储接口：隐藏持久化细节 */
public interface AgentRepository {
    Optional<Agent> findById(Long id);
    Agent save(Agent agent);
    void delete(Long id);
    List<Agent> findByStatus(String status, int limit);
}