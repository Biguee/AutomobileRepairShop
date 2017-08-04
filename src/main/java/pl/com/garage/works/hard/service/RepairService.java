package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.RepairDao;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.model.Repair;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Service
public class RepairService {
    @Autowired
    private RepairDao repairDao;

    //create
    public void saveRepair(Repair repair){
        repairDao.saveRepair(repair);
    }
    //read
    public Repair findRepairById(Integer id){
        return repairDao.findRepairById(id);
    }
    //update
    public void updateRepair(double repairCost, Repair repair){
        repairDao.updateRepair(repairCost, repair);
    }
    //delete
    public void deleteRepair(Repair repair){
        repairDao.deleteRepair(repair);
    }
    //list
    public List<Repair> findAllRepair(){
        return repairDao.findAllRepair();
    }

}
