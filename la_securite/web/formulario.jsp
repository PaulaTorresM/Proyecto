<!DOCTYPE html>
<html>

<head>
  <title>Slide Navbar</title>  
  <link rel="stylesheet" href="assets/css/slide navbar style.css">
  <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>

<body>
  <div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">

    <div class="signup">
      <div class="imagen">
        <a href="index.html"><img src="assets/img/logo/INSAVE.png" alt=""></a>
      </div>
      <form>
        
        <label class="uno" for="chk" aria-hidden="true">Registrar</label>
       
        <div class="primero">

        <input type="text" name="txt" placeholder="Usuario" required="">
        <input type="number" name="txt" placeholder="Num Doc" required="">
        <input type="text" name="txt" placeholder="Tipo Doc" required="">
        
        </div>
          
           
      <div class="segundo">
        <input type="password" name="email" placeholder="Contraseña" required="">
        <input type="number" name="pswd" placeholder="Telefono" required="">
        <input type="email" name="pswd" placeholder="Correo" required="">
      </div>
    <br>
    

        <button>Registrarse</button>
      </form>
    </div>

    <div class="login">
      <form>
        <label for="chk" aria-hidden="true">Ingresar</label>
        <input type="email" name="email" placeholder="Usuario" required="">
        <input type="password" name="pswd" placeholder="Clave" required="">
        <button class="loginbutton">Login</button>
      </form>
    </div>
  </div>
</body>

</html>