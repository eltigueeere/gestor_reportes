package com.telcel.gestor_reportes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/revision_y_distribucion_de_reportes")
    public String revicion_distribucion_rep(Model model) {
        return "revision_y_distribucion_de_reportes";
    }
}





