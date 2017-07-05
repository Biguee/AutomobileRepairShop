package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.model.Repair;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */

public interface RepairDao {

    //create
    void saveRepair(Repair repair);
    //read
    Repair findRepairById(Integer id);
    //update
    void updateRepair(double repairCost, Repair repair);
    //delete
    void deleteRepair(Integer id, Repair repair);
    //list
    List<Repair> findAllRepair();

}
