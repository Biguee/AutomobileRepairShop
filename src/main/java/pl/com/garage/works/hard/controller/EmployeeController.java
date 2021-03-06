package pl.com.garage.works.hard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Employee;
import pl.com.garage.works.hard.model.Repair;
import pl.com.garage.works.hard.service.ClientService;
import pl.com.garage.works.hard.service.EmployeeService;

import javax.validation.Valid;

/**
 * Created by 8760w on 2017-07-10.
 */
@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @RequestMapping(value = "addEmployee.html",method = RequestMethod.GET)
    public ModelAndView showAddEmployee(){
        return new ModelAndView("/employeeView/addEmployee","employee", new Employee());
    }

    @RequestMapping(value = "addEmployee.html",method = RequestMethod.POST)
    public ModelAndView addEmployee(@Valid Employee employee, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/employeeView/addEmployee");
        }
        employeeService.saveEployee(employee);
        return new ModelAndView("/employeeView/addEmployeeConfirmation");
    }

    @RequestMapping(value = "allEmployees.html")
    public ModelAndView showAllEmployees(){
        return new ModelAndView(
                "/employeeView/allEmployees","employeeList", employeeService.findAllEmployee());
    }

    @RequestMapping(value = "editEmployee.html", method = RequestMethod.GET)
    public ModelAndView showEditEmployee(@RequestParam int id){
        return new ModelAndView(
                "/employeeView/editEmployee","employee",employeeService.findEmployeeById(id));

    }

    @RequestMapping(value = "editEmployee.html",method = RequestMethod.POST)
    public ModelAndView editEmployee(@Valid Employee employee, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/employeeView/editEmployee");
        }
        employeeService.updateEmployee(employee.getEmployeeName(), employee);
        return new ModelAndView("/employeeView/editEmployeeConfirmation");
    }

    @RequestMapping(value = "removeEmployee.html")
    public ModelAndView removeEmployee(@Valid Employee employee){
        employeeService.deleteEmployee(employee);
        return new ModelAndView("/employeeView/removeEmployeeConfirmation");
    }


}
