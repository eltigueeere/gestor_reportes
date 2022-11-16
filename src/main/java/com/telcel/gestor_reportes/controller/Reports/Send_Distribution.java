package com.telcel.gestor_reportes.controller.Reports;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Send_Distribution {
    
    @GetMapping("/revision_y_distribucion_de_reportes")
    public String get_revicion_distribucion_rep(Model model) {
        return "revision_y_distribucion_de_reportes";
    }
}
