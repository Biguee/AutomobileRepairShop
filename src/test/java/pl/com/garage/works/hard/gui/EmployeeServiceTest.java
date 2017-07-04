package pl.com.garage.works.hard.gui;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.works.hard.dao.EmployeeDao;
import pl.com.garage.works.hard.dao.EmployeeDaoImpl;
import pl.com.garage.works.hard.model.Employee;
import pl.com.garage.works.hard.service.EmployeeService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * Created by 8760w on 2017-07-04.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeDaoImpl employeeDao;


    @Before
    public void before(){
        Employee inputEmployee1 = new Employee("Pawel", "Siekawa", 10_000);
        Employee inputEmployee2 = new Employee("Lukasz", "Artym", 3_000);
        List<Employee> inputEmployeeList = new ArrayList<>();
        inputEmployeeList.add(inputEmployee1);
        inputEmployeeList.add(inputEmployee2);
        employeeDao.setEmployeeList(inputEmployeeList);

    }

    @Test
    public void shouldReturnAllWorkers() throws Exception{
     //given

     //when
        List<Employee> outputEmployeeList = employeeService.findAll();
     //then
        assertFalse(outputEmployeeList.isEmpty());
        assertEquals(outputEmployeeList.size(), 2);
    }

    @Test
    public void shouldAddNewWorker() throws Exception{
    //given

    //when
        List<Employee> outputEmployeeList = employeeService.addEmployee(new Employee("Janusz", "Kozioł", 3_000));
    //then
        assertEquals(outputEmployeeList.size(), 3);
    }

    @Test
    public void shouldFindWorkerBySurname() throws Exception{
        //given

        //when
        Employee employee = employeeService.findBySurname("Siekawa");
        //then
        assertEquals();

    }

    @Test
    public void shouldEditWorker() throws Exception{

    }

}
