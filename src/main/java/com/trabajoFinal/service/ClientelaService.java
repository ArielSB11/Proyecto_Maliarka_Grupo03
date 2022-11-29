/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trabajoFinal.service;
import com.trabajoFinal.domain.Clientela;

import java.util.List;

/**
 *
 * @author ivmor
 */
public interface ClientelaService {
    // creacion de 4 metodos de un Crud (create, read, update and delete)
    
   // public List <Clientela> buscarxApellido(String apellidos);
    //retorna la lista de clientelas
    public List<Clientela> getClientelas();
    
    //dado un clientela.id se busca en la table y se devuelve todo el objeto clientela
    public Clientela getClientela(Clientela clientela);
    
    // si el clientela.id tiene un valor se busca y se actualiza
    //si el clientela.id no tiene valor, se inserta el objeto en la tabla
    public void save (Clientela clientela);
    
    //Elimina el registro que tiene el id igual a clientela.id
    public void delete(Clientela clientela);
    
}
