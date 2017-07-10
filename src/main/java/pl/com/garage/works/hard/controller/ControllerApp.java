package pl.com.garage.works.hard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 8760w on 2017-07-09.
 */
@Controller
public class ControllerApp {

    @RequestMapping("showRepairMenu.html")
    public ModelAndView showEmployeeMenu(){
        return new ModelAndView("repairMenu");
    }




}
