package pl.com.garage.works.hard.rest;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import pl.com.garage.works.hard.model.Repair;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created by 8760w on 2017-07-10.
 */
public class RestRepairControllerTest {

    private static final String BASE_URL = "http://localhost:8080/automobilerepairshop";

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldListRepairs() throws Exception {
        //given
        Repair[] repairs = restTemplate.getForObject(BASE_URL + "/rest/list", Repair[].class);
        //when
        assertThat(repairs).isNotNull();
        assertThat(repairs.length).isGreaterThan(0);
        //then
    }

    @Test
    public void shouldSaveRepair3() throws Exception {
        //given
        Repair repair = new Repair("wymiana sprzegla", 500, 2);
        //when
        String response = restTemplate.postForObject(BASE_URL + "/rest/save3", repair, String.class);
        //then
        assertThat(response).contains("wymiana sprzegla");
    }

    @Test
    public void shouldSaveRepair4() throws Exception {
        //given
        Repair repair = new Repair("wymiana sprzegla", 500, 2);
        //when
        restTemplate.put(BASE_URL + "/rest/save4", repair);
        //then
    }



}