package io.github.xyt662.synapseconsole.infrastructure.repository;

import io.github.xyt662.synapseconsole.domain.model.ModelConfig;
import io.github.xyt662.synapseconsole.domain.repository.ModelConfigRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class ModelConfigRepositoryImpl implements ModelConfigRepository {
    @Override public Optional<ModelConfig> findActiveById(Long id) { return Optional.empty(); }
    @Override public ModelConfig save(ModelConfig config) { return config; }
}