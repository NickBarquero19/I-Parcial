/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Barq
 */
public interface IPeliculaService {
    public List<Pelicula> getPelicula();
    
    public void save(Pelicula pelicula);
    
    public void delete(Pelicula pelicula);
    
    public Pelicula getPelicula (Pelicula pelicula);
    
}
