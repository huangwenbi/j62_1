package org.java.dao.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *11
 */
@Controller
public class InitContriller {

    @RequestMapping("init/{jake}")
   public String init(@PathVariable("jake") String jake, Model model){
       model.addAttribute("user",jake);
       return "/ok";
   }
}
