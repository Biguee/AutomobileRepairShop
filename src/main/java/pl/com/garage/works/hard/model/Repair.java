package pl.com.garage.works.hard.model;

import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by 8760w on 2017-07-04.
 */
@Entity
@Table(name = "repairs")
public class Repair {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "repair_name")
    private String repairName;
    @Column(name = "repair_cost")
    private double repairCost;
    @Column(name = "repair_time")
    private Date repairTime;

    public Repair(String repairName, double repairCost, Date repairTime) {
        this.repairName = repairName;
        this.repairCost = repairCost;
        this.repairTime = repairTime;
    }

    public Repair() {
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", repairName='" + repairName + '\'' +
                ", repairCost=" + repairCost +
                ", repairTime=" + repairTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }
}
