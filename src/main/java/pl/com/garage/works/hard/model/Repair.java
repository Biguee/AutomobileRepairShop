package pl.com.garage.works.hard.model;

import java.util.Date;

/**
 * Created by 8760w on 2017-07-04.
 */
public class Repair {

    private String repairName;
    private double repairCost;
    private Date repairTime;

    public Repair(String repairName, double repairCost, Date repairTime) {
        this.repairName = repairName;
        this.repairCost = repairCost;
        this.repairTime = repairTime;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "repairName='" + repairName + '\'' +
                ", repairCost=" + repairCost +
                ", repairTime=" + repairTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Repair repair = (Repair) o;

        if (Double.compare(repair.repairCost, repairCost) != 0) return false;
        if (repairName != null ? !repairName.equals(repair.repairName) : repair.repairName != null) return false;
        return repairTime != null ? repairTime.equals(repair.repairTime) : repair.repairTime == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = repairName != null ? repairName.hashCode() : 0;
        temp = Double.doubleToLongBits(repairCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (repairTime != null ? repairTime.hashCode() : 0);
        return result;
    }
}
