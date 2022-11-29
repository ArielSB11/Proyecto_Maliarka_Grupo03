/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trabajoFinal.dao;

import com.trabajoFinal.domain.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ivmor
 */
public interface FacturacionDao extends JpaRepository<Facturacion, Long> {
    
}
