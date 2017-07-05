package pl.com.garage.works.hard.dao;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.service.PartService;

import static org.junit.Assert.*;

/**
 * Created by 8760w on 2017-07-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class PartDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private PartService partService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void before(){
        jdbcTemplate.execute("truncate parts");
        //Part part1 = new Part("toyota celica filtr oleju", "OP621", 23.87, 10.00);
        //Part part2 = new Part("toyota celica uszczelniacz wału korbowego", "586668EL", 29.57, 12.00);
        //Part part3 = new Part("toyota celica zestaw sprzęgła", "3000771001SAC", 437.95, 215.00);
    }

    @Test
    public void savePart() throws Exception {
        //given

        //when
        partService.savePart(new Part("toyota celica zestaw sprzęgła", "3000771001SAC", 437.95, 215.00));
        //then
        int countParts = jdbcTemplate.queryForObject("select count(*) from parts where part_number=?", Integer.class, "3000771001SAC");

        Assertions.assertThat(countParts).isEqualTo(1);
    }

    @Test
    public void findPartByPartNumber() throws Exception {
    }

    @Test
    public void updatePart() throws Exception {
    }

    @Test
    public void deletePart() throws Exception {
    }

    @Test
    public void findAllParts() throws Exception {
    }

}