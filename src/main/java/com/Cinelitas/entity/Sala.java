package com.Cinelitas.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Barq
 */

@Entity
@Table(name="sala")

public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idSala;
    
   private int capacidadMax;
   private int numeroSala;
   private String pelicula;

    public Sala() {
    }

    public Sala(int capacidadMax, int numeroSala, String pelicula, long idSala) {
        this.capacidadMax = capacidadMax;
        this.numeroSala = numeroSala;
        this.pelicula = pelicula;
        this.idSala = idSala;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public long getIdSala() {
        return idSala;
    }

    public void setIdSala(long idSala) {
        this.idSala = idSala;
    }
   
   
    
}

