package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.Cargo;
import com.danilore.proyectomoduloinventario.logica.CategoriaProducto;
import com.danilore.proyectomoduloinventario.logica.GuiaRemisionEntrada;
import com.danilore.proyectomoduloinventario.logica.GuiaRemisionSalida;
import com.danilore.proyectomoduloinventario.logica.IngresoProducto;
import com.danilore.proyectomoduloinventario.logica.Kardex;
import com.danilore.proyectomoduloinventario.logica.Producto;
import com.danilore.proyectomoduloinventario.logica.Proveedor;
import com.danilore.proyectomoduloinventario.logica.SalidaProducto;
import com.danilore.proyectomoduloinventario.logica.TipoMoneda;
import com.danilore.proyectomoduloinventario.logica.TipoMovimiento;
import com.danilore.proyectomoduloinventario.logica.UnidadMedida;
import com.danilore.proyectomoduloinventario.logica.Usuario;
import com.danilore.proyectomoduloinventario.logica.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilore
 */
public class ControladoraPersistencia {

    UsuarioJpaController usuJpa = new UsuarioJpaController();
    ProductoJpaController produJpa = new ProductoJpaController();
    CargoJpaController cargoJpa = new CargoJpaController();
    CategoriaProductoJpaController categoriaJpa = new CategoriaProductoJpaController();
    ProveedorJpaController  proveedorJpa = new ProveedorJpaController();
    IngresoProductoJpaController  ingresoJpa = new IngresoProductoJpaController();
    GuiaRemisionEntradaJpaController guiaEntradaJpa = new GuiaRemisionEntradaJpaController();
    SalidaProductoJpaController salidaJpa = new SalidaProductoJpaController();
    GuiaRemisionSalidaJpaController guiaSalidaJpa = new GuiaRemisionSalidaJpaController();
    KardexJpaController kardexJpa = new KardexJpaController();
    UnidadMedidaJpaController unidadJpa = new UnidadMedidaJpaController();
    TipoMonedaJpaController tipoMonedaJpa = new TipoMonedaJpaController();
    TipoMovimientoJpaController tipoMovimientoJpa = new TipoMovimientoJpaController();

    public ControladoraPersistencia() {
    }
    
    
    
    //Operacion CREATE de Usuario
    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    //Operacion READ de Usuario
    public List<Usuario> listUsuario() {
        return usuJpa.findUsuarioEntities();
    }
    
    public Usuario getUsuario(int id_editar) {
        return usuJpa.findUsuario(id_editar);
    }
    
    public void editUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    ////////////////////////////////////////////////////////////////////////////
    //Operacion CREATE de Producto
    public void crearProducto(Producto produ) {
        produJpa.create(produ);
    }

    //Operacion READ de Producto
    public List<Producto> listProducto() {
        return produJpa.findProductoEntities();
    }

    public Producto getProducto(String id_editar) {
        return produJpa.findProducto(id_editar);
    }

    public void editProducto(Producto produ) {
        try {
            produJpa.edit(produ);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    //Operacion CREATE de Categoria
    public void crearCategoriaProducto(CategoriaProducto categoria) {
        categoriaJpa.create(categoria);
    }

    //Operacion READ de Categoria de Productos
    public List<CategoriaProducto> listCategoria() {
        return categoriaJpa.findCategoriaProductoEntities();
    }

    //Operacion DELETE de Categoria de Productos
    public void deleteCategoriaProducto(int id_eliminar) {
        try {
            categoriaJpa.destroy(id_eliminar);
        } catch (com.danilore.proyectomoduloinventario.persistencia.exceptions.NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Operacion GET 1 OBJETO (Obtener , o buscar) de Categoria de Productos 
    public CategoriaProducto getCategoriaProducto(int id_editar) {
        return categoriaJpa.findCategoriaProducto(id_editar);
    }

    //Metodo UPDATE para Categoria de Productos
    public void editCategoriaProducto(CategoriaProducto categoria) {
        try {
            categoriaJpa.edit(categoria);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    //Operacion CREATE de cargo
    public void crearCargo(Cargo cargo) {
        cargoJpa.create(cargo);
    }

    //Operacion READ de Cargo
    public List<Cargo> listCargo() {
        return cargoJpa.findCargoEntities();
    }

    public Cargo getCargo(int id_editar) {
        return cargoJpa.findCargo(id_editar);
    }

    public void editCargo(Cargo cargo) {
        try {
            cargoJpa.edit(cargo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////


    //Operacion CREATE de Proveedor
    public void crearProveedor(Proveedor proveedor) {
        proveedorJpa.create(proveedor);
    }

    //Operacion READ de Proveedor
    public List<Proveedor> listProveedor() {
        return proveedorJpa.findProveedorEntities();
    }
    
    public Proveedor getProveedor(String id_editar) {
        return proveedorJpa.findProveedor(id_editar);
    }
    
    public void editProveedor(Proveedor proveedor) {
        try {
            proveedorJpa.edit(proveedor);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /////////////////////////////////////////////////////////////////////////////////////////////////
    
    
        //Operacion CREATE de Proveedor
    public void crearIngresoProducto(IngresoProducto ingresoProducto) {
        ingresoJpa.create(ingresoProducto);
    }

    //Operacion READ de Proveedor
    public List<IngresoProducto> listIngresoProducto() {
        return ingresoJpa.findIngresoProductoEntities();
    }
    
    public IngresoProducto getIngresoProducto(String id_editar) {
        return ingresoJpa.findIngresoProducto(id_editar);
    }
    
    public void editIngresoProducto(IngresoProducto ingresoProducto) {
        try {
            ingresoJpa.edit(ingresoProducto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void crearGuiaRemisionEntrada(GuiaRemisionEntrada guia) {
        guiaEntradaJpa.create(guia);
    }

    //Operacion READ de Usuario
    public List<GuiaRemisionEntrada> listGuiaRemisionEntrada() {
        return guiaEntradaJpa.findGuiaRemisionEntradaEntities();
    }
    
    public GuiaRemisionEntrada getGuiaRemisionEntrada(String id_editar) {
        return guiaEntradaJpa.findGuiaRemisionEntrada(id_editar);
    }
    
    public void editGuiaRemisionEntrada(GuiaRemisionEntrada guia) {
        try {
            guiaEntradaJpa.edit(guia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void crearSalidaProducto(SalidaProducto salida) {
        salidaJpa.create(salida);
    }

    //Operacion READ de Usuario
    public List<SalidaProducto> listSalidaProducto() {
        return salidaJpa.findSalidaProductoEntities();
    }
    
    public SalidaProducto getSalidaProducto(String id_editar) {
        return salidaJpa.findSalidaProducto(id_editar);
    }
    
    public void editSalidaProducto(SalidaProducto salida) {
        try {
            salidaJpa.edit(salida);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void crearGuiaRemisionSalida(GuiaRemisionSalida guia) {
        guiaSalidaJpa.create(guia);
    }

    //Operacion READ de Usuario
    public List<GuiaRemisionSalida> listGuiaRemisionSalida() {
        return guiaSalidaJpa.findGuiaRemisionSalidaEntities();
    }
    
    public GuiaRemisionSalida getGuiaRemisionSalida(String id_editar) {
        return guiaSalidaJpa.findGuiaRemisionSalida(id_editar);
    }
    
    public void editGuiaRemisionSalida(GuiaRemisionSalida salida) {
        try {
            guiaSalidaJpa.edit(salida);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void crearKardex(Kardex kar) {
        kardexJpa.create(kar);
    }

    //Operacion READ de Usuario
    public List<Kardex> listKardex() {
        return kardexJpa.findKardexEntities();
    }
    
    public Kardex getKardex(String id_editar) {
        return kardexJpa.findKardex(id_editar);
    }
    
    public void editKardex(Kardex kar) {
        try {
            kardexJpa.edit(kar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////
    
        //Operacion CREATE de Usuario
    public void crearUnidadMedida(UnidadMedida unidad) {
        unidadJpa.create(unidad);
    }

    //Operacion READ de Usuario
    public List<UnidadMedida> listUnidadMedida() {
        return unidadJpa.findUnidadMedidaEntities();
    }
    
    public UnidadMedida getUnidadMedida(String id_editar) {
        return unidadJpa.findUnidadMedida(id_editar);
    }
    
    public void editUnidadMedida(UnidadMedida unidad) {
        try {
            unidadJpa.edit(unidad);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Operacion CREATE de Usuario
    public void crearTipoMoneda(TipoMoneda tipo) {
        tipoMonedaJpa.create(tipo);
    }

    //Operacion READ de Usuario
    public List<TipoMoneda> listTipoMoneda() {
        return tipoMonedaJpa.findTipoMonedaEntities();
    }
    
    public TipoMoneda getTipoMoneda(String id_editar) {
        return tipoMonedaJpa.findTipoMoneda(id_editar);
    }
    
    public void editTipoMoneda(TipoMoneda tipo) {
        try {
            tipoMonedaJpa.edit(tipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Operacion CREATE de Usuario
    public void crearTipoMovimiento(TipoMovimiento tipo) {
        tipoMovimientoJpa.create(tipo);
    }

    //Operacion READ de Usuario
    public List<TipoMovimiento> listTipoMovimiento() {
        return tipoMovimientoJpa.findTipoMovimientoEntities();
    }
    
    public TipoMovimiento getTipoMovimiento(char id_editar) {
        return tipoMovimientoJpa.findTipoMovimiento(id_editar);
    }
    
    public void editTipoMovimiento(TipoMovimiento tipo) {
        try {
            tipoMovimientoJpa.edit(tipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
