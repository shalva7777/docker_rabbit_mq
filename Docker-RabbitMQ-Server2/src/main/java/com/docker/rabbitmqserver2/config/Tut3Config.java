package com.docker.rabbitmqserver2.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Tut3Config {

    @Bean
    public FanoutExchange fanout1() {
        return new FanoutExchange("tut.fanout1");
    }

    @Bean
    public FanoutExchange fanout2() {
        return new FanoutExchange("tut.fanout2");
    }

    private static class ReceiverConfig {

        @Bean
        public Queue autoDeleteQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue autoDeleteQueue2() {
            return new AnonymousQueue();
        }

        @Bean
        public Binding binding1(FanoutExchange fanout1,
                                Queue autoDeleteQueue1) {
            return BindingBuilder.bind(autoDeleteQueue1).to(fanout1);
        }

        @Bean
        public Binding binding2(FanoutExchange fanout2,
                                Queue autoDeleteQueue2) {
            return BindingBuilder.bind(autoDeleteQueue2).to(fanout2);
        }

    }

}
