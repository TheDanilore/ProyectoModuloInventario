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
public class TipoMovimiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private char id_tipo_movimiento;
    private String descripcion;

    public TipoMovimiento() {
    }

    public TipoMovimiento(char id_tipo_movimiento, String descripcion) {
        this.id_tipo_movimiento = id_tipo_movimiento;
        this.descripcion = descripcion;
    }

    public char getId_tipo_movimiento() {
        return id_tipo_movimiento;
    }

    public void setId_tipo_movimiento(char id_tipo_movimiento) {
        this.id_tipo_movimiento = id_tipo_movimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
