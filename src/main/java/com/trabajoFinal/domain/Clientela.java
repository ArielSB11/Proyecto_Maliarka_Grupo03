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
@Table(name="clientela")
public class Clientela implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_Cliente")
    private Long idCliente;
    
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    int edad;
    String provincia;
    String canton;
    String distrito;
    String dir_exacta;
    
    @JoinColumn(name="id_credito",referencedColumnName="id_credito")
    @ManyToOne
    private Prestamo prestamo;
    
    public Clientela(){
   
    
    }

    public Clientela(Long idCliente, String nombre, String apellidos, String correo, String telefono, int edad, String provincia, String canton, String distrito, String dir_exacta, Prestamo prestamo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.dir_exacta = dir_exacta;
        this.prestamo = prestamo;
    }
    
    
}
