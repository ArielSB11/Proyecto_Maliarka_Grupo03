/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trabajoFinal.service;

import com.trabajoFinal.domain.Usuarios;
import java.util.List;

/**
 *
 * @author ivmor
 */
public interface UsuarioService {
    
    // creacion de 4 metodos de un Crud (create, read, update and delete)
    
   // public List <Usuarios> buscarxApellido(String apellidos);
    //retorna la lista de usuarioslas
    public List<Usuarios> getUsuarios();
    
    //dado un usuarios.id se busca en la table y se devuelve todo el objeto usuariosla
    public Usuarios getUsuarios(Usuarios usuarios);
    
    // si el usuariosla.id tiene un valor se busca y se actualiza
    //si el usuariosla.id no tiene valor, se inserta el objeto en la tabla
    public void save (Usuarios usuarios);
    
    //Elimina el registro que tiene el id igual a usuariosla.id
    public void delete(Usuarios usuarios);
    
}
    

