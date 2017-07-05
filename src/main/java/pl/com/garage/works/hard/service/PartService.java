package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.PartDao;
import pl.com.garage.works.hard.model.Part;

/**
 * Created by 8760w on 2017-07-05.
 */
@Service
public class PartService {

    @Autowired
    private PartDao partDao;

    public void savePart(Part part){
        partDao.savePart(part);
    }



}
