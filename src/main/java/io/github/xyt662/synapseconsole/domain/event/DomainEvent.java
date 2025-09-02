package io.github.xyt662.synapseconsole.domain.event;

import java.time.Instant;

/** 领域事件基类 */
public abstract class DomainEvent {
    private final Instant occurredAt = Instant.now();
    public Instant getOccurredAt() { return occurredAt; }
    public abstract String eventType();
}