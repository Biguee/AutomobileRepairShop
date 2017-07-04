package pl.com.garage.works.hard.model;

import javax.persistence.*;

/**
 * Created by 8760w on 2017-07-04.
 */
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String employeeName;
    private String employeeSurname;
    private double salary;

    public Employee(int id, String employeeName, String employeeSurname, double salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSurname='" + employeeSurname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
