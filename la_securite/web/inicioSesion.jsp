<%-- 
    Document   : inicioSesion
    Created on : 16/05/2022, 07:51:37 AM
    Author     : Sena
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/validacion.css">     
        <title>Login Insave</title>  
        <link rel="stylesheet" href="css/inicioSesion.css">
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
    </head>

    <body>
        <div class="main">
            <input type="checkbox" id="chk" aria-hidden="true">

            <div class="signup">
                <div class="imagen">
                    <a href="dashboardCliente.jsp"><img src="img/INSAVE.png" alt=""></a>
                </div>
                <div class="reg">
                      <label class="uno" for="chk" aria-hidden="true">Registrar</label>
                      <center>
                               <button class="cinco"><a href="index.jsp">Volver</a></button>
                      </center>
                </div>
           
                <form method="post" action="Usuario">
                    <div id="form">

                      
                        
                            <div class="formulario__grupo" id="grupo__textUsuario">                            
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name="textUsuario" id="textUsuario" placeholder="Nombre">
                                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">Solo puede contener letras</p>
                            </div>


                            <div class="formulario__grupo" id="grupo__textNumDoc">                            
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name="textNumDoc" id="textNumDoc" placeholder="Numero Documento">
                                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">Número de Documento no valido.</p>
                            </div>

                            <div class="formulario__grupo" id="grupo__texTipoDocQ" required="">                                
                                <div class="formulario__grupo-select">
                                    <select class="formulario_select" name="texTipoDocQ" id="texTipoDocQ">    
                                        <option value="o" disabled="disabled">Seleccione..</option>   
                                        <option value="C.C">C.C</option>
                                        <option value="T.I">T.I</option>
                                        <option value="Otro">Otro</option>
                                    </select>
                                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">Seleccione una opcion</p>
                            </div>
                        
                            <div class="formulario__grupo" id="grupo__textClave">                            
                                <div class="formulario__grupo-input">
                                    <input type="password" class="formulario__input" name="textClave" id="textClave" placeholder="contraseña">
                                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">Debe ser más extensa</p>
                            </div>

                            <div class="formulario__grupo" id="grupo__textTelefono">                            
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name="textTelefono" id="textTelefono" placeholder="Telefono">
                                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">Número de Telefono no valido</p>
                            </div>

                            <div class="formulario__grupo" id="grupo__textCorreo">                            
                            <div class="formulario__grupo-input">
                                <input type="email" class="formulario__input" name="textCorreo" id="textCorreo" placeholder="Correo">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Correo no valido</p>
                        </div>     
                        
                         <input type="hidden" name="textIdRol" value="1"><br>

                        <input type="hidden" name="textEstado" value="Activo"><br>
                            
                        
                        <br>
                        <button>Enviar</button>
                        
                    <input type="hidden" value="1" name="opcion">
                    </div>
                </form>        
            </div>

            <div class="login">
                <form method="post" action="Usuario">
                    <label for="chk" aria-hidden="true">Ingresar</label>
                    <input class="log" type="text" name="textUsuario" placeholder="Usuario" required="">
                    <input class="log" type="password" name="textClave" placeholder="Clave" required="">
                    <button class="loginbutton">Login</button>
                    <input type="hidden" value="2" name="opcion">

                </form>
            </div>
        </div>
    </body>
    <script src="js/validacion.js"></script>
    <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
    crossorigin="anonymous"></script>

</html>
