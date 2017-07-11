package pl.com.garage.works.hard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Repair;
import pl.com.garage.works.hard.service.ClientService;
import pl.com.garage.works.hard.service.RepairService;

import javax.validation.Valid;

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



    @RequestMapping(value = "addClient.html",method = RequestMethod.GET)
    public ModelAndView showAddClient(){
        return new ModelAndView("addClient","client", new Client());
    }

    @RequestMapping(value = "addClient.html",method = RequestMethod.POST)
    public ModelAndView addClient(@Valid Client client, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("addClient");
        }
        clientService.saveClient(client);
        return new ModelAndView("addClientConfirmation");
    }

    @RequestMapping(value = "allClients.html")
    public ModelAndView showAllClients(){
        return new ModelAndView(
                "allClients","clientList", clientService.findAllClients());
    }

    @RequestMapping(value = "editClient.html", method = RequestMethod.GET)
    public ModelAndView showEditClient(@RequestParam int id){
        return new ModelAndView(
                "editClient","client", clientService.findClientById(id));
    }

    @RequestMapping(value = "editClient.html",method = RequestMethod.POST)
    public ModelAndView editClient(@Valid Client client, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("editClient");
        }
        clientService.updateClient(client.getClientName(), client);
        return new ModelAndView("editClientConfirmation");
    }




}
