package com.renewx.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipodocumentos")
@Data

public class TipoDocumentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoDocumentos;

    @Column(name = "nombre_tipo_documento")
    private String nombreTipoDocumento;

}
