package com.renewx.service;

import com.renewx.models.TipoUsuarioModel;
import com.renewx.repository.TipoUsuarioRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class TipoUserService {
@Autowired
private TipoUsuarioRepo tipoUsuarioRepo;
// métodos del CRUD :
public TipoUsuarioModel saveTipoUser(TipoUsuarioModel tipoUsuarioModel){
    return tipoUsuarioRepo.save(tipoUsuarioModel);
}

//método para ver todos los tipos de usuarios:
public List<TipoUsuarioModel> listAll(){
    return tipoUsuarioRepo.findAll();
}

//método para buscar  un tipo  de usuario por id:
public TipoUsuarioModel getTipoUser(Integer id){
    return tipoUsuarioRepo.findById(id).orElse(null) ;
    
}

public void deleteTipoUser(Integer id){
    tipoUsuarioRepo.deleteById(id);
}

}
