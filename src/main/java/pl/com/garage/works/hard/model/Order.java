//package pl.com.garage.works.hard.model;
//
//import com.sun.org.apache.regexp.internal.RE;
//
//import javax.persistence.*;
//
//import java.util.List;
//
//import static javax.persistence.GenerationType.IDENTITY;
//
///**
// * @author Justyna Salacinska
// */
//
//@Table(name = "orders")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "id", unique = true, nullable = false)
//    private int id;
//    @ManyToOne
//    @Column(name = "client_id")
//    private Client client;
//    @ManyToOne
//    @Column(name = "employee_id")
//    private Employee employee;
//    @OneToMany
//    @Column(name = "parts_id")
//    private List<Part> parts;
//    @OneToMany(mappedBy = "order_id")
//    private List<Repair> repairs;
//
//    public Order(Client client, Employee employee, List<Part> parts, List<Repair> repairs) {
//        this.client = client;
//        this.employee = employee;
//        this.parts = parts;
//        this.repairs = repairs;
//    }
//
//    public Order() {
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "id=" + id +
//                ", client=" + client +
//                ", employee=" + employee +
//                ", parts=" + parts +
//                ", repairs=" + repairs +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public List<Part> getParts() {
//        return parts;
//    }
//
//    public void setParts(List<Part> parts) {
//        this.parts = parts;
//    }
//
//    public List<Repair> getRepairs() {
//        return repairs;
//    }
//
//    public void setRepairs(List<Repair> repairs) {
//        this.repairs = repairs;
//    }
//}
