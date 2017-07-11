package pl.com.garage.works.hard.model;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by 8760w on 2017-07-04.
 */
@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "stock_name")
    private String stockName;


    @OneToMany(mappedBy = "stock",cascade = {CascadeType.ALL})
    private List<Part> partsList;

    @OneToMany(mappedBy = "stock",cascade = {CascadeType.ALL})
    private List<Part> partsToOrderList;


    public Stock(String stockName) {
        this.stockName = stockName;
    }

    public Stock() {
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", stockName='" + stockName + '\'' +
                ", partsList=" + partsList +
                ", partsToOrderList=" + partsToOrderList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public List<Part> getPartsList() {
        return partsList;
    }

    public void setPartsList(List<Part> partsList) {
        this.partsList = partsList;
    }

    public List<Part> getPartsToOrderList() {
        return partsToOrderList;
    }

    public void setPartsToOrderList(List<Part> partsToOrderList) {
        this.partsToOrderList = partsToOrderList;
    }
}
