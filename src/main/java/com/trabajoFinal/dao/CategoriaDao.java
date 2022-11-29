/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trabajoFinal.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.trabajoFinal.domain.Categoria;

/**
 *
 * @author ivmor
 */
public interface CategoriaDao  extends JpaRepository<Categoria, Long> {
    
}
