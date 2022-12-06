package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.AdministrarSolicitudVO;
import ModeloVO.UsuarioVO;

public final class actualizarSolicitudTecnico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Sesiones.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("                <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Sesiones</title>\n");
      out.write("    </head>\n");
      out.write("    ");

      response.setHeader("Pragma","No-cache");
      response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
      response.setDateHeader("Expires",0);
    
      out.write("\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"contenedor\" style=\"background-color: #1812DA\n");
      out.write("\">\n");
      out.write("                <h1 style=\"color:#ffffff; margin-left: 30px\">  Bienvenido: ");
      out.print(nom_usu);
      out.write("</h1>   \n");
      out.write("                <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                    <button style=\" margin-left: 30px\" class=\"btn btn-success\"> Cerrar sesion</button>\n");
      out.write("                    <input type=\"hidden\" value=\"Cerrar sesion\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");

            AdministrarSolicitudVO adSoliVO = (AdministrarSolicitudVO) request.getAttribute("AdministrarSolicitudControlador");
            if (adSoliVO != null) 
            {
        
      out.write("                          \n");
      out.write("        <h1>¡ACTUALIZAR SOLICITUD!</h1>\n");
      out.write("        <form method=\"POST\" action=\"AdministrarSolicitudControlador\">   \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                <input type=\"hidden\" name=\"textId\" value=\"");
      out.print(adSoliVO.getId_seguimiento());
      out.write("\" readonly><br>\n");
      out.write("                Pedido:<br>\n");
      out.write("                <input type=\"text\" name=\"textPedidoC\" value=\"");
      out.print(adSoliVO.getId_pedidoC());
      out.write("\" readonly><br>\n");
      out.write("                Descripcion:<br> \n");
      out.write("                <input type=\"text\" name=\"texDescripcion\" value=\"");
      out.print(adSoliVO.getDescripcion_solicitud());
      out.write("\" readonly><br>\n");
      out.write("                Fecha de la instalacion:<br> \n");
      out.write("                <input type=\"text\" name=\"textFechaInstalacion\" value=\"");
      out.print(adSoliVO.getFecha_instalacion());
      out.write("\" readonly><br>\n");
      out.write("                Estado de la instalacion:<br> \n");
      out.write("                <input type=\"text\" name=\"textEstadoInstalacion\" value=\"");
      out.print(adSoliVO.getEstado_instalacion());
      out.write("\"><br>\n");
      out.write("                Tecnico:<br> \n");
      out.write("                <input type=\"text\" name=\"textIdUsuario\" value=\"");
      out.print(adSoliVO.getId_usuario());
      out.write("\" readonly><br><br>\n");
      out.write("                </tr>\n");
      out.write("            </table><br>\n");
      out.write("            <button class=\"btn btn-success\">Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("            <button class=\"btn btn-primary\"><a href=\"ConsultarInstalacionTecnico.jsp\">Volver</a></button>             \n");
      out.write("        </form>  \n");
      out.write("        ");
 } 
        else 
        {
            request.getRequestDispatcher("ConsultarInstalacionTecnico.jsp").forward(request, response);
        }
      out.write("Administrador\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
