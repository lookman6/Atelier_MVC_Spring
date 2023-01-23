/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ginf.Controller;

//import com.universite.Model.Eleves;
//import com.universite.Model.Filieres;
//import com.universite.Service.EleveService;
//import com.universite.Service.FiliereService;
//import com.universite.Service.Interface.Service;
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
public class EleveController {
    /*@Autowired
    private EleveService serviceEleve1;
    
    @Autowired
    private FiliereService serviceFiliere1;*/
    
    /* @RequestMapping(value={"/liste"})
    public String Index(Model model)
    {
        model.addAttribute("listfiliere", serviceFiliere1.getRepository().findAll());
        model.addAttribute("listeleve", serviceEleve1.getRepository().findAll());
        return "index";
    }*/
    
  /* @RequestMapping("/addStudent")
   public String add(Model model) {
      //model.addAttribute("message", "Hello GENIE INFO !");
      return "addStudent";
}*/

 
   
   /*@RequestMapping(value="/saveStudent", method = RequestMethod.POST)
   public String save(Eleves eleve)
   {
       serviceEleve1.getRepository().add(eleve);
       return "redirect:/liste";
   }*/
   
  /* @RequestMapping(value="/UpdateArticle", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Eleves eleve) {
        serviceEleve1.getRepository().update(eleve);
        return "redirect:/list";
    }
    @RequestMapping(value="/DeleteArticle", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Eleves eleve) {
        serviceEleve1.getRepository().remove(eleve);
        return "redirect:/list";
    }*/
    
   /* @RequestMapping("/EditArticle?code")
    public String edit( Model model,@PathVariable("code") String code)
    {
        Eleves art = serviceEleve1.getRepository().findById(code);
        model.addAttribute("art", art);
        model.addAttribute("code", code);
        return "Edit_Article";
    }*/
}
