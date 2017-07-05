package pl.com.garage.works.hard.service;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.works.hard.dao.PartDao;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.model.Repair;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 8760w on 2017-07-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class RepairServiceTest  extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private RepairService repairService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void before(){
        jdbcTemplate.execute("truncate repairs");
        repairService.saveRepair(new Repair("wymiana klocków przód", 100, Date.from(Instant.now())));
    }


    @Test
    public void shouldSaveRepair() throws Exception {
        //given
        Repair repair1 = new Repair("wymiana filtru oleju + olej", 50, Date.from(Instant.now()));
        //when
        repairService.saveRepair(repair1);
        //then
        int countRepairs = jdbcTemplate.queryForObject("select count(*) from repairs where repair_cost=?", Integer.class, 50);
        Assertions.assertThat(countRepairs).isEqualTo(1);
    }

    @Test
    public void findRepairById() throws Exception {
        //given
        Integer id = jdbcTemplate.queryForObject("Select max(id) from repairs", Integer.class);
        //when
        Repair repair = repairService.findRepairById(id);
        //then
        Assertions.assertThat(repair.getRepairCost()).isEqualTo(100);
    }

    @Test
    public void updateRepair() throws Exception {
        //given
        double cost = 500.0;
        Repair repair = new Repair("wymiana filtru oleju + olej", 50, Date.from(Instant.now()));
                //jdbcTemplate.queryForObject("select * from repairs where repair_cost=?", Repair.class, 100);
        repairService.saveRepair(repair);

        //when
        repairService.updateRepair(cost, repair);
        //jdbcTemplate.queryForObject("Select repair_cost from repairs where repair_cost=?", Double.class, 50);

        //then
        Assertions.assertThat(repair.getRepairCost()).isEqualTo(500.0);
    }

    @Test
    public void deleteRepair() throws Exception {
        // todo
    }

    @Test
    public void findAllRepair() throws Exception {
        //given

        //when
        List<Repair> outputRepairs = repairService.findAllRepair();
        //then
        Assertions.assertThat(outputRepairs.size()).isEqualTo(1);
    }

}