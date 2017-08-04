//package pl.com.garage.works.hard.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import pl.com.garage.works.hard.dao.*;
//import pl.com.garage.works.hard.model.*;
//
//import java.util.List;
//
///**
// * Created by 8760w on 2017-07-04.
// */
//@Service
//public class OrderService {
//    @Autowired
//    private EmployeeDao employeeDao;
//    @Autowired
//    private ClientDao clientDao;
//    @Autowired
//    private OrderDao orderDao;
//    @Autowired
//    private PartDao partDao;
//    @Autowired
//    private RepairDao repairDao;
//
//    //create
//    public void saveOrder(Order order){
//
//        order.getParts();
//        order.getClient();
//        order.getEmployee();
//        order.getRepairs();
//        orderDao.saveOrder(order);
//
//    }
//    //read
//    public Part findPartById(Integer id){ return partDao.findPartById(id); }
//    //update
//    public void updatePart(String partNumber, Part part){ partDao.updatePart(partNumber, part);}
//    //delete
//    public void deletePart(Part part){ partDao.deletePart(part);}
//
//
//}
