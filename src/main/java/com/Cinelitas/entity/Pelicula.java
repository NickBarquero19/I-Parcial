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
@Table(name="pelicula")

public class Pelicula implements Serializable {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idPelicula;
    private String nombre;
    private int precio;
    private String fecha;

    public Pelicula() {
    }

    public Pelicula(String nombre, int precio, String fecha, long idPelicula) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(long idPelicula) {
        this.idPelicula = idPelicula;
    }

    

    
}
