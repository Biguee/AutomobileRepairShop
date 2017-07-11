package pl.com.garage.works.hard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Employee;
import pl.com.garage.works.hard.model.Repair;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    private List<Employee> employeeList;

    private Employee employee;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    public List<Employee> findAll(){
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public Employee findEmployeeById(int id) {
        return sessionFactory.getCurrentSession().find(Employee.class, id);
    }

    @Override
    public List<Employee> addEmployee(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    @Override
    public void updateEmployee(String employeeName, Employee employee) {
            employee.setEmployeeName(employeeName);
            sessionFactory.getCurrentSession().update(employeeName, employee);
    }

    @Override
    public Employee findBySurname(String surname) {
        //for (int i = 0; i < employeeList.size(); i++) {
        return null;

        }

    @Override
    public List<Employee> findAllEmployee() {
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();

        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        criteriaQuery.from(Employee.class);

        return getCurrentSession().createQuery(criteriaQuery).list();
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    }

