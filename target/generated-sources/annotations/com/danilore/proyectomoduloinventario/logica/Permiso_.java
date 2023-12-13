package com.danilore.proyectomoduloinventario.logica;

import com.danilore.proyectomoduloinventario.logica.Cargo;
import com.danilore.proyectomoduloinventario.logica.MenuOption;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T17:20:59")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, String> descripcion;
    public static volatile SingularAttribute<Permiso, Integer> id_permiso;
    public static volatile SetAttribute<Permiso, Cargo> cargos;
    public static volatile SetAttribute<Permiso, MenuOption> opcionesDelMenu;

}