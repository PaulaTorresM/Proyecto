/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AdministrarSolicitudDAO;
import ModeloVO.AdministrarSolicitudVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author macbookair
 */
@WebServlet(name = "AdministrarSolicitudControlador", urlPatterns = {"/AdministrarSolicitudControlador"})
public class AdministrarSolicitudControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
       // 1. Recibir datos de las vistas
        String id_seguimiento = request.getParameter("textId");
        String id_pedidoC = request.getParameter("textPedidoC");
        String fecha_solicitud = request.getParameter("textFechaSolicitud");
        String descripcion_solicitud = request.getParameter("texDescripcion");
        String fecha_instalacion = request.getParameter("textFechaInstalacion");
        String estado_instalacion = request.getParameter("textEstadoInstalacion");
        String id_usuario = request.getParameter("textIdUsuario");
        String informe = request.getParameter("textInforme");
        String estado_solicitud = request.getParameter("textEstadoSolicitud");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        //2. Instanciar datos de forma segura con el VO
        AdministrarSolicitudVO adSoliVO = new AdministrarSolicitudVO(id_seguimiento, id_pedidoC, fecha_solicitud, descripcion_solicitud, fecha_instalacion, estado_instalacion, id_usuario, informe, estado_solicitud);
        
        //3. Instanciar el DAO
        AdministrarSolicitudDAO adSoliDAO = new AdministrarSolicitudDAO(adSoliVO);
        
        //4. Administrar Operaciones
        switch (opcion) 
        {
            case 1: // Agregar Solicitud como Administrador
            {
                if (adSoliDAO.agregarRegistro()) 
                {
                    request.setAttribute("mensajeExito", "La solicitud se registró correctamente");
                } 
                else 
                {
                    request.setAttribute("mensajeError", "La solicitud NO se registró correctamente");
                }
                request.getRequestDispatcher("registrarSolicitudAdministrador.jsp").forward(request, response);
                break;
            }
        
            case 2: //Actualizar solicitud Administrador
           
            {
                if (adSoliDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "LA SOLICITUD SE ACTULIZO CORRECTAMENTE");
                } else {
                    request.setAttribute("mensajeError", "LA SOLICITUD NO SE ACTULIZO CORRECTAMENTE");
                }
                request.getRequestDispatcher("dashboardAdministrador.jsp").forward(request, response);
                break;
            }
            case 3: //Consultar id del pedido
             {
                adSoliVO = adSoliDAO.consultarID(id_seguimiento);
                if (adSoliVO != null) 
                {
                    request.setAttribute("AdministrarSolicitudControlador", adSoliVO);
                    request.getRequestDispatcher("actualizarSolicitudAdministrador.jsp").forward(request, response);
                } 
                else 
                {
                    request.setAttribute("mensajeError", "LA SOLICITUD NO EXISTE");
                    request.getRequestDispatcher("dashboardAdministrador.jsp").forward(request, response);
                }
                break;
            }
            
            case 4: //Consultar instalacion tecnico
              {
                adSoliVO = adSoliDAO.consultarID(id_seguimiento);
                if (adSoliVO != null) 
                {
                    request.setAttribute("AdministrarSolicitudControlador", adSoliVO);
                    request.getRequestDispatcher("actualizarSolicitudTecnico.jsp").forward(request, response);
                } 
                else 
                {
                    request.setAttribute("mensajeError", "LA INSTALACION NO EXISTE");
                    request.getRequestDispatcher("dashboardTecnico.jsp").forward(request, response);
                }
                break;
            }
               case 5: //Actualizar instalacion tecnico
                {
                if (adSoliDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "LA SOLICITUD SE ACTULIZO CORRECTAMENTE");
                } else {
                    request.setAttribute("mensajeError", "LA SOLICITUD NO SE ACTULIZO CORRECTAMENTE");
                }
                request.getRequestDispatcher("ConsultarInstalacionTecnico.jsp").forward(request, response);
                break;
            }
               
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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