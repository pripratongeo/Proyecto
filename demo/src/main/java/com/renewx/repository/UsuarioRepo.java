package com.renewx.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;

import com.renewx.models.UsuarioModel;

public interface UsuarioRepo extends JpaRepository<UsuarioModel,Integer>{
/*
*
*
* @Param email la dirección de correo electronico a verificar
* @return 
*/  
Optional<UsuarioModel> findByEmail(String email);
/*
 * 
 * @Param email la dirección de correo electronico a verificar
 * @return 
 */


boolean existByEmail(String email);

/*
 * 
 * @param idusuario
 * @return 
 * 
 */
Optional<UsuarioModel> findByusuario(Integer idusuario);

/*
 * 
 * @param idusuario
 * @return 
 * 
 */
void deleteByIDusuario(Integer idusuario);

}
