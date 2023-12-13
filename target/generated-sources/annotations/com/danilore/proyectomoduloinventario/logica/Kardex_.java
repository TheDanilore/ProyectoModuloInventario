package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T14:36:57")
@StaticMetamodel(Kardex.class)
public class Kardex_ { 

    public static volatile SingularAttribute<Kardex, Double> costo_total;
    public static volatile SingularAttribute<Kardex, Character> id_tipo_movimiento;
    public static volatile SingularAttribute<Kardex, String> id_kardex;
    public static volatile SingularAttribute<Kardex, Long> existencias_productos;
    public static volatile SingularAttribute<Kardex, String> id_tipo_moneda;
    public static volatile SingularAttribute<Kardex, Long> cantidad_movimiento;
    public static volatile SingularAttribute<Kardex, LocalDateTime> fecha_movimiento;
    public static volatile SingularAttribute<Kardex, String> id_producto;

}