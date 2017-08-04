package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Created by 8760w on 2017-07-10.
 */
@Service
public class MailService {

    @Autowired
    private MailSender mailSender;

    public void sendEmail(){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("aksjofqwl@o2.pl");
        message.setTo("aksjofqwl@o2.pl");

        message.setSubject("hry hry hry");
        message.setText("wiadomosc ^_^");


        mailSender.send(message);

    }



}
