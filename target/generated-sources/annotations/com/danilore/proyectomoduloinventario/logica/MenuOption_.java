package com.danilore.proyectomoduloinventario.logica;

import com.danilore.proyectomoduloinventario.logica.Permiso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-13T17:20:59")
@StaticMetamodel(MenuOption.class)
public class MenuOption_ { 

    public static volatile SingularAttribute<MenuOption, Integer> id_menu_option;
    public static volatile SingularAttribute<MenuOption, String> label;
    public static volatile ListAttribute<MenuOption, Permiso> permisos;
    public static volatile SingularAttribute<MenuOption, String> url;

}