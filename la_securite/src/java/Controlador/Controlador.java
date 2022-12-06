/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.EquipoDAO;
import ModeloDAO.PedidoEquipoCDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.EquipoVO;
import ModeloVO.PedidoEquipoCVO;
import ModeloVO.UsuarioVO;
import Util.GenerarSerie;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chris
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet 
{
    UsuarioVO usuVO = new UsuarioVO();
    UsuarioDAO usuDAO = new UsuarioDAO();
    
    EquipoVO equVO = new EquipoVO();
    EquipoDAO equDAO = new EquipoDAO();
    
    PedidoEquipoCVO pedVO = new PedidoEquipoCVO();
    PedidoEquipoCDAO pedDAO = new PedidoEquipoCDAO();
    
    List<PedidoEquipoCVO>lista = new ArrayList<>();
    
    int item=0,  cantidad;
    String nombre_equipo, id_producto;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        String menu = request.getParameter("menu");

        if (menu.equals("NuevaVenta")) 
        {
            switch (accion)
            {
               /* case "BuscarCliente":
                        
                        usuVO.setId_usuario(id_usuario);
                        usuVO = usuDAO.buscar(id_usuario);
                        request.setAttribute("nom_usu", usuVO);
                    break;*/
                case "Seleccionar":
                        String id_usua = request.getParameter("text_Idusuario");
                        usuVO.setId_usuario(id_usua);
                        String id_equipo = request.getParameter("id_equipo");
                        equVO = equDAO.buscarProducto(id_equipo);
                        request.setAttribute("nombre_equipo", equVO);
                        request.setAttribute("lista", lista);
                    break;
                case "Agregar":
                        request.setAttribute("nom_usu", usuVO);
                        item = item + 1;
                        id_producto = equVO.getId_equipo();
                        nombre_equipo = equVO.getNombre_equipo();
                        cantidad = Integer.parseInt(request.getParameter("cantidad"));
                        pedVO = new PedidoEquipoCVO();
                        pedVO.setItem(item);
                        pedVO.setId_producto(id_producto);
                        pedVO.setNombre_equipo(nombre_equipo);
                        pedVO.setCantidad(cantidad);
                        lista.add(pedVO);
                        request.setAttribute("lista", lista);
                        request.getRequestDispatcher("hacerPedidoCliente.jsp").forward(request, response);
                    break;
                case "Cancelar":
                    if(pedVO != null){
                    for(int i=0;i<lista.size();i++){
                            pedVO = lista.get(i);
                            item = 0;
                            lista.clear();
                        }
                    }
                    break;
                   case "SumarCantidad":
                        cantidad = cantidad + 1;
                        pedVO.setCantidad(cantidad);
                        request.setAttribute("lista", lista);
                        
                    break;
                    case "RestarCantidad":
                        cantidad = cantidad + 1;
                        pedVO.setCantidad(cantidad);
                        request.setAttribute("lista", lista);
                    break;
                case "GenerarVenta":
                        /*for (int i = 0; i < lista.size(); i++) 
                        {
                            EquipoVO equVO = new EquipoVO();
                            int cantidad = lista.get(i).getCantidad();
                            int id_producto = lista.get(i).getId_producto();
                            
                            EquipoDAO equDAO = new EquipoDAO();
                            
                            equDAO.buscar(id_producto);
                            int sac = equVO.getCantidad_equipo()-cantidad;
                            equDAO.actualizarStock(id_producto, sac);
                        }*/
                        //Guardar Pedido Cabecero
                        pedVO.setId_usuario(usuVO.getId_usuario());
                        pedVO.setServicio("Instalacion");
                        pedVO.setEstado("Activo");
                        pedDAO.guardarVenta(pedVO);
                        //Guardar Pedido Lineas
                        String idPedidoC = pedDAO.idPedidoC();
                        for (int i = 0; i < lista.size(); i++)
                        {
                            pedVO = new PedidoEquipoCVO();
                            pedVO.setId_pedidoC(idPedidoC);
                            pedVO.setId_producto(lista.get(i).getId_producto());
                            pedVO.setCantidad(lista.get(i).getCantidad());
                            pedDAO.guardarVentaLineas(pedVO);
                        }
                        
                        for(int i=0;i<lista.size();i++){
                            pedVO = lista.get(i);
                            item = 0;
                            lista.clear();
                            
                        }
                        
                    break;
                default:
                    request.getRequestDispatcher("hacerPedidoCliente.jsp").forward(request, response);
            }
            request.getRequestDispatcher("hacerPedidoCliente.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}