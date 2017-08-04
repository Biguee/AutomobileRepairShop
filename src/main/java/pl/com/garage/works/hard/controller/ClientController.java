package pl.com.garage.works.hard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Repair;
import pl.com.garage.works.hard.service.ClientService;
import pl.com.garage.works.hard.service.RepairService;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by 8760w on 2017-07-10.
 */
@Controller
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


//    @RequestMapping("processCountry")
//    public String processForm(@Valid Client client, BindingResult result)
//    {
//        if(result.hasErrors())
//        {
//            System.out.println("Validation Failed");
//            return "orderView/orderMenu";
//        }
//        else
//        {
//            System.out.println("Validated Successfully");
//            return "orderView/orderMenuConfirmation";
//        }
//    }



    @RequestMapping(value = "addClient.html",method = RequestMethod.GET)
    public ModelAndView showAddClient(){
        return new ModelAndView("/clientView/addClient","client", new Client());
    }

    @RequestMapping(value = "addClient.html",method = RequestMethod.POST)
    public ModelAndView addClient(@Valid Client client, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/clientView/addClient");
        }
        clientService.saveClient(client);
        return new ModelAndView("/clientView/addClientConfirmation");
    }

    @RequestMapping(value = "allClients.html")
    public ModelAndView showAllClients(){
        return new ModelAndView(
                "/clientView/allClients","clientList", clientService.findAllClients());
    }

    @RequestMapping(value = "editClient.html", method = RequestMethod.GET)
    public ModelAndView showEditClient(@RequestParam int id){
        return new ModelAndView(
                "/clientView/editClient","client", clientService.findClientById(id));
    }

    @RequestMapping(value = "editClient.html",method = RequestMethod.POST)
    public ModelAndView editClient(@Valid Client client, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/clientView/editClient");
        }
        clientService.updateClient(client.getClientName(), client);
        return new ModelAndView("/clientView/editClientConfirmation");
    }

    @RequestMapping(value = "removeClient.html")
    public ModelAndView removeRepair(@Valid Client client){
        clientService.deleteClient(client);
        return new ModelAndView("/clientView/removeClientConfirmation");
    }



}
