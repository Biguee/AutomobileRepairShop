package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Employee;
import pl.com.garage.works.hard.model.Repair;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */

public interface EmployeeDao {


    List<Employee> findAll();

    void saveEmployee(Employee employee);

    List<Employee> addEmployee(Employee employee);

    //update
    void updateEmployee(String employeeName, Employee employee);

    Employee findBySurname(String surname);

    //read
    Employee findEmployeeById(int id);

    //delete
    void deleteEmployee(Employee employee);


    List<Employee> findAllEmployee();
}
