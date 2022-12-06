<%-- 
    Document   : hacerPedidoClientejsp
    Created on : 25-sep-2022, 20:55:21
    Author     : macbookair
--%>
<%@page import="ModeloDAO.EquipoDAO"%>
<%@page import="ModeloVO.EquipoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>

<%@ taglib prefix="pedVO" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="Sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VENTAS</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="col-lg-5">
                <div class="card">
                    <form action="Controlador?menu=NuevaVenta" method="POST">
                        <div class="card-body">
                            <!--<div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="id_usuario" value="${nom_usu.getId_usuario()}" class="form-control" placeholder="Codigo">
                                    <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-danger" style="margin-left: 3px">
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" name="nom_usu" value="${nom_usu.getNom_usu()}" class="form-control col-sm-6" disabled="disabled">
                                </div>
                            </div>-->
                            <%  RolVO rolVO = new RolVO();
                                    RolDAO rolDAO = new RolDAO();
                                    ArrayList<RolVO> listarRol = rolDAO.listar(nom_usu);
                                    for (int i = 0; i < listarRol.size(); i++) {
                                        rolVO = listarRol.get(i);
                                    }
                            %>
                            <input type="hidden" name="text_Idusuario" value="<%=rolVO.getId_rol()%>">
                            <%--DATOS DEL PRODUCTO--%>
                            <div class="form-group">
                                <label>Datos Producto</label>
                            </div>
                            <br>
                            <div class="form-group d-flex" >
                                <select name="id_equipo" >
                                    <option>Equipos...</option>
                                    <br>
                                    <% 
                                        EquipoVO equVO = new EquipoVO();
                                        EquipoDAO equDAO = new EquipoDAO();
                                        ArrayList<EquipoVO> listaEquipos = equDAO.listar();
                                        for(int i = 0; i < listaEquipos.size(); i++)
                                        {
                                            equVO = listaEquipos.get(i);
                                    %>
                                    <option value="<%=equVO.getId_equipo()%>"><%=equVO.getNombre_equipo()%></option>
                                    <%}%>
                                   
                                </select>
                                <br>
                                <div class="col-sm-6 d-flex">
                                    <!--<input type="text" name="id_equipo" value="${nombre_equipo.getId_equipo()}" class="form-control" placeholder="Codigo">-->
                                    <input type="submit" name="accion" value="Seleccionar" class="btn btn-outline-primary" style="margin-left: 3px">
                                </div>
                                    <br>
                            
                            </div>
                                <br>
                            <div class="form-group d-flex">
                                <div class="col-sm-3">
                                    <input type="number" name="cantidad" value="1" class="form-control" >
                                </div>
                                <div class="col-sm-3">
                                    <input type="text" name="cantidad_equipo" value="${nombre_equipo.getCantidad_equipo()}" class="form-control" placeholder="Stock" disabled="disabled">
                                </div>
                            </div>
                            <%--AGREGAR PRODUCTO AL REGISTRO--%>
                            <br>
                            <div class="form-group">
                                <button type="submit" class="btn btn-outline-info">AGREGAR</button>
                                <input type="hidden" name="accion" value="Agregar">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <br>
                        <table class="table table-hover" >
                            <thead>                           
                                <tr>
                                    <th>ID</th>
                                    <th>Producto</th>
                                    <th>Nombre</th>
                                    <th>Cantidad</th>
                                </tr>
                            </thead>
                            <tbody>
                                <pedVO:forEach var="list" items="${lista}" >
                                    <tr>
                                        <td>${list.getItem()}</td>
                                        <td>${list.getId_producto()}</td>
                                        <td>${list.getNombre_equipo()}</td>
                                        <td><a href="Controlador?menu=NuevaVenta&accion=SumarCantidad" class="btn btn-success"> + </a>  ${list.getCantidad()}  <a href="Controlador?menu=NuevaVenta&accion=RestarCantidad" class="btn btn-danger"> - </a></td>
                                    </tr>
                                </pedVO:forEach>
                            </tbody>
                        </table>

                    </div>
                    <div class="card-footer d-flex">
                        <div class="col-sm-6">
                            <form action="Controlador?menu=NuevaVenta&accion=Seleccionar" method="POST">
                                <input type="hidden" name="text_Idusuario" value="<%=rolVO.getId_rol()%>">
                            </form>
                            <a href="Controlador?menu=NuevaVenta&accion=GenerarVenta" class="btn btn-success">Generar Pedido</a>
                            <a href="Controlador?menu=NuevaVenta&accion=Cancelar" class="btn btn-primary">Cancelar</a>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigianonymous>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script> 
    </body>
</html>
