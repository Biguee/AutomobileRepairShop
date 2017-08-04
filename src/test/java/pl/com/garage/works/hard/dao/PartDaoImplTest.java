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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 8760w on 2017-07-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class PartDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private PartDao partDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    Part part1 = new Part("toyota celica filtr oleju", "OP621", 23.87,  1);
    Part part2 = new Part("toyota celica uszczelniacz wału korbowego", "586668EL", 29.57,  1);

    @Before
    public void before(){
        jdbcTemplate.execute("truncate parts");
        //Part part3 = new Part("toyota celica zestaw sprzęgła", "3000771001SAC", 437.95, 215.00);
    }

    @Test
    public void shouldSavePart() throws Exception {
        //given

        //when
        partDao.savePart(new Part("toyota celica zestaw sprzęgła", "3000771001SAC", 437.95, 1));
        //then
        int countParts = jdbcTemplate.queryForObject("select count(*) from parts where part_number=?", Integer.class, "3000771001SAC");

        Assertions.assertThat(countParts).isEqualTo(1);
    }

    @Test
    public void shouldfindPartById() throws Exception {
        //given
        Part part1 = new Part("toyota celica filtr oleju", "OP621", 23.87, 1);
        partDao.savePart(part1);
        Integer id = jdbcTemplate.queryForObject("Select max(id) from parts", Integer.class);
        //when
        Part outputPart = partDao.findPartById(id);
        //then
        Assertions.assertThat(outputPart.getId()).isEqualTo(part1.getId());
    }

    @Test
    public void SouldUpdatePart() throws Exception {
        //given
        Part part1 = new Part("toyota celica filtr oleju", "OP621", 23.87,  1);
        partDao.savePart(part1);
        String no = "pp989";
        //when
        partDao.updatePart(no, part1);

        //then
        Assertions.assertThat(part1.getPartNumber()).isEqualTo(no);
    }

    @Test
    public void shouldDeletePart() throws Exception {
        //given
        Part part1 = new Part("toyota celica filtr oleju", "OP621", 23.87,  1);
        partDao.savePart(part1);

        //when
        partDao.deletePart(part1);
        //then
        Assertions.assertThat(part1.getPartName()).isEqualTo(null);
    }

    @Test
    public void findAllParts() throws Exception {
        //given
        Part part1 = new Part("toyota celica filtr oleju", "OP621", 23.87,  1);
        partDao.savePart(part1);
        Part part2 = new Part("toyota celica filtr oleju", "OP621", 23.87,  1);
        partDao.savePart(part2);
        List<Part> lista = Arrays.asList(part1, part2);

        //when
        List<Part> outputParts = partDao.findAllParts();
        //then
        Assertions.assertThat(lista.size()).isEqualTo(outputParts.size());
    }

}