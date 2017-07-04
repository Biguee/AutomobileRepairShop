package pl.com.garage.works.hard.model;

/**
 * Created by 8760w on 2017-07-04.
 */
public class Employee {

    private String employeeName;
    private String employeeSurname;
    private double salary;

    public Employee(String employeeName, String employeeSurname, double salary) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.salary = salary;
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
}
