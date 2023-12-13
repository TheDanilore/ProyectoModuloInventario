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
public class UnidadMedida implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id_unidad_medida;
    private String descripcion;
    private String abreviatura_medida;

    public UnidadMedida(String id_unidad_medida, String descripcion, String abreviatura_medida) {
        this.id_unidad_medida = id_unidad_medida;
        this.descripcion = descripcion;
        this.abreviatura_medida = abreviatura_medida;
    }

    public UnidadMedida() {
    }

    public String getId_unidad_medida() {
        return id_unidad_medida;
    }

    public void setId_unidad_medida(String id_unidad_medida) {
        this.id_unidad_medida = id_unidad_medida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura_medida() {
        return abreviatura_medida;
    }

    public void setAbreviatura_medida(String abreviatura_medida) {
        this.abreviatura_medida = abreviatura_medida;
    }
    
    
    
}
