package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuarioCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/validacion.css\">   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/actualizaciones.css\">\n");
      out.write("                  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Registrarse</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            ");
                 if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                ");
 } else { 
      out.write("\n");
      out.write("                                <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                ");
 }
                                
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <h3 class=\"title is-3\">Registrate</h3>\n");
      out.write("\n");
      out.write("            <form method=\"post\" action=\"Usuario\">\n");
      out.write("                <div id=\"form\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__textUsuario\">\n");
      out.write("                            <label for=\"usuario\" class=\"formulario__label\">Usuario</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"text\" class=\"formulario__input\" name=\"textUsuario\" id=\"textUsuario\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Solo puede contener letras</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__textClave\">\n");
      out.write("                            <label for=\"usuario\" class=\"formulario__label\">Contraseña</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"password\" class=\"formulario__input\" name=\"textClave\" id=\"textClave\" >\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Debe ser más extensa</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__texTipoDocQ\">\n");
      out.write("                            <label for=\"usuario\" class=\"formulario__label\">Tipo de Documento</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"text\" class=\"formulario__input\" name=\"texTipoDocQ\" id=\"texTipoDocQ\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Solo puede contener dos letras</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__textNumDoc\">\n");
      out.write("                            <label for=\"usuario\" class=\"formulario__label\">Numero de Documento</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"text\" class=\"formulario__input\" name=\"textNumDoc\" id=\"textNumDoc\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">El documento tiene que ser de 5 a 10 dígitos y solo puede contener numeros.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__textTelefono\">\n");
      out.write("                            <label for=\"usuario\" class=\"formulario__label\">Telefono</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"text\" class=\"formulario__input\" name=\"textTelefono\" id=\"textTelefono\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">El documento tiene que ser de 5 a 10 dígitos y solo puede contener numeros.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__textCorreo\">\n");
      out.write("                            <label for=\"usuario\" class=\"formulario__label\">Correo</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"email\" class=\"formulario__input\" name=\"textCorreo\" id=\"textCorreo\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Correo no valido</p>\n");
      out.write("                        </div>                               \n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"textIdRol\" value=\"1\"><br>\n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"textEstado\" value=\"Activo\"><br>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </table>              \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <button>Enviar</button>\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                    <h2><a href=\"inicioSesion.jsp\">¿Ya tienes cuenta? Inicia Sesion</a></h2>       \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            ");

                if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/validacion.js\"></script>\n");
      out.write("\n");
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
