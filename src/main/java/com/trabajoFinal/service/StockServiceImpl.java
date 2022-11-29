/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoFinal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.trabajoFinal.dao.StockDao;
import com.trabajoFinal.domain.Stock;
import com.trabajoFinal.service.StockService;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivmor
 */
@Service
public class StockServiceImpl implements StockService{
    
     // creacion de 4 metodos de un Crud (create, read, update and delete)
    
    //se utiliza una anotacion Autowired para que el objeto articuloDao
    //si ya esta en memoria se usa ese, sino se crea uno (singleton)
    
    @Autowired
    private StockDao stockDao;
    
    //retorna la lista de articulos
    @Override
    @Transactional(readOnly= true)
    public List<Stock> getStock(boolean activos){
    var lista=(List<Stock>)stockDao.findAll();
    if (activos){
        lista.removeIf(e -> !e.isActivo());
    }
    return lista;
    }
    
    //dado un articulo.id se busca en la table y se devuelve todo el objeto articulo
    @Override
    @Transactional(readOnly= true)
    public Stock getStock(Stock stock){
    return stockDao.findById(stock.getIdArticulo()).orElse(null);
            }
    // si el articulo.id tiene un valor se busca y se actualiza
    //si el articulo.id no tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save (Stock stock){
        stockDao.save(stock);
        
    }
    
    
    //Elimina el registro que tiene el id igual a articulo.id
    @Override
    @Transactional
    public void delete(Stock stock){
        stockDao.delete(stock);
    }

}

