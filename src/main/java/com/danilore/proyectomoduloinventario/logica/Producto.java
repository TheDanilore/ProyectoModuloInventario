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
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Danilore
 */
@Entity
public class Producto implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private String id_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private String id_proveedor;
    private int id_categoria_producto;
    private String id_unidad_medida;
    private double precio;
    private String id_tipo_moneda;
    private int id_estado;
    private LocalDateTime fecha_creacion;

    public Producto() {
        fecha_creacion = LocalDateTime.now();
    }

    public Producto(String id_producto, String nombre_producto, String descripcion_producto, String id_proveedor, int id_categoria_producto, String id_unidad_medida, double precio, String id_tipo_moneda, int id_estado, LocalDateTime fecha_creacion) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.id_proveedor = id_proveedor;
        this.id_categoria_producto = id_categoria_producto;
        this.id_unidad_medida = id_unidad_medida;
        this.precio = precio;
        this.id_tipo_moneda = id_tipo_moneda;
        this.id_estado = id_estado;
        this.fecha_creacion = fecha_creacion;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_categoria_producto() {
        return id_categoria_producto;
    }

    public void setId_categoria_producto(int id_categoria_producto) {
        this.id_categoria_producto = id_categoria_producto;
    }

    public String getId_unidad_medida() {
        return id_unidad_medida;
    }

    public void setId_unidad_medida(String id_unidad_medida) {
        this.id_unidad_medida = id_unidad_medida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    public void setId_tipo_moneda(String id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    
    

}
