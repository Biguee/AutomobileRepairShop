package pl.com.garage.works.hard.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by 8760w on 2017-07-04.
 */
@Entity
@Table(name = "parts")
public class Part {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "part_name")
    private String partName;
    @Column(name = "part_number")
    private String partNumber;
    @Column(name = "price_wholesale")
    private double priceWholesale;
    @Column(name = "price_retail")
    private double priceRetail;
    @Column(name = "amount")
    private Integer amount;

    public Part(String partName, String partNumber, double priceWholesale, double priceRetail, Integer amount) {
        this.partName = partName;
        this.partNumber = partNumber;
        this.priceWholesale = priceWholesale;
        this.priceRetail = priceRetail;
        this.amount = amount;
    }

    public Part() {
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", partName='" + partName + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", priceWholesale=" + priceWholesale +
                ", priceRetail=" + priceRetail +
                ", amount=" + amount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public double getPriceWholesale() {
        return priceWholesale;
    }

    public void setPriceWholesale(double priceWholesale) {
        this.priceWholesale = priceWholesale;
    }

    public double getPriceRetail() {
        return priceRetail;
    }

    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
