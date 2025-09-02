package io.github.xyt662.synapseconsole.domain.model;

import java.time.LocalDateTime;

/** 模型配置（可版本化） */
public class ModelConfig {
    private Long id;
    private String name;
    private String provider;
    private ModelType modelType; // LLM / EMBEDDING
    private String endpoint;
    private String encryptedApiKeyRef; // 加密引用或密钥ID
    private String configJson;
    private ModelStatus status; // ACTIVE / DISABLED
    private Integer quotaQps; // 可选限额
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long version;
}