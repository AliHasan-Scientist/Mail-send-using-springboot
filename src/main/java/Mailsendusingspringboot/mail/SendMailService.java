package Mailsendusingspringboot.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    @Autowired
    private MailSender mailSender;

    public void sendSimpleMail(String fromMail, String toMail, String body, String subject) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromMail);
        message.setTo(toMail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
    }
}
