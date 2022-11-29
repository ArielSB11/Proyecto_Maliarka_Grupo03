/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoFinal.domain;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author ivmor
 */
    
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCategoria;
    private String descripcion;
    private String composicion;
    private String recomendado;
    private boolean activo;;
    
    
    public Categoria(){
    }

    public Categoria(Long idCategoria, String descripcion, String composicion, String recomendado, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.composicion = composicion;
        this.recomendado = recomendado;
        this.activo = activo;
    }
    

    

    
}
