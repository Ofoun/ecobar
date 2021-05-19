package com.ofoun.ecobar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class MainController {
 
   @RequestMapping(value = { "/", "/ecobar_de" })
    public String staticResource(Model model) {
        return "index";
    }
   
   @RequestMapping(value = {"/ecobar_fr" })
   public String staticResource1(Model model) {
       return "ecobar_fr";
   }
   
   @RequestMapping(value = {"/ecobar_en" })
   public String staticResource11(Model model) {
       return "ecobar_en";
   }
}