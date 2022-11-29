/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoFinal.service;
import com.trabajoFinal.dao.ClientelaDao;
import com.trabajoFinal.dao.PrestamoDao;
import com.trabajoFinal.domain.Clientela;
import com.trabajoFinal.domain.Prestamo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ivmor
 */

@Service
public class ClientelaServiceImpl implements ClientelaService {
    // creacion de 4 metodos de un Crud (create, read, update and delete)
    
    //se utiliza una anotacion Autowired para que el objeto clienteDao
    //si ya esta en momoria se usa ese, sino se crea uno (singleton)
    
    @Autowired
    private ClientelaDao clientelaDao;
     @Autowired
    private PrestamoDao prestamoDao;
    
    //retorna la lista de clientes
    @Override
    @Transactional(readOnly= true)
    public List<Clientela> getClientela(){
    return (List<Clientela>)clientelaDao.findAll();
    }
    
    //dado un cliente.id se busca en la table y se devuelve todo el objeto cliente
    @Override
    @Transactional(readOnly= true)
    public Clientela getClientela(Clientela cliente){
    return clientelaDao.findById(cliente.getIdClientela()).orElse(null);
            }
    // si el cliente.id tiene un valor se busca y se actualiza
    //si el cliente.id no tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save (Clientela clientela){
        Prestamo prestamo = clientela.getPrestamo();
        prestamo= prestamoDao.save(prestamo);
        clientela.setPrestamo(prestamo);
        clientelaDao.save(clientela);
        
    }
    
    
    //Elimina el registro que tiene el id igual a cliente.id
    @Override
    @Transactional
    public void delete(Clientela clientela){
        clientelaDao.delete(clientela);
    }

}
