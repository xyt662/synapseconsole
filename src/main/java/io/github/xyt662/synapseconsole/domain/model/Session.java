package io.github.xyt662.synapseconsole.domain.model;

import java.time.LocalDateTime;
import java.util.List;

/** 会话聚合（简化：消息体可拆分为独立表） */
public class Session {
    private Long id;
    private Long userId;
    private Long agentId;
    private List<SessionMessage> messages; // 最近消息集合（完整历史可懒加载）
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}