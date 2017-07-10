package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.EmployeeDao;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Employee;
import pl.com.garage.works.hard.model.Repair;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public void saveEployee(Employee employee) { employeeDao.saveEmployee(employee);}

    public List<Employee> findAll(){
        return employeeDao.findAll();
    }

    public List<Employee> addEmployee(Employee employee){
        return employeeDao.addEmployee(employee);
    }

    public Employee findBySurname(String surname){
        return employeeDao.findBySurname(surname);
    }

    public List<Employee> findAllEmployee(){ return employeeDao.findAllEmployee(); }


}
