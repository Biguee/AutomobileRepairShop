package pl.com.garage.works.hard.model;

import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Justyna Salacinska
 */
@Entity
@Table(name = "repairs")
public class Repair {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "repair_name")
    private String repairName;
    @Column(name = "repair_cost")
    private double repairCost;
    @Column(name = "repair_time")
    private Integer repairTime;

    public Repair(String repairName, double repairCost, Integer repairTime) {
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

    public Integer getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Integer repairTime) {
        this.repairTime = repairTime;
    }
}
