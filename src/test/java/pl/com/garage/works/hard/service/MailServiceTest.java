package pl.com.garage.works.hard.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 8760w on 2017-07-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void shouldSendMail() throws Exception{

        mailService.sendEmail();

    }

}