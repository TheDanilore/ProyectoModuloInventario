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
public class TipoDocumentoIdentidad implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id_tipo_documento_identidad;
    private String descripcion;

    public TipoDocumentoIdentidad() {
    }

    public TipoDocumentoIdentidad(String id_tipo_documento_identidad, String descripcion) {
        this.id_tipo_documento_identidad = id_tipo_documento_identidad;
        this.descripcion = descripcion;
    }

    public String getId_tipo_documento_identidad() {
        return id_tipo_documento_identidad;
    }

    public void setId_tipo_documento_identidad(String id_tipo_documento_identidad) {
        this.id_tipo_documento_identidad = id_tipo_documento_identidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
    
}
