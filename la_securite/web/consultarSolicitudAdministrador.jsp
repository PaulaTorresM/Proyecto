<%-- 
    Document   : administrarSolicitudAdministrador
    Created on : 20-sep-2022, 21:51:14
    Author     : macbookair
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.AdministrarSolicitudDAO"%>
<%@page import="ModeloVO.AdministrarSolicitudVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>¡CONSULTAR SOLICITUD ADMINISTRADOR!</h1>
        <form method="POST" action="AdministrarSolicitudControlador">
            <table>
                <tr>
                    ID:<br>
                <input type="text" name="textId"><br>
                </tr>
            </table><br><br>
            <button class="btn btn-success">Consultar</button>
            <input type="hidden" value="3" name="opcion">
        </form><br><br>
        <%
            if (request.getAttribute("mensajeError") != null) {%>
        <div class="alert alert-danger" role="alert">
            ${mensajeError}
        </div>
        <% } else { %>
        <div class="alert alert-success" role="alert">
            ${mensajeExito}
        </div>
        <% }
        %>
            <table class="table table-dark">
                <tr>
                    <th class="bg-warning">PEDIDO</th>
                    <th class="bg-warning">FECHA_SOLICITUD</th>
                    <th class="bg-warning">DESCRIPCION_SOLICITUD</th>
                    <th class="bg-warning">FECHA_INSTALACION</th>
                    <th class="bg-warning">ESTADO_INSTALACION</th>
                    <th class="bg-warning">TECNICO</th>
                    <th class="bg-warning">ACCIONES</th>
                </tr>
                <%
                    AdministrarSolicitudVO adSoliVO = new AdministrarSolicitudVO();
                    AdministrarSolicitudDAO adSoliDAO = new AdministrarSolicitudDAO();
                    ArrayList<AdministrarSolicitudVO> listaSolicitudes = adSoliDAO.listar();
                    for (int i = 0; i < listaSolicitudes.size(); i++) 
                    {

                        adSoliVO = listaSolicitudes.get(i);
                %>
                <tr>
                    <td><%= adSoliVO.getId_pedidoC()%></td>
                    <td><%= adSoliVO.getFecha_solicitud()%></td>
                    <td><%= adSoliVO.getDescripcion_solicitud()%></td>
                    <td><%= adSoliVO.getFecha_instalacion() %></td>
                    <td><%= adSoliVO.getEstado_instalacion()%></td>
                    <td><%= adSoliVO.getId_usuario()%></td>
                    <td>
                        <% 
                            if(adSoliVO.getEstado_solicitud().equals("Activo"))
                            {
                        %>
                        <form method="POST" action="AdministrarSolicitudControlador">
                            <button name="estadoInhabilitado" value="<%=adSoliVO.getId_seguimiento()%>">Eliminar</button>
                            <input type="hidden" value="4" name="opcion">
                        </form>
                        <%}%>
                    </td>
                </tr>
                <%}%>
            </table>
    </center> 
    </body>
</html>
