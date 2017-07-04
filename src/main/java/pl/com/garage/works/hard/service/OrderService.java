package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.*;

/**
 * Created by 8760w on 2017-07-04.
 */
@Service
public class OrderService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private ClientDao clientDao;
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private PartDao partDao;
    @Autowired
    private RepairDao repairDao;


}
