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

/**
 *
 * @author Danilore
 */
@Entity
public class Kardex implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id_kardex;
    private String id_producto;
    private char id_tipo_movimiento;
    private long cantidad_movimiento;
    private String id_tipo_moneda;
    private double costo_total;
    private long existencias_productos;
    private LocalDateTime fecha_movimiento;

    public Kardex() {
        fecha_movimiento = LocalDateTime.now();
    }

    public Kardex(String id_kardex, String id_producto, char id_tipo_movimiento, long cantidad_movimiento, String id_tipo_moneda, double costo_total, long existencias_productos, LocalDateTime fecha_movimiento) {
        this.id_kardex = id_kardex;
        this.id_producto = id_producto;
        this.id_tipo_movimiento = id_tipo_movimiento;
        this.cantidad_movimiento = cantidad_movimiento;
        this.id_tipo_moneda = id_tipo_moneda;
        this.costo_total = costo_total;
        this.existencias_productos = existencias_productos;
        this.fecha_movimiento = fecha_movimiento;
    }

    public String getId_kardex() {
        return id_kardex;
    }

    public void setId_kardex(String id_kardex) {
        this.id_kardex = id_kardex;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public char getId_tipo_movimiento() {
        return id_tipo_movimiento;
    }

    public void setId_tipo_movimiento(char id_tipo_movimiento) {
        this.id_tipo_movimiento = id_tipo_movimiento;
    }

    public long getCantidad_movimiento() {
        return cantidad_movimiento;
    }

    public void setCantidad_movimiento(long cantidad_movimiento) {
        this.cantidad_movimiento = cantidad_movimiento;
    }

    public String getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    public void setId_tipo_moneda(String id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public long getExistencias_productos() {
        return existencias_productos;
    }

    public void setExistencias_productos(long existencias_productos) {
        this.existencias_productos = existencias_productos;
    }

    public LocalDateTime getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(LocalDateTime fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }
    
    
    
}
