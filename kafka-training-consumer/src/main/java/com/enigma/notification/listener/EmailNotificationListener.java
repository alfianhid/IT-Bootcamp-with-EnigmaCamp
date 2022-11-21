package com.enigma.notification.listener;

import com.enigma.notification.entity.Mail;
import com.enigma.notification.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @Autowired
    MailService mailService;

    @KafkaListener(id = "foo", topics = "kafka_training")
    public void listener(String foo) throws InterruptedException {
        System.out.println(foo);
        Mail mail = new Mail();
        mail.setEmailFrom("bootcamp.enigma@gmail.com");
        mail.setEmailTo("jutionck@gmail.com");
        mail.setEmailSubject("Enigma Book Store - Transaction Notification");
        mail.setEmailBody(foo);
        mailService.sendMail(mail);
    }
}
