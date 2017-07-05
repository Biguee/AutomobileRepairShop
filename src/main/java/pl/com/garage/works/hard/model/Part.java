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
    private int id;
    @Column(name = "part_name")
    private String partName;
    @Column(name = "part_number")
    private String partNumber;
    @Column(name = "price_wholesale")
    private double priceWholesale;
    @Column(name = "price_retail")
    private double priceRetail;

    public Part(String partName, String partNumber, double priceWholesale, double priceRetail) {
        this.partName = partName;
        this.partNumber = partNumber;
        this.priceWholesale = priceWholesale;
        this.priceRetail = priceRetail;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", partName='" + partName + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", priceWholesale=" + priceWholesale +
                ", priceRetail=" + priceRetail +
                '}';
    }
}
