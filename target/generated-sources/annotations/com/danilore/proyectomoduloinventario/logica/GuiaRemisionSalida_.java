package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T15:09:09")
@StaticMetamodel(GuiaRemisionSalida.class)
public class GuiaRemisionSalida_ { 

    public static volatile SingularAttribute<GuiaRemisionSalida, Long> ruc;
    public static volatile SingularAttribute<GuiaRemisionSalida, String> proveedor_direccion;
    public static volatile SingularAttribute<GuiaRemisionSalida, String> nombre_personal_recepciona;
    public static volatile SingularAttribute<GuiaRemisionSalida, LocalDateTime> fecha_salida;
    public static volatile SingularAttribute<GuiaRemisionSalida, String> razon_social;
    public static volatile SingularAttribute<GuiaRemisionSalida, String> id_producto;
    public static volatile SingularAttribute<GuiaRemisionSalida, String> id;
    public static volatile SingularAttribute<GuiaRemisionSalida, Long> cantidad;

}