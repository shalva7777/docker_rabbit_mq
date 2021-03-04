package com.docker.rabbitmqserver2.config;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Tut3Sender implements CommandLineRunner {

    private final RabbitTemplate template;
    private final FanoutExchange fanout1;
    private final FanoutExchange fanout2;

    AtomicInteger dots = new AtomicInteger(0);

    AtomicInteger count = new AtomicInteger(0);

    public Tut3Sender(RabbitTemplate template, FanoutExchange fanout1, FanoutExchange fanout2) {
        this.template = template;
        this.fanout1 = fanout1;
        this.fanout2 = fanout2;
    }

    @Override
    public void run(String... args) throws Exception {
        StringBuilder builder = new StringBuilder("Hello");
        if (dots.getAndIncrement() == 3) {
            dots.set(1);
        }
        for (int i = 0; i < dots.get(); i++) {
            builder.append('.');
        }
        builder.append(count.incrementAndGet());
        String message = builder.toString();
        template.convertAndSend(fanout1.getName(), "", message);
        System.out.println(" [x] Sent '" + message + "'");
        template.convertAndSend(fanout2.getName(), "", message);
        System.out.println(" [x] Sent '" + message + "'");
    }
}
