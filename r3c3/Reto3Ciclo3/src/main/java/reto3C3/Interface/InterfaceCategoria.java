/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3C3.Interface;

import  reto3C3.Modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Melanie
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}
