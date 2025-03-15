package com.renewx.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "datospersonales")
@Data
public class DatosPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddatospersonales;

    @Column(name = "nombre_completo")
    private    String nombrecompleto;

    @Column(name = "cedula", nullable = false)
    private String cedula;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuarioModel usuario;
    @ManyToMany
    @JoinColumn(name = "idtipodocumentos")
    private TipoDocumentos tipoDocumentos;
}
