package pl.com.garage.works.hard.model;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
public class Part {

    private String partName;
    private List<Integer> partNumbers;
    private double priceWholesale;
    private double priceRetail;

    public Part(String partName, List<Integer> partNumbers, double priceWholesale, double priceRetail) {
        this.partName = partName;
        this.partNumbers = partNumbers;
        this.priceWholesale = priceWholesale;
        this.priceRetail = priceRetail;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partName='" + partName + '\'' +
                ", partNumbers=" + partNumbers +
                ", priceWholesale=" + priceWholesale +
                ", priceRetail=" + priceRetail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        if (Double.compare(part.priceWholesale, priceWholesale) != 0) return false;
        if (Double.compare(part.priceRetail, priceRetail) != 0) return false;
        if (partName != null ? !partName.equals(part.partName) : part.partName != null) return false;
        return partNumbers != null ? partNumbers.equals(part.partNumbers) : part.partNumbers == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = partName != null ? partName.hashCode() : 0;
        result = 31 * result + (partNumbers != null ? partNumbers.hashCode() : 0);
        temp = Double.doubleToLongBits(priceWholesale);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(priceRetail);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
