/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.EquipoVO;
import ModeloVO.UsuarioVO;
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
 * @author Usuario
 */
public class EquipoDAO extends ConexionBd implements Crud
{
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean r= false, operacion = false;
    private String sql;
        
    private String id_equipo = "" , nombre_equipo = "", estado_equipo = "", cantidad_equipo = ""; 
    
    public EquipoDAO()
    {
        
    }
    
    public EquipoDAO(EquipoVO equVO)
    {
        super();
        
        try 
        {
            conexion = this.obtenerConexion();

            id_equipo = equVO.getId_equipo();
          
            nombre_equipo = equVO.getNombre_equipo();
            estado_equipo = equVO.getEstado_equipo();
            cantidad_equipo = equVO.getCantidad_equipo();
        } 
        catch (Exception e) 
        {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() 
    {
        try 
        {
            sql = "INSERT INTO EQUIPO( NOMBRE_EQUIPO, ESTADO_EQUIPO, CANTIDAD_EQUIPO) VALUES (?, ?, ?);";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre_equipo);
            puente.setString(2, estado_equipo);
            puente.setString(3, cantidad_equipo);
            puente.executeUpdate();
            operacion = true;
        } 
        catch (SQLException e) 
        {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally
        {
            try 
            {
                this.cerrarConexion();
            } 
            catch (SQLException e) 
            {
                Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() 
    {
        try 
        {
            sql = "UPDATE EQUIPO SET  NOMBRE_EQUIPO=?, ESTADO_EQUIPO=?, CANTIDAD_EQUIPO=? WHERE ID_EQUIPO=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre_equipo);
            puente.setString(2, estado_equipo);
            puente.setString(3, cantidad_equipo);
            puente.setString(4, id_equipo);
                
            puente.executeUpdate();
            operacion = true;
            
        } 
         catch (Exception e) 
        {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally
        {
            try 
            {
                this.cerrarConexion();
            }
            catch (Exception e) 
            {
                Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public EquipoVO consultarID(String nombre_equipo) 
    {
        EquipoVO equVO = null;
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM `EQUIPO` WHERE NOMBRE_EQUIPO = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre_equipo);
            mensajero = puente.executeQuery();
            while (mensajero.next()) 
            {
                equVO = new EquipoVO(
                        mensajero.getString(1), 
                        mensajero.getString(2),
                        mensajero.getString(3), 
                        mensajero.getString(4)
 
                        );
            }
        } 
        catch (Exception e) 
        {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        finally 
        {
            try 
            {
                this.cerrarConexion();
            } catch (Exception e) 
            {
                Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return equVO;
    }
    
    public ArrayList<EquipoVO> listar()
    {
        ArrayList<EquipoVO> listaEquipos = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM `EQUIPO` WHERE ESTADO_EQUIPO = 'Activo'";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next())
            {
                EquipoVO equVO; 
                equVO = new EquipoVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4));
                listaEquipos.add(equVO);
            }
        } catch (Exception e) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaEquipos;
    }
    
    public EquipoVO buscarProducto(String id_equipo)
    {
        EquipoVO cliVO = new EquipoVO();
        
        try 
        {
            conexion = this.obtenerConexion();
            sql ="SELECT * FROM `EQUIPO` WHERE ID_EQUIPO=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_equipo);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) 
            {
                cliVO.setId_equipo(mensajero.getString(1));
                cliVO.setNombre_equipo(mensajero.getString(2));
                cliVO.setEstado_equipo(mensajero.getString(3));
                cliVO.setCantidad_equipo(mensajero.getString(4));
            }
        } 
        catch (SQLException e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return cliVO;
    }
    
    public boolean buscar(String id_equipo)
    {
        EquipoVO equVO= new EquipoVO();
        
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM `EQUIPO` WHERE ID_EQUIPO=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_equipo);
            puente.executeQuery();
            
            while (mensajero.next())
            {
                equVO.setId_equipo(mensajero.getString(1));
                equVO.setNombre_equipo(mensajero.getString(2));
                equVO.setEstado_equipo(mensajero.getString(3));
                equVO.setCantidad_equipo(mensajero.getString(4));
            }
        } 
        catch (Exception e) 
        {
            Logger.getLogger(PedidoEquipoCDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        return r;
    }
    
    public boolean actualizarStock(String id_equipo, String cantidad_equipo)
    {
        try 
        {
            sql = "UPDATE EQUIPO SET CANTIDAD_EQUIPO=? WHERE ID_EQUIPO=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, cantidad_equipo);
            puente.setString(2, id_equipo);
            puente.executeUpdate();
            
        } 
         catch (Exception e) 
        {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return r;
    }
}
