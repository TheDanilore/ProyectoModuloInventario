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
public class SalidaProducto implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id_salida_producto;
    private String id_producto;
    private long cantidad;
    private String id_tipo_moneda;
    private String id_guia;
    private double total_costo;
    private String personal_salida;
    private LocalDateTime fecha_salida;

    public SalidaProducto() {
        fecha_salida = LocalDateTime.now();
    }

    public SalidaProducto(String id_salida_producto, String id_producto, long cantidad, String id_tipo_moneda, String id_guia, double total_costo, String personal_salida, LocalDateTime fecha_salida) {
        this.id_salida_producto = id_salida_producto;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.id_tipo_moneda = id_tipo_moneda;
        this.id_guia = id_guia;
        this.total_costo = total_costo;
        this.personal_salida = personal_salida;
        this.fecha_salida = fecha_salida;
    }

    public String getId_salida_producto() {
        return id_salida_producto;
    }

    public void setId_salida_producto(String id_salida_producto) {
        this.id_salida_producto = id_salida_producto;
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

    public double getTotal_costo() {
        return total_costo;
    }

    public void setTotal_costo(double total_costo) {
        this.total_costo = total_costo;
    }

    public String getPersonal_salida() {
        return personal_salida;
    }

    public void setPersonal_salida(String personal_salida) {
        this.personal_salida = personal_salida;
    }

    public LocalDateTime getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDateTime fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    

}
