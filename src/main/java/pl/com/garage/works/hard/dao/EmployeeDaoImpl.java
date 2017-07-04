package pl.com.garage.works.hard.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Employee;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class EmployeeDaoImpl extends AbstractDaoImpl<Employee> implements EmployeeDao {


    public EmployeeDaoImpl(EntityManager entityManager) {
        super(entityManager, Employee.class);
    }

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

        return null;
        }

    }

