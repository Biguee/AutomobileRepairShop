package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.RepairDao;

/**
 * Created by 8760w on 2017-07-04.
 */
@Service
public class RepairService {
    @Autowired
    private RepairDao repairDao;


}
