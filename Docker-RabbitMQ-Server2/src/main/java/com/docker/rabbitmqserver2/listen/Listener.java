package com.docker.rabbitmqserver2.listen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;

@Component
public class Listener {

//    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);
//
//    private final Queue queue;
//
//    public Listener(Queue queue) {
//        this.queue = queue;
//    }
//
//    @RabbitListener(queues = "#{queue.getName()}")  // Dynamically reading the queue name using SpEL from the "queue" object.
//    public void receive(final String message) {
//        LOGGER.info("Listening messages from the queue!!");
//        LOGGER.info("Received the following message from the queue= " + message);
//        LOGGER.info("Message received successfully from the queue.");
//    }
}
