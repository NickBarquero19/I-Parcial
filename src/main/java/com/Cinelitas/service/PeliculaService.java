/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entity.Pelicula;
import com.Cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Barq
 */

@Service

public class PeliculaService implements IPeliculaService{
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
   
    public List<Pelicula> getPelicula() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public void save(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(Pelicula pelicula) {
        peliculaRepository.delete(pelicula);
    }

    @Override
    
    public Pelicula getPelicula(Pelicula pelicula) {
        return peliculaRepository.findById(pelicula.getIdPelicula()).orElse(null);
        
        }
    
    
    
}
