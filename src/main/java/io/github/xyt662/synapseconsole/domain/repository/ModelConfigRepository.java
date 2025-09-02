package io.github.xyt662.synapseconsole.domain.repository;

import io.github.xyt662.synapseconsole.domain.model.ModelConfig;
import java.util.Optional;

public interface ModelConfigRepository {
    Optional<ModelConfig> findActiveById(Long id);
    ModelConfig save(ModelConfig config);
}