package com.example.Apache_Kafka_Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducer2 {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC_NAME_2 = "topic2";

    @GetMapping("/sendToTopic2")
    public String sendMessageToTopic2(@RequestParam String message) {
        kafkaTemplate.send(TOPIC_NAME_2, message);
        return "Message sent to Topic2: " + message;
    }
}