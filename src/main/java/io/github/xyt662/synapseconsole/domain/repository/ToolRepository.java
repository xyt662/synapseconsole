package io.github.xyt662.synapseconsole.domain.repository;

import io.github.xyt662.synapseconsole.domain.model.Tool;
import java.util.Optional;

public interface ToolRepository {
    Optional<Tool> findById(Long id);
    Tool save(Tool tool);
}