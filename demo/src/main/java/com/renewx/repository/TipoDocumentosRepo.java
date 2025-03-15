package com.renewx.repository;

import com.renewx.models.TipoDocumentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentosRepo extends JpaRepository<TipoDocumentos,Integer>{

}
