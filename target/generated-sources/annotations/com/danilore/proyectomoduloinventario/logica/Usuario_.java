package com.danilore.proyectomoduloinventario.logica;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T15:40:00")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> contra_usuario;
    public static volatile SingularAttribute<Usuario, Integer> id_estado;
    public static volatile SingularAttribute<Usuario, Integer> id_usuario;
    public static volatile SingularAttribute<Usuario, String> correo_usuario;
    public static volatile SingularAttribute<Usuario, String> nombres_usuario;
    public static volatile SingularAttribute<Usuario, LocalDateTime> fecha_creacion;
    public static volatile SingularAttribute<Usuario, Integer> id_cargo;

}