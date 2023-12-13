/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
public class IngresoProducto implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id_ingreso_producto;
    private String id_producto;
    private long cantidad;
    private double total_costo;
    private String id_tipo_moneda;
    private String id_guia;
    private String personal_recibio;
    private LocalDateTime fecha_ingreso;

    public IngresoProducto() {
        fecha_ingreso = LocalDateTime.now();
    }

    public IngresoProducto(String id_ingreso_producto, String id_producto, long cantidad, double total_costo, String id_tipo_moneda, String id_guia, String personal_recibio, LocalDateTime fecha_ingreso) {
        this.id_ingreso_producto = id_ingreso_producto;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.total_costo = total_costo;
        this.id_tipo_moneda = id_tipo_moneda;
        this.id_guia = id_guia;
        this.personal_recibio = personal_recibio;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getId_ingreso_producto() {
        return id_ingreso_producto;
    }

    public void setId_ingreso_producto(String id_ingreso_producto) {
        this.id_ingreso_producto = id_ingreso_producto;
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

    public double getTotal_costo() {
        return total_costo;
    }

    public void setTotal_costo(double total_costo) {
        this.total_costo = total_costo;
    }

    public String getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    public void setId_tipo_moneda(String id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    public String getId_guia() {
        return id_guia;
    }

    public void setId_guia(String id_guia) {
        this.id_guia = id_guia;
    }

    public String getPersonal_recibio() {
        return personal_recibio;
    }

    public void setPersonal_recibio(String personal_recibio) {
        this.personal_recibio = personal_recibio;
    }

    public LocalDateTime getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDateTime fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    
    
   
}
