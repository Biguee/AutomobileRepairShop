package pl.com.garage.works.hard.model;

/**
 * Created by 8760w on 2017-07-04.
 */
public class Order {

    private int OrderNumber;
    private Client client;
    private Employee employee;
    private Part part;
    private Repair repair;

    public Order(int orderNumber, Client client, Employee employee, Part part, Repair repair) {
        OrderNumber = orderNumber;
        this.client = client;
        this.employee = employee;
        this.part = part;
        this.repair = repair;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderNumber=" + OrderNumber +
                ", client=" + client +
                ", employee=" + employee +
                ", part=" + part +
                ", repair=" + repair +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (OrderNumber != order.OrderNumber) return false;
        if (client != null ? !client.equals(order.client) : order.client != null) return false;
        if (employee != null ? !employee.equals(order.employee) : order.employee != null) return false;
        if (part != null ? !part.equals(order.part) : order.part != null) return false;
        return repair != null ? repair.equals(order.repair) : order.repair == null;
    }

    @Override
    public int hashCode() {
        int result = OrderNumber;
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (employee != null ? employee.hashCode() : 0);
        result = 31 * result + (part != null ? part.hashCode() : 0);
        result = 31 * result + (repair != null ? repair.hashCode() : 0);
        return result;
    }
}
