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
@Table(name="Usuarios")
public class Usuarios implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_Cliente")
    private Long idCliente;
    
    String id_usuario;
    String email;
   
    public Usuarios(){
        
    }
        public Usuarios(Long idCliente, String id_usuario, String email) {
            this.idCliente = idCliente;
            this.id_usuario = id_usuario;
            this.email = email;
        }
    
    
}
