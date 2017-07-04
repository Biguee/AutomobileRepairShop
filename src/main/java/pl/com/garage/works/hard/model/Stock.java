package pl.com.garage.works.hard.model;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
public class Stock {

    private List<Part> partsList;

    public Stock(List<Part> partsList) {
        this.partsList = partsList;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "partsList=" + partsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        return partsList != null ? partsList.equals(stock.partsList) : stock.partsList == null;
    }

    @Override
    public int hashCode() {
        return partsList != null ? partsList.hashCode() : 0;
    }
}
