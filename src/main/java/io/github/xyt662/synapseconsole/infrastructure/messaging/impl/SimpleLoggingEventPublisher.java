package io.github.xyt662.synapseconsole.infrastructure.messaging.impl;

import io.github.xyt662.synapseconsole.domain.event.DomainEvent;
import io.github.xyt662.synapseconsole.infrastructure.messaging.DomainEventPublisher;
import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.stereotype.Component;

/** 暂时代码：仅日志输出，后续替换为 Kafka/RabbitMQ */
@Component
public class SimpleLoggingEventPublisher implements DomainEventPublisher {
    private static final Logger log = LoggerFactory.getLogger(SimpleLoggingEventPublisher.class);
    @Override public void publish(DomainEvent event) { log.info("PUBLISH DOMAIN EVENT type={} ts={}", event.eventType(), event.getOccurredAt()); }
}