/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danilore
 */

@Entity
public class Cargo implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private int id_cargo;
    private String descripcion;
    private int id_estado;
    private LocalDateTime fecha_creacion;
    

    public Cargo() {
        fecha_creacion = LocalDateTime.now();
    }

    public Cargo(int id_cargo, String descripcion, int id_estado, LocalDateTime fecha_creacion) {
        this.id_cargo = id_cargo;
        this.descripcion = descripcion;
        this.id_estado = id_estado;
        this.fecha_creacion = fecha_creacion;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    
    
}
