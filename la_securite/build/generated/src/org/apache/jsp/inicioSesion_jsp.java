package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicioSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/validacion.css\">     \n");
      out.write("        <title>Login Insave</title>  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/inicioSesion.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <input type=\"checkbox\" id=\"chk\" aria-hidden=\"true\">\n");
      out.write("\n");
      out.write("            <div class=\"signup\">\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <a href=\"dashboardCliente.jsp\"><img src=\"img/INSAVE.png\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"reg\">\n");
      out.write("                      <label class=\"uno\" for=\"chk\" aria-hidden=\"true\">Registrar</label>\n");
      out.write("                </div>\n");
      out.write("                <form method=\"post\" action=\"Usuario\">\n");
      out.write("                    <div id=\"form\">\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                            <div class=\"formulario__grupo\" id=\"grupo__textUsuario\">                            \n");
      out.write("                                <div class=\"formulario__grupo-input\">\n");
      out.write("                                    <input type=\"text\" class=\"formulario__input\" name=\"textUsuario\" id=\"textUsuario\" placeholder=\"Nombre\">\n");
      out.write("                                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"formulario__input-error\">Solo puede contener letras</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"formulario__grupo\" id=\"grupo__textNumDoc\">                            \n");
      out.write("                                <div class=\"formulario__grupo-input\">\n");
      out.write("                                    <input type=\"text\" class=\"formulario__input\" name=\"textNumDoc\" id=\"textNumDoc\" placeholder=\"Numero Documento\">\n");
      out.write("                                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"formulario__input-error\">Número de Documento no valido.</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"formulario__grupo\" id=\"grupo__texTipoDocQ\" required=\"\">                                \n");
      out.write("                                <div class=\"formulario__grupo-select\">\n");
      out.write("                                    <select class=\"formulario_select\" name=\"texTipoDocQ\" id=\"texTipoDocQ\">    \n");
      out.write("                                        <option value=\"o\" disabled=\"disabled\">Seleccione..</option>   \n");
      out.write("                                        <option value=\"C.C\">C.C</option>\n");
      out.write("                                        <option value=\"T.I\">T.I</option>\n");
      out.write("                                        <option value=\"Otro\">Otro</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"formulario__input-error\">Seleccione una opcion</p>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"formulario__grupo\" id=\"grupo__textClave\">                            \n");
      out.write("                                <div class=\"formulario__grupo-input\">\n");
      out.write("                                    <input type=\"password\" class=\"formulario__input\" name=\"textClave\" id=\"textClave\" placeholder=\"contraseña\">\n");
      out.write("                                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"formulario__input-error\">Debe ser más extensa</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"formulario__grupo\" id=\"grupo__textTelefono\">                            \n");
      out.write("                                <div class=\"formulario__grupo-input\">\n");
      out.write("                                    <input type=\"text\" class=\"formulario__input\" name=\"textTelefono\" id=\"textTelefono\" placeholder=\"Telefono\">\n");
      out.write("                                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"formulario__input-error\">Número de Telefono no valido</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"formulario__grupo\" id=\"grupo__textCorreo\">                            \n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"email\" class=\"formulario__input\" name=\"textCorreo\" id=\"textCorreo\" placeholder=\"Correo\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Correo no valido</p>\n");
      out.write("                        </div>     \n");
      out.write("                        \n");
      out.write("                         <input type=\"hidden\" name=\"textIdRol\" value=\"1\"><br>\n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"textEstado\" value=\"Activo\"><br>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <button>Enviar</button>\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                    </div>\n");
      out.write("                </form>        \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <form method=\"post\" action=\"Usuario\">\n");
      out.write("                    <label for=\"chk\" aria-hidden=\"true\">Ingresar</label>\n");
      out.write("                    <input class=\"log\" type=\"text\" name=\"textUsuario\" placeholder=\"Usuario\" required=\"\">\n");
      out.write("                    <input class=\"log\" type=\"password\" name=\"textClave\" placeholder=\"Clave\" required=\"\">\n");
      out.write("                    <button class=\"loginbutton\">Login</button>\n");
      out.write("                    <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/validacion.js\"></script>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
