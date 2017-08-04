package pl.com.garage.works.hard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Justyna Salacinska
 */
@Controller
public class ControllerApp {

    @RequestMapping("showRepairMenu.html")
    public ModelAndView showRepairMenu(){
        return new ModelAndView("repairView/repairMenu");
    }

    @RequestMapping("showClientMenu.html")
    public ModelAndView showClientMenu(){
        return new ModelAndView("clientView/clientMenu");
    }


    @RequestMapping("showEmployeeMenu.html")
    public ModelAndView showEmployeeMenu(){
        return new ModelAndView("employeeView/employeeMenu");
    }


    @RequestMapping("showPartMenu.html")
    public ModelAndView showPartMenu(){
        return new ModelAndView("partView/partMenu");
    }

    @RequestMapping("showOrderMenu.html")
    public ModelAndView showOrderMenu(){
        return new ModelAndView("orderView/orderMenu");
    }



}
