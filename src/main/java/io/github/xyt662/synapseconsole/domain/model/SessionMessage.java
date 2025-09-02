package io.github.xyt662.synapseconsole.domain.model;

import java.time.LocalDateTime;

/** 会话消息值对象 */
public class SessionMessage {
    private Long id;
    private Long sessionId;
    private String role; // user / agent / system
    private String content;
    private LocalDateTime createdAt;
}