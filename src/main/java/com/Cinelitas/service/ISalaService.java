/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.service;


import com.Cinelitas.entity.Sala;
import java.util.List;

/**
 *
 * @author Barq
 */
public interface ISalaService {
      public List<Sala> getSala();
    
    public void save(Sala pelicula);
    
    public void delete(Sala pelicula);
    
    public Sala getPelicula (Sala pelicula);
    
}
