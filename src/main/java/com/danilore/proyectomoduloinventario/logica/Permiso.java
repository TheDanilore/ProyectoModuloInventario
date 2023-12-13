/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.logica;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Danilore
 */
@Entity
public class Permiso {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id_permiso;
    private String descripcion;
    
    @ManyToMany
    private Set<Cargo> cargos;
    
    @ManyToMany
    private Set<MenuOption> opcionesDelMenu;

    public Permiso(int id_permiso, String descripcion, Set<Cargo> cargos, Set<MenuOption> opcionesDelMenu) {
        this.id_permiso = id_permiso;
        this.descripcion = descripcion;
        this.cargos = cargos;
        this.opcionesDelMenu = opcionesDelMenu;
    }

    public Permiso() {
    }
    
    

    public int getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(int id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(Set<Cargo> cargos) {
        this.cargos = cargos;
    }

    public Set<MenuOption> getOpcionesDelMenu() {
        return opcionesDelMenu;
    }

    public void setOpcionesDelMenu(Set<MenuOption> opcionesDelMenu) {
        this.opcionesDelMenu = opcionesDelMenu;
    }
    
    
}
