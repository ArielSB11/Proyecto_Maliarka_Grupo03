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
    @Table(name="prestamo")
public class Prestamo implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCliente;
    
  private double limite;
    
    public Prestamo(){
    }

    public Prestamo(double limite) {
        this.limite = limite;
    
}
