package com.enigma.notification.service;

import com.enigma.notification.entity.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    JavaMailSender javaMailSender;

    @Override
    public void sendMail(Mail mail) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mail.getEmailFrom());
        message.setTo(mail.getEmailTo());
        message.setSubject(mail.getEmailSubject());
        message.setText(mail.getEmailBody());
        javaMailSender.send(message);

    }
}
