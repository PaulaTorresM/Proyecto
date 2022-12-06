package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.AdministrarSolicitudDAO;
import ModeloVO.AdministrarSolicitudVO;
import ModeloVO.UsuarioVO;

public final class consultarSolicitudAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Sesiones.css\" rel=\"stylesheet\" type=\"text/css\">\n");
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
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h1 style=\"color:#ffffff; margin-left: 30px\">  Bienvenido: ");
      out.print(nom_usu);
      out.write("</h1>   \n");
      out.write("                <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                    <button style=\" margin-left: 30px\"> Cerrar sesion</button>\n");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>¡CONSULTAR SOLICITUD ADMINISTRADOR!</h1>\n");
      out.write("        <form method=\"POST\" action=\"AdministrarSolicitudControlador\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    ID:<br>\n");
      out.write("                <input type=\"text\" name=\"textId\"><br>\n");
      out.write("                </tr>\n");
      out.write("            </table><br><br>\n");
      out.write("            <button class=\"btn btn-success\">Consultar</button>\n");
      out.write("            <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("        </form><br><br>\n");
      out.write("        ");

            if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("            <table class=\"table table-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"bg-warning\">SEGUIMIENTO</th>\n");
      out.write("                    <th class=\"bg-warning\">PEDIDO</th>\n");
      out.write("                    <th class=\"bg-warning\">FECHA_SOLICITUD</th>\n");
      out.write("                    <th class=\"bg-warning\">DESCRIPCION_SOLICITUD</th>\n");
      out.write("                    <th class=\"bg-warning\">FECHA_INSTALACION</th>\n");
      out.write("                    <th class=\"bg-warning\">ESTADO_INSTALACION</th>\n");
      out.write("                    <th class=\"bg-warning\">TECNICO</th>\n");
      out.write("                    <th class=\"bg-warning\">ESTADO_SOLICITUD</th>\n");
      out.write("                    <th class=\"bg-warning\">ACCIONES</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    AdministrarSolicitudVO adSoliVO = new AdministrarSolicitudVO();
                    AdministrarSolicitudDAO adSoliDAO = new AdministrarSolicitudDAO();
                    ArrayList<AdministrarSolicitudVO> listaSolicitudes = adSoliDAO.listar();
                    for (int i = 0; i < listaSolicitudes.size(); i++) 
                    {

                        adSoliVO = listaSolicitudes.get(i);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getId_seguimiento());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getId_pedidoC());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getFecha_solicitud());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getDescripcion_solicitud());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getFecha_instalacion() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getEstado_instalacion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getId_usuario());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( adSoliVO.getEstado_solicitud());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
 
                            if(adSoliVO.getEstado_solicitud().equals("Activo"))
                            {
                        
      out.write("\n");
      out.write("                        <form method=\"POST\" action=\"AdministrarSolicitudControlador\">\n");
      out.write("                            <button name=\"editar\" value=\"");
      out.print(adSoliVO.getId_seguimiento());
      out.write("\">Editar</button>\n");
      out.write("                            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("                        </form>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("              <button class=\"btn btn-primary\"><a href=\"registrarSolicitudAdministrador.jsp\">Registrar</a></button>  \n");
      out.write("    </center> \n");
      out.write("    </body>\n");
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
