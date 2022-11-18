package com.telcel.gestor_reportes.controller.usuarios;

import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.telcel.gestor_reportes.models.dao.IUsuarioDao;
import com.telcel.gestor_reportes.models.entity.Usuario;

@Controller
@SessionAttributes("usuario")
public class UsuariosController {
    
    @Autowired
    private IUsuarioDao usuarioService;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String get_revicion_distribucion_rep(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuarios/listar_usuarios.html";
    }

    @RequestMapping(value = "/from_usuario")
    public String crear(Map<String, Object> model) {
        Usuario usuario = new Usuario();
        model.put("usuario", usuario);
        return "usuarios/form_usuarios.html";
    }

    @RequestMapping(value = "/from_usuario", method = RequestMethod.POST)
    public String guardar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {
        if(result.hasErrors()) {
			//model.addAttribute("titulo", "Formulario de Cliente");
			return "usuarios/form_usuarios.html";
		}
        usuarioService.save(usuario);
        status.setComplete();
        return "redirect:listar";
    }

    
    @RequestMapping(value = "/from_usuario/{id}")
    public String ediatar(@PathVariable(value="id") Long id, Map<String, Object> model) {
		
		Optional<Usuario> usuario = null;
		
		if(id > 0) {
			usuario = usuarioService.findById(id);
		} else {
			return "redirect:/listar";
		}
		model.put("usuario", usuario);
		return "usuarios/form_usuarios.html";
    }

}
