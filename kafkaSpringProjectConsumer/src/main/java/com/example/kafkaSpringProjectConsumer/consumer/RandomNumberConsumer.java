package com.example.kafkaSpringProjectConsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class RandomNumberConsumer {

    @KafkaListener(topics = "GaneraKafka")
    public void consume(String message) throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        System.out.println(String.format("%s consumed %s", hostName, message));
    }

}