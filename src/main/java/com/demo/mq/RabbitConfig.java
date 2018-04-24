package com.demo.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alex Ege
 */
@Configuration
public class RabbitConfig {

	@Bean
	public Queue Queue() {
		return new Queue("hello");
	}

}
