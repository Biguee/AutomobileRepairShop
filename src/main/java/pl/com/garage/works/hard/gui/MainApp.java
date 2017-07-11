package pl.com.garage.works.hard.gui;

import javafx.application.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Employee;
import pl.com.garage.works.hard.service.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 8760w on 2017-07-04.
 */
public class MainApp {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");


        ClientService clientService = applicationContext.getBean(ClientService.class);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        RepairService repairService = applicationContext.getBean(RepairService.class);
//        StockService stockService = applicationContext.getBean(StockService.class);

        applicationContext.close();


    }


}
