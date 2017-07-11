package pl.com.garage.works.hard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.service.ClientService;
import pl.com.garage.works.hard.service.PartService;

import javax.validation.Valid;

/**
 * Created by 8760w on 2017-07-11.
 */
@Controller
public class PartController {

    private PartService partService;

    @Autowired
    public PartController(PartService partService) {
        this.partService = partService;
    }

    @RequestMapping(value = "addPart.html",method = RequestMethod.GET)
    public ModelAndView showAddPart(){
        return new ModelAndView("/partView/addPart","part", new Part());
    }

    @RequestMapping(value = "addPart.html",method = RequestMethod.POST)
    public ModelAndView addPart(@Valid Part part, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/partView/addPart");
        }
        partService.savePart(part);
        return new ModelAndView("/partView/addPartConfirmation");
    }

    @RequestMapping(value = "allParts.html")
    public ModelAndView showAllParts(){
        return new ModelAndView(
                "/partView/allParts","partList", partService.findAllParts());

    }

    @RequestMapping(value = "editPart.html", method = RequestMethod.GET)
    public ModelAndView showEditPart(@RequestParam int id){
        return new ModelAndView(
                "/partView/editPart","part", partService.findPartById(id));
    }

    @RequestMapping(value = "editPart.html",method = RequestMethod.POST)
    public ModelAndView editPart(@Valid Part part, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/partView/editPart");
        }
        partService.updatePart(part.getPartNumber(), part);
        return new ModelAndView("/partView/editPartConfirmation");
    }

    @RequestMapping(value = "removePart.html")
    public ModelAndView removePart(@Valid Part part ){
        partService.deletePart(part);
        return new ModelAndView("/partView/removePartConfirmation");
    }


}
