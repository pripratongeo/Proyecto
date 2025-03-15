package com.renewx.repository;

import com.renewx.models.TipoUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepo extends JpaRepository<TipoUsuarioModel, Integer>{
    //Atributo de Interface

}