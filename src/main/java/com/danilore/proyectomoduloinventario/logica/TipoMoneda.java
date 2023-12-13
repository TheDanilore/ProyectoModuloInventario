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
public class TipoMoneda implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id_tipo_moneda;
    private String descripcion;
    private String pais_o_zona;

    public TipoMoneda() {
    }

    public TipoMoneda(String id_tipo_moneda, String descripcion, String pais_o_zona) {
        this.id_tipo_moneda = id_tipo_moneda;
        this.descripcion = descripcion;
        this.pais_o_zona = pais_o_zona;
    }

    public String getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    public void setId_tipo_moneda(String id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais_o_zona() {
        return pais_o_zona;
    }

    public void setPais_o_zona(String pais_o_zona) {
        this.pais_o_zona = pais_o_zona;
    }

    
}
