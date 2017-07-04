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
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by 8760w on 2017-07-04.
 */
public class MainApp {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();



        ClientService clientService = applicationContext.getBean(ClientService.class);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        RepairService repairService = applicationContext.getBean(RepairService.class);
        StockService stockService = applicationContext.getBean(StockService.class);

        entityManager.close();
        entityManagerFactory.close();

        applicationContext.close();







//        //ProductService productService = new ProductService();
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        //AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
//
//        //ProductService productService = (ProductService) applicationContext.getBean("productService");
//        //po nazwie:
//        ApplicationService applicationService = applicationContext.getBean(ApplicationService.class);
//        ApplicationService applicationService2 = applicationContext.getBean(ApplicationService.class);
//        ApplicationService applicationService3 = applicationContext.getBean(ApplicationService.class);
//
//        applicationService.doShopping();
//
//        applicationContext.close();
//
//
//
    }


}
