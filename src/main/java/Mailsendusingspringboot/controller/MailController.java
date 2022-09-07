package Mailsendusingspringboot.controller;

import Mailsendusingspringboot.mail.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {
    public String fromMail = "informativepath0987@gmail.com";
    @Autowired
    private SendMailService mailService;
    public static final String path = "C:\\Users\\Roy Ali Hasan\\Documents\\Java Projects\\RESTful-Web-APIs-using-MariaDB\\src\\main\\java\\RESTfulWebAPIsusingMariaDB\\assets\\roy.jpg";

    @GetMapping("/mail")
    public String testMail() {

        mailService.sendSimpleMail(fromMail, "royalihasan0987@gmail.com", "Hello Our Supporter", "Welcome");

        return "Mail send Successfully";
    }

    @GetMapping("/mail/attachment")
    public String attachment() throws MessagingException {

        mailService.sendMailWithAttachments(fromMail, "royalihasan0987@gmail.com", "Hello Our Supporter", "Welcome", path);

        return "Mail send Successfully";
    }
}
