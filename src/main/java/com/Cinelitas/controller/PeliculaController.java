/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.controller;

import com.Cinelitas.entity.Pelicula;
import com.Cinelitas.service.IPeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Barq
 */
@Controller
@Slf4j
public class PeliculaController {
   
    @Autowired
    private IPeliculaService ipeliculaService;
    
    @GetMapping ("/")
    public String home(Model model){
        
        var pelicula = ipeliculaService.getPelicula();
        
        model.addAttribute("peliculas", pelicula);
        
     return "index";   
    }
    
    @GetMapping("/nuevaPelicula")
    public String nuevaPelicula(Pelicula pelicula){
        
        return "nuevaPelicula";
        
    }
    
    @PostMapping("/guardarPelicula")
    public String GuardarPelicula (Pelicula pelicula){
        
        ipeliculaService.save(pelicula);
        return "redirect:/";
    }
    
}
