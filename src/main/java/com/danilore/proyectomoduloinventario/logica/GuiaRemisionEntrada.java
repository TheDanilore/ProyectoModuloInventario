/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danilore
 */
@Entity
public class GuiaRemisionEntrada implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id;
    private long ruc;
    private String razon_social;
    private String proveedor_direccion;
    private String id_producto;
    private long cantidad;
    private String nombre_personal_recepciona;
    private LocalDateTime fecha_creacion;

    public GuiaRemisionEntrada() {
        fecha_creacion = LocalDateTime.now();
    }

    public GuiaRemisionEntrada(String id, long ruc, String razon_social, String proveedor_direccion, String id_producto, long cantidad, String nombre_personal_recepciona, LocalDateTime fecha_creacion) {
        this.id = id;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.proveedor_direccion = proveedor_direccion;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.nombre_personal_recepciona = nombre_personal_recepciona;
        this.fecha_creacion = fecha_creacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getRuc() {
        return ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getProveedor_direccion() {
        return proveedor_direccion;
    }

    public void setProveedor_direccion(String proveedor_direccion) {
        this.proveedor_direccion = proveedor_direccion;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_personal_recepciona() {
        return nombre_personal_recepciona;
    }

    public void setNombre_personal_recepciona(String nombre_personal_recepciona) {
        this.nombre_personal_recepciona = nombre_personal_recepciona;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    
    
    
}
