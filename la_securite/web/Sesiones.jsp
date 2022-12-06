<%-- 
    Document   : Sesiones
    Created on : 23/05/2022, 10:28:35 a. m.
    Author     : uSER
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="index.css" rel="stylesheet" type="text/css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>Sesiones</title>
    </head>
    <%
      response.setHeader("Pragma","No-cache");
      response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
      response.setDateHeader("Expires",0);
    %>
    <%
        HttpSession miSesion = (HttpSession) request.getSession();
        String nom_usu = "";
        if (miSesion.getAttribute("datosUsuario") == null) 
        {
            request.getRequestDispatcher("inicioSesion.jsp").forward(request, response);
        } 
        else 
        {
            UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("datosUsuario");
            nom_usu = usuVO.getNom_usu();
        }
    %>
    <body>
        <header>
            <div class="contenedor">
                <h4 style="color:#ffffff;">Bienvenido: <%=nom_usu%></h>   
                <form method="post" action="Sesiones">
                    <button style="" class="btn btn-success"> Cerrar sesion</button>
                    <input type="hidden" value="Cerrar sesion">
                </form>
            </div>
        </header>
    </body>
</html>
