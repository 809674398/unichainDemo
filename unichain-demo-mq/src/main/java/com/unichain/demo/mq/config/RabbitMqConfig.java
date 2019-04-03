package com.unichain.demo.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMqConfig {



    @Bean(name = "demoQueue")
    public Queue queue(){
        return new Queue("demo");
    }

    @Bean(name = "demoExchange")
    public TopicExchange topicExchange(){
        return new TopicExchange("demo");
    }

    @Bean
    public Binding bindQueue(@Qualifier("demoQueue")Queue queue, @Qualifier("demoExchange")TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("demo.#");
    }
}
