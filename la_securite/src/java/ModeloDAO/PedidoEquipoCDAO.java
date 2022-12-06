/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PedidoEquipoCVO;
import Util.ConexionBd;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbookair
 */
public class PedidoEquipoCDAO extends ConexionBd implements Crud
{
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    
    private int item, r, cantidad;
    private String id_pedidoC = "", id_usuario = "", nombre_equipo = "", fecha_pedido = "", estado = "", id_producto = "";

    public PedidoEquipoCDAO() 
    {
        
    }
    
    public PedidoEquipoCDAO(PedidoEquipoCVO pedEVO)
    {
        super();
        
        try 
        {
            conexion = this.obtenerConexion();
            
            item = pedEVO.getItem();
            id_pedidoC = pedEVO.getId_pedidoC();
            id_producto = pedEVO.getId_producto();
            nombre_equipo = pedEVO.getNombre_equipo();
            fecha_pedido = pedEVO.getFecha_pedido();
            cantidad = pedEVO.getCantidad();
            estado = pedEVO.getEstado();
        } 
        catch (Exception e) 
        {
            Logger.getLogger(PedidoEquipoCDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public String idPedidoC() 
    {
        String idPedidoC = "";
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT MAX(ID_PEDIDOC) FROM `PEDIDO_EQUIPO_CABECERO`";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) 
            {
                idPedidoC = mensajero.getString(1);
            }
        } catch (Exception e) {
            Logger.getLogger(PedidoEquipoCDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        return idPedidoC;
    }
    
    public int guardarVenta(PedidoEquipoCVO pedCVO)
    {
        try 
        {
            conexion = this.obtenerConexion();
            sql = "INSERT INTO PEDIDO_EQUIPO_CABECERO(ID_USUARIO, FECHA_PEDIDO, SERVICIO, ESTADO) VALUES(?,NOW(),?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, pedCVO.getId_usuario());
            puente.setString(2, pedCVO.getServicio());
            puente.setString(3, pedCVO.getEstado());
            puente.executeUpdate();
        } 
        catch (Exception e) 
        {
            Logger.getLogger(PedidoEquipoCDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        return r;
    }
    
    public int guardarVentaLineas(PedidoEquipoCVO pedCVO)
    {
        try 
        {
            conexion = this.obtenerConexion();
            sql = "INSERT INTO PEDIDO_EQUIPO_LINEAS(ID_PEDIDOC, ID_EQUIPO, CANTIDAD) VALUES(?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, pedCVO.getId_pedidoC());
            puente.setString(2, pedCVO.getId_producto());
            puente.setInt(3, pedCVO.getCantidad());
            puente.executeUpdate();
        } 
        catch (Exception e) 
        {
            Logger.getLogger(PedidoEquipoCDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        return r;
    }
}
