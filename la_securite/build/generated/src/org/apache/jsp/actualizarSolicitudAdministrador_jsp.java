package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.AdministrarSolicitudVO;

public final class actualizarSolicitudAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("                Fecha de la solicitud:<br> \n");
      out.write("                <input type=\"text\" name=\"textFechaSolicitud\" value=\"");
      out.print(adSoliVO.getFecha_solicitud());
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
      out.write("\"><br>\n");
      out.write("                <input type=\"hidden\" name=\"textEstadoSolicitud\" value=\"");
      out.print(adSoliVO.getEstado_solicitud());
      out.write("\"><br>\n");
      out.write("                </tr>\n");
      out.write("            </table><br>\n");
      out.write("            <button class=\"btn btn-success\">Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("            <button class=\"btn btn-primary\"><a href=\"consultarSolicitudAdministrador.jsp\">Volver</a></button>             \n");
      out.write("        </form>  \n");
      out.write("        ");
 } 
        else 
        {
            request.getRequestDispatcher("consultarSolicitudAdministrador.jsp").forward(request, response);
        }
      out.write("\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
