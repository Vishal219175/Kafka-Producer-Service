package com.example.Apache_Kafka_Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducer1 {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC_NAME_1 = "topic1";

    @GetMapping("/sendToTopic1")
    public String sendMessageToTopic1(@RequestParam String message) {
        kafkaTemplate.send(TOPIC_NAME_1, message);
        return "Message sent to Topic1: " + message;
    }
}