package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Employee;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private List<Employee> employeeList;

    private Employee employee;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    public List<Employee> findAll(){
        return employeeList;
    }

    @Override
    public List<Employee> addEmployee(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    @Override
    public Employee findBySurname(String surname) {
        //for (int i = 0; i < employeeList.size(); i++) {


        }

    }
}
