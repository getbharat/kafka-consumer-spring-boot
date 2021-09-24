package com.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kafka.config", "com.kafka.consumer.service"})
public class KafkaConsumerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerSpringBootApplication.class, args);
	}

}
