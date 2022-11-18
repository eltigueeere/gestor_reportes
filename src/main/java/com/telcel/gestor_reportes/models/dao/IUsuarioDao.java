package com.telcel.gestor_reportes.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.telcel.gestor_reportes.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
}
