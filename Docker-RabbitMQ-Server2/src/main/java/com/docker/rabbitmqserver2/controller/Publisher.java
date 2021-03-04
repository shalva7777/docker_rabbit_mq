package com.docker.rabbitmqserver2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class Publisher {

//    private static final Logger LOGGER = LoggerFactory.getLogger(Publisher.class);
//
//    private final RabbitTemplate rabbitTemplate;
//    private final Binding binding;
//
//    public Publisher(RabbitTemplate rabbitTemplate, Binding binding) {
//        this.rabbitTemplate = rabbitTemplate;
//        this.binding = binding;
//    }
//
//    @GetMapping(value = "/send/{msg}")
//    // @ResponseStatus annotation marks the method with the status-code and the reason message that should be returned.
//    @ResponseStatus(code = HttpStatus.OK)
//    public String send(@PathVariable("msg") final String message) {
//        LOGGER.info("Sending message to the queue.");
//        rabbitTemplate.convertAndSend(binding.getExchange(), binding.getRoutingKey(), message);
//        LOGGER.info("Message sent successfully to the queue, sending back the response to the user.");
//        return "Message sent successfully to the queue.";
//    }
}
