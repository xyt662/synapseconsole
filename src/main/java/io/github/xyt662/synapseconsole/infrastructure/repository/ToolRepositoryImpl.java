package io.github.xyt662.synapseconsole.infrastructure.repository;

import io.github.xyt662.synapseconsole.domain.model.Tool;
import io.github.xyt662.synapseconsole.domain.repository.ToolRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class ToolRepositoryImpl implements ToolRepository {
    @Override public Optional<Tool> findById(Long id) { return Optional.empty(); }
    @Override public Tool save(Tool tool) { return tool; }
}