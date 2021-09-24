package com.kafka.consumer.service;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class KafkaListener {
	
	@org.springframework.kafka.annotation.KafkaListener(topics = "Kafka_JSON__Example", groupId = "goup_id_json", containerFactory = "kafkaUserListenerContainerFactory")
	public void kafkaJsonConsumer(final User user) {
		System.out.println("Consumed Message "+ user);
	}
	
	@org.springframework.kafka.annotation.KafkaListener(topics = "Kafka_Example", groupId = "goup_id")
	public void kafkaConsumer(final String message) {
		System.out.println("Consumed Message "+ message);
	}
}
