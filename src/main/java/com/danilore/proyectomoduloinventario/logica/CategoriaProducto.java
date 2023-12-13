/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Danilore
 */

@Entity
public class CategoriaProducto implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private int id_categoria_producto;
    private String descripcion;

    public CategoriaProducto() {
    }

    public CategoriaProducto(int id_categoria_producto, String descripcion) {
        this.id_categoria_producto = id_categoria_producto;
        this.descripcion = descripcion;
    }

    public int getId_categoria_producto() {
        return id_categoria_producto;
    }

    public void setId_categoria_producto(int id_categoria_producto) {
        this.id_categoria_producto = id_categoria_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
