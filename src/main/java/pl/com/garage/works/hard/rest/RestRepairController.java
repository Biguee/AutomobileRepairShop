package pl.com.garage.works.hard.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.garage.works.hard.model.Repair;
import pl.com.garage.works.hard.service.RepairService;

import java.util.List;

/**
 * Created by 8760w on 2017-07-10.
 */
@RestController
@RequestMapping(value = "/rest")
public class RestRepairController {



        @Autowired
        private RepairService repairService;


        // ...rest/list
        @RequestMapping(value = "/list")
        public List<Repair> listRepairCon(){
            List<Repair> allRepair = repairService.findAllRepair();
            return allRepair;
        }


        // ...rest/save3
        @RequestMapping(value = "/save3", method = RequestMethod.POST)
        //@ResponseBody
        public String saveRepair3(@RequestBody Repair repair){
            repairService.saveRepair(repair);
            return "Zapisano naprawe: " + repair.getRepairName();
        }

        @RequestMapping(value = "/save4", method = RequestMethod.PUT)
        public void saveRepair4(@RequestBody Repair repair){
            System.out.println("zapisano naprawe: " + repair.getRepairName());
            repairService.saveRepair(repair);

        }




}
