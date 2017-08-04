//package pl.com.garage.works.hard.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import pl.com.garage.works.hard.model.*;
//import pl.com.garage.works.hard.service.*;
//
//import javax.persistence.Column;
//import javax.validation.Valid;
//
///**
// * @author Justyna Sałacińska
// */
//@Controller
//public class OrderController {
//
//    private OrderService orderService;
//    private ClientService clientService;
//    private EmployeeService employeeService;
//    private PartService partService;
//    private RepairService repairService;
//
////    @ModelAttribute("order")
////    public Order getOrderObject() {
////        return new Order();
////    }
//    @Autowired
//    public OrderController(OrderService orderService, ClientService clientService, EmployeeService employeeService, PartService partService, RepairService repairService) {
//        this.orderService = orderService;
//        this.clientService = clientService;
//        this.employeeService = employeeService;
//        this.partService = partService;
//        this.repairService = repairService;
//    }
//
//    @RequestMapping(value = "addOrder.html",method = RequestMethod.GET)
//    public ModelAndView showAddOrder(){
//        return new ModelAndView("/orderView/addOrder","order", new Order());
//    }
//
//    @RequestMapping(value = "addOrder.html",method = RequestMethod.POST)
//    public ModelAndView addOrder(@Valid Order order,
//                                 BindingResult bindingResult){
//        if (bindingResult.hasErrors()){
//            return new ModelAndView("/partView/addOrder");
//        }
//        orderService.saveOrder(order);
//
//        return new ModelAndView("/partView/addOrderConfirmation");
//    }
//
////    @RequestMapping(value = "allOrders.html")
////    public ModelAndView showAllOrders(){
////        return new ModelAndView(
////                "/partView/allOrders","orderList", orderService.     findAllParts());
////
////    }
//
//
//}
