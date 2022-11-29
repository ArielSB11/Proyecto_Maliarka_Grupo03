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

   
    @Data
   @Entity
     @Table(name="Stock")
public class Stock implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_Articulo")
    private Long idArticulo;
    private Long idCategoria;
    private String descripcion;
    private String marca;
    private String genero;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;

    public Stock(){
        
    }

    public Stock(Long idArticulo, Long idCategoria, String descripcion, String marca, String genero, String detalle, double precio, int existencias, boolean activo) {
        this.idArticulo = idArticulo;
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.marca = marca;
        this.genero = genero;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
    
    
        
        
    }
}
    
