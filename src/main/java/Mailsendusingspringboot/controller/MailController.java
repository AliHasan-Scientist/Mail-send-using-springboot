package Mailsendusingspringboot.controller;

import Mailsendusingspringboot.mail.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    public String fromMail = "informativepath0987@gmail.com";
    @Autowired
    private SendMailService mailService;

    @GetMapping("/mail")
    public String testMail() {

        mailService.sendSimpleMail(fromMail, "royalihasan0987@gmail.com", "Hello Our Supporter", "Welcome");
        return "Mail send Successfully";
    }
}
