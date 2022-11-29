/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoFinal.domain;

import java.io.Serializable;

/**
 *
 * @author ivmor
 */
public class Facturacion {
    @Entity
@Table(name="facturacion")
public class Facturacion implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_factura")
    private Long idFactura;
    }
    
    String fecha;
    double total;
    int estado;
    
     @JoinColumn(name="id_cliente",referencedColumnName="id_cliente")
    @ManyToOne
    private Clientela clientela;
     
     public Facturacion(){
     }

    public Facturacion(String fecha, double total, int estado, Clientela clientela) {
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.clientela = clientela;
    }
     
     
}
