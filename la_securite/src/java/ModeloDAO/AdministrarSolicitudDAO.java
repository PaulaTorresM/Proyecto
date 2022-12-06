/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.AdministrarSolicitudVO;
import Util.ConexionBd;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbookair
 */
public class AdministrarSolicitudDAO extends ConexionBd implements Crud
{
    //1. Declarar
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion = false;
    private String sql;
    
    private String id_seguimiento = "", id_pedidoC = "", fecha_solicitud = "", descripcion_solicitud = "", fecha_instalacion = "", estado_instalacion = "", id_usuario = "", informe = "", estado_solicitud = "";

    public AdministrarSolicitudDAO() 
    {
        
    }
    //2. Metodo principal para recibir datos del VO
    public AdministrarSolicitudDAO(AdministrarSolicitudVO adSoliVO)
    {
        super();
        //2.1 Conectarse
        try 
        {
            conexion = this.obtenerConexion();
            
            //2.2 Traigo los datos del VO
            id_seguimiento = adSoliVO.getId_seguimiento();
            id_pedidoC = adSoliVO.getId_pedidoC();
            fecha_solicitud = adSoliVO.getFecha_solicitud();
            descripcion_solicitud = adSoliVO.getDescripcion_solicitud();
            fecha_instalacion = adSoliVO.getFecha_instalacion();
            estado_instalacion = adSoliVO.getEstado_instalacion();
            id_usuario = adSoliVO.getId_usuario();
            informe = adSoliVO.getInforme();
            estado_solicitud = adSoliVO.getEstado_solicitud();
            
        } 
        catch (Exception e) 
        {
            Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Override
    public boolean agregarRegistro() 
    {
        try 
        {
            sql = "INSERT INTO ADMINISTRAR_SOLICITUD(ID_PEDIDOC, FECHA_SOLICITUD, DESCRIPCION_SOLICITUD, FECHA_INSTALACION, ESTADO_INSTALACION, ID_USUARIO, INFORME, ESTADO_SOLICITUD) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_pedidoC);
            puente.setString(2, fecha_solicitud);
            puente.setString(3, descripcion_solicitud);
            puente.setString(4, fecha_instalacion);
            puente.setString(5, estado_instalacion);
            puente.setString(6, id_usuario);
            puente.setString(7, informe);
            puente.setString(8, estado_solicitud);
            puente.executeUpdate();
            operacion = true;
        } 
        catch (SQLException e) 
        {
            Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        finally 
        {
            try 
            {
                this.cerrarConexion();
            } 
            catch (SQLException e) 
            {
                Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() 
    {
        try {
            sql = "UPDATE ADMINISTRAR_SOLICITUD SET ID_PEDIDOC=?, FECHA_SOLICITUD=?, DESCRIPCION_SOLICITUD=?, FECHA_INSTALACION=?, ESTADO_INSTALACION=?, ID_USUARIO=?, INFORME=?, ESTADO_SOLICITUD=? WHERE ID_SEGUIMIENTO=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_pedidoC);
            puente.setString(2, fecha_solicitud);
            puente.setString(3, descripcion_solicitud);
            puente.setString(4, fecha_instalacion);
            puente.setString(5, estado_instalacion);
            puente.setString(6, id_usuario);
            puente.setString(7, informe);
            puente.setString(8, estado_solicitud);
            puente.setString(9, id_seguimiento);
            puente.executeUpdate();
            operacion = true;
        } 
        catch (SQLException e) 
        {
            Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        finally 
        {
            try 
            {
                this.cerrarConexion();
            } 
            catch (SQLException e) 
            {
                Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    
    
    
    public ArrayList<AdministrarSolicitudVO> listar() 
    {
        ArrayList<AdministrarSolicitudVO> listaSolicitudes = new ArrayList<>();
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT ADMINISTRAR_SOLICITUD.ID_SEGUIMIENTO, ADMINISTRAR_SOLICITUD.ID_PEDIDOC, ADMINISTRAR_SOLICITUD.FECHA_SOLICITUD, ADMINISTRAR_SOLICITUD.DESCRIPCION_SOLICITUD, ADMINISTRAR_SOLICITUD.FECHA_INSTALACION, ADMINISTRAR_SOLICITUD.ESTADO_INSTALACION, USUARIO.NOM_USU, ADMINISTRAR_SOLICITUD.INFORME, ADMINISTRAR_SOLICITUD.ESTADO_SOLICITUD FROM `ADMINISTRAR_SOLICITUD` INNER JOIN USUARIO ON ADMINISTRAR_SOLICITUD.ID_USUARIO=USUARIO.ID_USUARIO WHERE ESTADO_SOLICITUD= 'Activo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) 
            {
                AdministrarSolicitudVO adSoliVO = new AdministrarSolicitudVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7),mensajero.getString(8),mensajero.getString(9));
                listaSolicitudes.add(adSoliVO);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        finally 
        {
            try 
            {
                this.cerrarConexion();
            } 
            catch (Exception e) 
            {
                Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaSolicitudes;
    }

    public AdministrarSolicitudVO consultarID(String id_seguimiento) 
    {
        AdministrarSolicitudVO adSoliVO = null;
        
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM `ADMINISTRAR_SOLICITUD` WHERE ID_SEGUIMIENTO = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_seguimiento);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) 
            {
                adSoliVO = new AdministrarSolicitudVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
            }
        } 
        catch (Exception e) 
        {
            Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        finally 
        {
            try 
            {
                this.cerrarConexion();
            } 
            catch (Exception e) 
            {
                Logger.getLogger(AdministrarSolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return adSoliVO;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}