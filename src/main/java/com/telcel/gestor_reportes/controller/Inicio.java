package com.telcel.gestor_reportes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Inicio {

    @GetMapping(value="/index")
    public String getindex(Model model) {
        return "index";
    }
    
    
}
