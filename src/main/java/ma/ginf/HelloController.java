/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ginf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author elhaddadmohamed
 */
@Controller
public class HelloController {

    @RequestMapping("/l")
    public String Index()
    {
        return "index";
    }
   @RequestMapping("/helloCtrl")
   public String printHello(Model model) {
      model.addAttribute("message", "Hello GENIE INFO !");
      return "hello";
}

         @RequestMapping("/Marhaba")
   public String printMarhaba(@RequestParam(value="name", required=false,
           defaultValue="Mohamed") String name, Model model) {
      model.addAttribute("message", "Marhba  My  name is "+name);
      return "Marhba";
}
   



}
