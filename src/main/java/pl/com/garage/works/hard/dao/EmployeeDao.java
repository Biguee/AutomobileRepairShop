package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Employee;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */

public interface EmployeeDao {


    List<Employee> findAll();

    List<Employee> addEmployee(Employee employee);

    Employee findBySurname(String surname);
}
