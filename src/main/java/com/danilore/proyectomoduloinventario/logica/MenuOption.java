/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.logica;

import java.util.List;
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
public class MenuOption {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id_menu_option;
    private String label;
    private String url;
    @ManyToMany(mappedBy = "opcionesDelMenu")
    private List<Permiso> permisos;


    public MenuOption() {
    }

    public MenuOption(int id_menu_option, String label, String url, List<Permiso> permisos) {
        this.id_menu_option = id_menu_option;
        this.label = label;
        this.url = url;
        this.permisos = permisos;
    }

    public int getId_menu_option() {
        return id_menu_option;
    }

    public void setId_menu_option(int id_menu_option) {
        this.id_menu_option = id_menu_option;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }

   
    
    
}
