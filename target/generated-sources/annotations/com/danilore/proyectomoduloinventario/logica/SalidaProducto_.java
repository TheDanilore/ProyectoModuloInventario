package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T17:20:59")
@StaticMetamodel(SalidaProducto.class)
public class SalidaProducto_ { 

    public static volatile SingularAttribute<SalidaProducto, String> id_guia;
    public static volatile SingularAttribute<SalidaProducto, Double> total_costo;
    public static volatile SingularAttribute<SalidaProducto, LocalDateTime> fecha_salida;
    public static volatile SingularAttribute<SalidaProducto, String> personal_salida;
    public static volatile SingularAttribute<SalidaProducto, String> id_tipo_moneda;
    public static volatile SingularAttribute<SalidaProducto, String> id_salida_producto;
    public static volatile SingularAttribute<SalidaProducto, String> id_producto;
    public static volatile SingularAttribute<SalidaProducto, Long> cantidad;

}