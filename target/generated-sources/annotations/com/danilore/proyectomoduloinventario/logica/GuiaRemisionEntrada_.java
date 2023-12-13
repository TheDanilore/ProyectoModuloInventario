package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T15:40:00")
@StaticMetamodel(GuiaRemisionEntrada.class)
public class GuiaRemisionEntrada_ { 

    public static volatile SingularAttribute<GuiaRemisionEntrada, Long> ruc;
    public static volatile SingularAttribute<GuiaRemisionEntrada, String> proveedor_direccion;
    public static volatile SingularAttribute<GuiaRemisionEntrada, String> nombre_personal_recepciona;
    public static volatile SingularAttribute<GuiaRemisionEntrada, String> razon_social;
    public static volatile SingularAttribute<GuiaRemisionEntrada, String> id_producto;
    public static volatile SingularAttribute<GuiaRemisionEntrada, String> id;
    public static volatile SingularAttribute<GuiaRemisionEntrada, Long> cantidad;
    public static volatile SingularAttribute<GuiaRemisionEntrada, LocalDateTime> fecha_creacion;

}