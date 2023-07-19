package com.example.Proiectspring.model;

import com.example.Proiectspring.controller.Echipe;
import com.example.Proiectspring.controller.Fotbalisti;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Fotbal {


    @GetMapping(value = "/index")
    public String index(Model model) {
        String text = "LPF";
        model.addAttribute("greetings", text);

        Echipe e1 = new Echipe("Steaua Bucuresti", 1 , "Liga 1");
        Echipe e2 = new Echipe("Dinamo Bucuresti", 2 , "Liga 1");

        model.addAttribute("echipeList", List.of(e1, e2));

        Fotbalisti f1 = new Fotbalisti(7, "Florinel Coman", e1.getTeam());
        Fotbalisti f2 = new Fotbalisti(10, "Octavian Popescu", e1.getTeam());
        Fotbalisti f3 = new Fotbalisti(1, "Stefan Tarnovanu", e1.getTeam());
        Fotbalisti f4 = new Fotbalisti(11, "Ahmed Bani", e2.getTeam());
        Fotbalisti f5 = new Fotbalisti(5, "Ionel Danciulescu", e2.getTeam());

        model.addAttribute("fotbalistiList", List.of(f1, f2, f3, f4, f5));

        return "index";
    }

    @GetMapping(value = "/Echipe")
    public String Echipe(Model model) {
        String text = "Echipe";
        model.addAttribute("greetings", text);

        Echipe e1 = new Echipe("Steaua Bucuresti", 1 , "Liga 1");
        Echipe e2 = new Echipe("Dinamo Bucuresti", 2 , "Liga 1");

        model.addAttribute("echipeList", List.of(e1, e2));
        return "Echipe";
    }

    @GetMapping(value = "/Fotbalisti")
    public String Fotbalisti(Model model) {

        Echipe e1 = new Echipe("Steaua Bucuresti", 1 , "Liga 1");
        Echipe e2 = new Echipe("Dinamo Bucuresti", 2 , "Liga 1");

        model.addAttribute("echipeList", List.of(e1, e2));

        Fotbalisti f1 = new Fotbalisti(7, "Florinel Coman", e1.getTeam());
        Fotbalisti f2 = new Fotbalisti(10, "Octavian Popescu", e1.getTeam());
        Fotbalisti f3 = new Fotbalisti(1, "Stefan Tarnovanu", e1.getTeam());
        Fotbalisti f4 = new Fotbalisti(11, "Ahmed Bani", e2.getTeam());
        Fotbalisti f5 = new Fotbalisti(5, "Ionel Danciulescu", e2.getTeam());

        model.addAttribute("fotbalistiList", List.of(f1, f2, f3, f4, f5));

        return "Fotbalisti";
    }
}

