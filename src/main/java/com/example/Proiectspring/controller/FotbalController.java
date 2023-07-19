package com.example.Proiectspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FotbalController {

    @GetMapping(value = "/JucatoriForm")
    public String getJucatoriForm(Model model) {

        /*Echipe e1 = new Echipe("Steaua Bucuresti", 1 , "Liga 1");
        Echipe e2 = new Echipe("Dinamo Bucuresti", 2 , "Liga 1");
        model.addAttribute("echipeList", List.of(e1, e2));*/

        model.addAttribute("jucatori", new Fotbalisti());
        return "JucatoriForm";
    }

    @PostMapping(value = "/submitFotbalisti")
    public String submitFotbalisti(@ModelAttribute("jucatori") Fotbalisti jucatori ) {
        System.out.println(jucatori.toString());
        return null;
    }

    @GetMapping(value = "/EchipeForm")
    public String getEchipeForm(Model model) {

        model.addAttribute("echipe", new Echipe());

        return "EchipeForm";
    }

    @PostMapping(value = "/submitEchipe")
    public String submitEchipe(@ModelAttribute("echipe") Echipe echipe ) {
        System.out.println(echipe.toString());
        return null;
    }

}
