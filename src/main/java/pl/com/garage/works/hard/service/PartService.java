package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.PartDao;
import pl.com.garage.works.hard.dao.RepairDao;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.model.Repair;

import java.util.List;

/**
 * Created by 8760w on 2017-07-11.
 */
@Service
public class PartService {

    @Autowired
    private PartDao partDao;

    //create
    public void savePart(Part part){
        partDao.savePart(part);
    }
    //read
    public Part findPartById(Integer id){ return partDao.findPartById(id); }
    //update
    public void updatePart(String partNumber, Part part){ partDao.updatePart(partNumber, part);}
    //delete
    public void deletePart(Part part){ partDao.deletePart(part);}
    //list
    public List<Part> findAllParts(){return partDao.findAllParts();}

}
