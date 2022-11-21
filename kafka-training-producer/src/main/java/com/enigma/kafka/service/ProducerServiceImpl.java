package com.enigma.kafka.service;

import com.enigma.kafka.config.KafkaConfig;
import com.enigma.kafka.model.EmailMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void sendMessage(EmailMessage message) throws JsonProcessingException {
        String emailMessage = this.objectMapper.writeValueAsString(message);
        this.kafkaTemplate.send(KafkaConfig.TOPIC, emailMessage);
    }
}
