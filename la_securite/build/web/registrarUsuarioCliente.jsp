<%-- 
    Document   : registrarUsuarioCliente
    Created on : 8/09/2022, 06:49:13 AM
    Author     : uSER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/validacion.css">   
        <link rel="stylesheet" href="css/actualizaciones.css">
                  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


        <title>Registrarse</title>
    </head>
    <body>
            <%                 if (request.getAttribute("mensajeError") != null) {%>
                                <div class="alert alert-danger" role="alert">
                                    ${mensajeError}
                                </div>
                                <% } else { %>
                                <div class="alert alert-success" role="alert">
                                    ${mensajeExito}
                                </div>
                                <% }
                                %>
        <section>
            <h3 class="title is-3">Registrate</h3>

            <form method="post" action="Usuario">
                <div id="form">
                    <table>
                        <tr>
                        <div class="formulario__grupo" id="grupo__textUsuario">
                            <label for="usuario" class="formulario__label">Usuario</label>
                            <div class="formulario__grupo-input">
                                <input type="text" class="formulario__input" name="textUsuario" id="textUsuario">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Solo puede contener letras</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__textClave">
                            <label for="usuario" class="formulario__label">Contraseña</label>
                            <div class="formulario__grupo-input">
                                <input type="password" class="formulario__input" name="textClave" id="textClave" >
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Debe ser más extensa</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__texTipoDocQ">
                            <label for="usuario" class="formulario__label">Tipo de Documento</label>
                            <div class="formulario__grupo-input">
                                <input type="text" class="formulario__input" name="texTipoDocQ" id="texTipoDocQ">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Solo puede contener dos letras</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__textNumDoc">
                            <label for="usuario" class="formulario__label">Numero de Documento</label>
                            <div class="formulario__grupo-input">
                                <input type="text" class="formulario__input" name="textNumDoc" id="textNumDoc">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">El documento tiene que ser de 5 a 10 dígitos y solo puede contener numeros.</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__textTelefono">
                            <label for="usuario" class="formulario__label">Telefono</label>
                            <div class="formulario__grupo-input">
                                <input type="text" class="formulario__input" name="textTelefono" id="textTelefono">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">El documento tiene que ser de 5 a 10 dígitos y solo puede contener numeros.</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__textCorreo">
                            <label for="usuario" class="formulario__label">Correo</label>
                            <div class="formulario__grupo-input">
                                <input type="email" class="formulario__input" name="textCorreo" id="textCorreo">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Correo no valido</p>
                        </div>                               

                        <input type="hidden" name="textIdRol" value="1"><br>

                        <input type="hidden" name="textEstado" value="Activo"><br>

                        </tr>
                    </table>              



                    <button>Enviar</button>
                    <input type="hidden" value="1" name="opcion">
                    <h2><a href="inicioSesion.jsp">¿Ya tienes cuenta? Inicia Sesion</a></h2>       
                </div>
            </form>
            <br>
            <%
                if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <% } else {%>
            ${mensajeExito}
            <%}%>
        </section>
    </body>
    <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
    crossorigin="anonymous"></script>
    <script src="js/validacion.js"></script>


</html>
