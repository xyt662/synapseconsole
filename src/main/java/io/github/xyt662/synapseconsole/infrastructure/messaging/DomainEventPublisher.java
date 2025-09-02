package io.github.xyt662.synapseconsole.infrastructure.messaging;

import io.github.xyt662.synapseconsole.domain.event.DomainEvent;

/** 领域事件发布接口(对接消息中间件)
 * 
 * @author xyt
 * @since 1.0.0
 */
public interface DomainEventPublisher {
    void publish(DomainEvent event);
}