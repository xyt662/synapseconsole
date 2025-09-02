package io.github.xyt662.synapseconsole.infrastructure.repository;

import io.github.xyt662.synapseconsole.domain.model.Agent;
import io.github.xyt662.synapseconsole.domain.repository.AgentRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

/** 仓储实现骨架：DO <-> 领域对象转换待实现
 * 
 * @author xyt
 * @since 1.0.0
 */
@Repository
public class AgentRepositoryImpl implements AgentRepository {
    @Override public Optional<Agent> findById(Long id) { return Optional.empty(); }
    @Override public Agent save(Agent agent) { return agent; }
    @Override public void delete(Long id) { }
    @Override public List<Agent> findByStatus(String status, int limit) { return Collections.emptyList(); }
}