package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T11:12:14")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> id_estado;
    public static volatile SingularAttribute<Producto, String> id_proveedor;
    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile SingularAttribute<Producto, String> id_unidad_medida;
    public static volatile SingularAttribute<Producto, String> descripcion_producto;
    public static volatile SingularAttribute<Producto, String> id_tipo_moneda;
    public static volatile SingularAttribute<Producto, String> nombre_producto;
    public static volatile SingularAttribute<Producto, Integer> id_categoria_producto;
    public static volatile SingularAttribute<Producto, String> id_producto;
    public static volatile SingularAttribute<Producto, LocalDateTime> fecha_creacion;

}