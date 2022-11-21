package com.enigma.kafka.model;

public class EmailMessage {

    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    private String emailBody;

    public EmailMessage(String emailFrom, String emailTo, String emailSubject, String emailBody) {
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }
}
