package com.enigma.kafka.service;

import com.enigma.kafka.model.EmailMessage;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ProducerService {

    public void sendMessage(EmailMessage message) throws JsonProcessingException;
}
