package pl.com.garage.works.hard.gui;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.service.ClientService;

import java.util.List;

/**
 * Created by 8760w on 2017-07-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ClientServiceTest extends AbstractTransactionalJUnit4SpringContextTests{


    //Przerobic testy na hibernate
//    @Autowired
//    private ClientService clientService;
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Before
//    public void before(){
//        jdbcTemplate.execute("truncate clients");
//        clientService.addClient("kasia", "kot", "123");
//        clientService.addClient("pawel", "siekawa", "456");
//        clientService.addClient("monika", "gadzina", "789");
//
//    }
//
//    @Test
//    public void shouldAddClient() throws Exception{
//        //given
//
//        //when
//        clientService.addClient("elzbieta", "salacinska", "955-141-52-10");
//        //then
//        Long countClients = jdbcTemplate.queryForObject("select count(*) from clients where name like ?", Long.class, "elzbieta");
//        Assertions.assertThat(countClients).isEqualTo(1);
//    }
//
//    @Test
//    public void shouldFindClientById() throws Exception{
//        //given
//        Integer id = jdbcTemplate.queryForObject("Select max(id) from clients", Integer.class);
//        //when
//        Client outputClient = clientService.findClientbyId(id);
//
//        //then
//        Assertions.assertThat(outputClient.getClientName()).isEqualTo("monika");
//
//    }
//
//    @Test
//    public void shouldUpdateNipBySurname() throws Exception{
//        //given
//        Client client = new Client(0,"marek", "siekawa", "789");
//        //when
//        clientService.updateClient(client, client.getId());
//        //then
//        String inputNip = jdbcTemplate.queryForObject("select nip from clients where surname=?", String.class, "siekawa");
//        Assertions.assertThat(inputNip).isEqualTo("789");
//    }
//
//    @Test
//    public void shouldDeleteClientById() throws Exception{
//    //given
//        Integer id = jdbcTemplate.queryForObject("Select max(id) from clients", Integer.class);
//    //when
//    clientService.deleteClientById(id);
//        Integer countClients = jdbcTemplate.queryForObject("select count(*) from clients", Integer.class);
//    //then
//        Assertions.assertThat(countClients).isEqualTo(2);
//    }
//
//    @Test
//    public void shouldFindAllClients() throws Exception{
//        //given
//
//        //when
//        List<Client> outputClientList = clientService.findAllClients();
//        //then
//        Assertions.assertThat(outputClientList.size()).isEqualTo(3);
//    }




}

