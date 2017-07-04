package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.PartDao;
import pl.com.garage.works.hard.dao.StockDao;

/**
 * Created by 8760w on 2017-07-04.
 */
@Service
public class StockService {
    @Autowired
    private PartDao partDao;
    @Autowired
    private StockDao stockDao;





}
