package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T15:40:00")
@StaticMetamodel(IngresoProducto.class)
public class IngresoProducto_ { 

    public static volatile SingularAttribute<IngresoProducto, String> personal_recibio;
    public static volatile SingularAttribute<IngresoProducto, String> id_guia;
    public static volatile SingularAttribute<IngresoProducto, Double> total_costo;
    public static volatile SingularAttribute<IngresoProducto, String> id_ingreso_producto;
    public static volatile SingularAttribute<IngresoProducto, String> id_tipo_moneda;
    public static volatile SingularAttribute<IngresoProducto, String> id_producto;
    public static volatile SingularAttribute<IngresoProducto, Long> cantidad;
    public static volatile SingularAttribute<IngresoProducto, LocalDateTime> fecha_ingreso;

}