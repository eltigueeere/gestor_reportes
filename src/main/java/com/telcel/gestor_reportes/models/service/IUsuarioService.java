package com.telcel.gestor_reportes.models.service;

import java.util.List;

import com.telcel.gestor_reportes.models.entity.Usuario;

public interface IUsuarioService {
    
    public List<Usuario> findAll();

    public void save(Usuario usuario);

    public Usuario findOne(Long id);

}
