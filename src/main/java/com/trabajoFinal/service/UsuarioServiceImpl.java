/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoFinal.service;

import com.trabajoFinal.dao.ClientelaDao;
import com.trabajoFinal.dao.UsuariosDao;
import com.trabajoFinal.domain.Usuarios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ivmor
 */
    @Service
 public abstract class UsuarioServiceImpl implements UsuarioService {
    // creacion de 4 metodos de un Crud (create, read, update and delete)
    
    //se utiliza una anotacion Autowired para que el objeto usuariosDao
    //si ya esta en momoria se usa ese, sino se crea uno (singleton)
    
    @Autowired
    private UsuariosDao usuariosDao;
    
    //retorna la lista de usuarioss
    @Override
    @Transactional(readOnly= true)
    public List<Usuarios> getUsuarios(boolean activos){
    var lista=(List<Usuarios>)usuariosDao.findAll();
    return lista;
    }
    
    //dado un usuarios.id se busca en la table y se devuelve todo el objeto usuarios
    @Override
    @Transactional(readOnly= true)
    public Usuarios getUsuarios(Usuarios usuarios){
    return usuariosDao.findById(usuarios.getIdUsuarios()).orElse(null);
            }
    // si el usuarios.id tiene un valor se busca y se actualiza
    //si el usuarios.id no tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save (Usuarios usuarios){
        usuariosDao.save(usuarios);
        
    }

}

    

