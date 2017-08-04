package pl.com.garage.works.hard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.garage.works.hard.model.Repair;
import pl.com.garage.works.hard.service.RepairService;

import javax.validation.Valid;

/**
 * Created by 8760w on 2017-07-07.
 */
@Controller
public class RepairController {

    private RepairService repairService;

    @Autowired
    public RepairController(RepairService repairService) {
        this.repairService = repairService;
    }

    @RequestMapping(value = "addRepair.html",method = RequestMethod.GET)
    public ModelAndView showAddRepair(){
        return new ModelAndView("/repairView/addRepair","repair", new Repair());
    }

    @RequestMapping(value = "addRepair.html",method = RequestMethod.POST)
    public ModelAndView addRepair(@Valid Repair repair, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/repairView/addRepair");
        }
        repairService.saveRepair(repair);
        return new ModelAndView("/repairView/addRepairConfirmation");
    }

    @RequestMapping(value = "allRepairs.html")
    public ModelAndView showAllRepairs(){
        return new ModelAndView(
                "/repairView/allRepairs","repairList", repairService.findAllRepair());
    }

    @RequestMapping(value = "removeRepair.html")
    public ModelAndView removeRepair(@Valid Repair repair){
        repairService.deleteRepair(repair);
        return new ModelAndView("/repairView/removeRepairConfirmation");
    }

    @RequestMapping(value = "editRepair.html", method = RequestMethod.GET)
    public ModelAndView showEditRepair(@RequestParam int id){
        return new ModelAndView(
                "/repairView/editRepair","repair", repairService.findRepairById(id));
    }

    @RequestMapping(value = "editRepair.html",method = RequestMethod.POST)
    public ModelAndView editRepair(@Valid Repair repair, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/repairView/editRepair");
        }
        repairService.updateRepair(repair.getRepairCost(), repair);
        return new ModelAndView("/repairView/editRepairConfirmation");
    }

}
