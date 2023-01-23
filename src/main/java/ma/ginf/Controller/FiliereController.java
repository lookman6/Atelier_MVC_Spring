/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ginf.Controller;

//import com.universite.Model.*;
//import com.universite.Repository.Repository;
//import com.universite.Service.EleveService;
//import com.universite.Service.FiliereService;
//import com.universite.Service.Interface.Service;
import ma.ginf.Service.EleveService;
import ma.ginf.Service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dell
 */
@Controller
public class FiliereController {
    @Autowired
    private FiliereService serviceFiliere;
    
     @Autowired
    private EleveService serviceEleve;
     
     
    @RequestMapping(value={"/","/list"})
    public String Index(Model model)
    {
        //model.addAttribute("listfiliere", serviceFiliere.getRepository().findAll());
        //model.addAttribute("listeleve", serviceEleve.getRepository().findAll());
        model.addAttribute("listeleves", "Je suis content que tu t'affiches maintenant !");
        return "index";
    }
   @RequestMapping("/addFiliere")
   public String add(Model model) {
      //model.addAttribute("message", "Hello GENIE INFO !");
      return "addClass";
}

  
   
   /*@RequestMapping(value="/saveFiliere", method = RequestMethod.POST)
   public String save(Filieres filiere)
   {
       serviceFiliere.getRepository().add(filiere);
       return "redirect:/list";
   }*/
   
   /*@RequestMapping(value="/UpdateArticl", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Filieres filiere) {
        serviceFiliere.getRepository().update(filiere);
        return "redirect:/list";
    }*/
    /*@RequestMapping(value="/DeleteArticl", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Filieres filiere) {
        serviceFiliere.getRepository().remove(filiere);
        return "redirect:/list";
    }*/
    
    /*@RequestMapping("/EditArticl?code")
    public String edit( Model model,@PathVariable("code") String code)
    {
        Filieres art = serviceFiliere.getRepository().findById(code);
        model.addAttribute("art", art);
        model.addAttribute("code", code);
        return "Edit_Article";
    }*/
}
