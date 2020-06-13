package com.example.kafkaSpringProjectConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KafkaSpringProjectConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringProjectConsumerApplication.class, args);
	}

}
