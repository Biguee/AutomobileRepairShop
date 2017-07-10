package pl.com.garage.works.hard.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by 8760w on 2017-07-04.
 */
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_surname")
    private String employeeSurname;
    @Column(name = "employee_salary")
    private double salary;

    public Employee(String employeeName, String employeeSurname, double salary) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSurname='" + employeeSurname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (employeeName != null ? !employeeName.equals(employee.employeeName) : employee.employeeName != null)
            return false;
        return employeeSurname != null ? employeeSurname.equals(employee.employeeSurname) : employee.employeeSurname == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = employeeName != null ? employeeName.hashCode() : 0;
        result = 31 * result + (employeeSurname != null ? employeeSurname.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
