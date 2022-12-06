package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.AdministrarSolicitudDAO;
import ModeloVO.AdministrarSolicitudVO;
import ModeloVO.UsuarioVO;

public final class ConsultarInstalacionTecnico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/INSAVE.png\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>\n");
      out.write("            Insave\n");
      out.write("        </title>\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Nucleo Icons -->\n");
      out.write("        <link href=\"../assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"../assets/css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/42d5adcbca.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link id=\"pagestyle\" href=\"css/index.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"g-sidenav-show   bg-gray-100\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"min-height-300 bg-primary position-absolute w-100\"></div>\n");
      out.write("        <aside class=\"sidenav bg-white navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-4 \" id=\"sidenav-main\">\n");
      out.write("            <div class=\"sidenav-header\">\n");
      out.write("\n");
      out.write("                <i class=\"fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none\" aria-hidden=\"true\" id=\"iconSidenav\"></i>\n");
      out.write("                <a class=\"navbar-brand m-0\" href=\"\" target=\"_blank\">\n");
      out.write("                    <img src=\"img/INSAVE.png\" class=\"navbar-brand-img h-100\" alt=\"main_logo\">\n");
      out.write("\n");
      out.write("                    <span class=\"ms-1 font-weight-bold\">Menú</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <hr class=\"horizontal dark mt-0\">\n");
      out.write("            <div class=\"collapse navbar-collapse  w-auto \" id=\"sidenav-collapse-main\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"ConsultarInstalacionTecnico.jsp\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"ni ni-tv-2 text-primary text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Solicitudes</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"consultarEquipoTecnico.jsp\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"ni ni-calendar-grid-58 text-warning text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Equipos</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>             \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </aside>\n");
      out.write("        <main class=\"main-content position-relative border-radius-lg \">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl \" id=\"navbarBlur\" data-scroll=\"false\">\n");
      out.write("                <div class=\"container-fluid py-1 px-3\">\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\n");
      out.write("\n");
      out.write("                        <ol class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\n");
      out.write("                            <li class=\"breadcrumb-item text-sm\"><a class=\"opacity-5 text-white\" href=\"javascript:;\">Pages</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item text-sm text-white active\" aria-current=\"page\">Dashboard</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <h6 class=\"font-weight-bolder text-white mb-0\">Dashboard</h6>\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
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
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h4 style=\"color:#ffffff;\">Bienvenido: ");
      out.print(nom_usu);
      out.write("</h>   \n");
      out.write("                <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                    <button style=\"\" class=\"btn btn-success\"> Cerrar sesion</button>\n");
      out.write("                    <input type=\"hidden\" value=\"Cerrar sesion\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    </nav>        \n");
      out.write("            </nav>\n");
      out.write("            <!-- End Navbar -->\n");
      out.write("            <div class=\"container-fluid py-4\">\n");
      out.write("                <div class=\"row mt-4\">\n");
      out.write("                    <div class=\"col-lg-7 mb-lg-0 mb-4\">\n");
      out.write("                        <div class=\"card \">\n");
      out.write("                            <div class=\"card-header pb-0 p-3\">\n");
      out.write("                                <div class=\"d-flex justify-content-between\">\n");
      out.write("                                    <h6 class=\"mb-2\">Solicitudes</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <center>\n");
      out.write("                                <br>\n");
      out.write("                                <h1>¡CONSULTAR INSTALACION TECNICO!</h1>\n");
      out.write("                                <form method=\"POST\" action=\"AdministrarSolicitudControlador\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr>\n");
      out.write("                                            ID:<br>\n");
      out.write("                                        <input type=\"text\" name=\"textId\"><br>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table><br><br>\n");
      out.write("                                    <button class=\"btn btn-success\">Consultar</button>\n");
      out.write("                                    <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                                </form><br><br>\n");
      out.write("                                ");
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
      out.write("                                <table class=\"table table-light\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        \n");
      out.write("                                        <th class=\"bg-info\">PEDIDO</th>\n");
      out.write("                                        <th class=\"bg-info\">DESCRIPCION DE SOLICITUD</th>\n");
      out.write("                                        <th class=\"bg-info\">FECHA DE INSTALACION</th>\n");
      out.write("                                        <th class=\"bg-info\">ESTADO DE INSTALACION</th>\n");
      out.write("                                        <th class=\"bg-info\">TECNICO</th>\n");
      out.write("                                        <th class=\"bg-info\">INFORME</th>\n");
      out.write("                                        <th class=\"bg-info\">GENERAR AC.E</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        AdministrarSolicitudVO adSoliVO = new AdministrarSolicitudVO();
                                        AdministrarSolicitudDAO adSoliDAO = new AdministrarSolicitudDAO();
                                        ArrayList<AdministrarSolicitudVO> listaSolicitudes = adSoliDAO.listar();
                                        for (int i = 0; i < listaSolicitudes.size(); i++) {

                                            adSoliVO = listaSolicitudes.get(i);
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        \n");
      out.write("                                        <td>");
      out.print( adSoliVO.getId_pedidoC());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( adSoliVO.getDescripcion_solicitud());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( adSoliVO.getFecha_instalacion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( adSoliVO.getEstado_instalacion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(nom_usu);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( adSoliVO.getInforme());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        <td>\n");
      out.write("                                            ");

                                                if (adSoliVO.getEstado_instalacion().equals("Terminada")) {
                                            
      out.write("\n");
      out.write("                                            <form method=\"POST\" action=\"AdministrarSolicitudControlador\">\n");
      out.write("                                                <button class=\"btn btn-dark\"><a href=\"public/uploads/Acta de Entrega de Satisfacción.pdf\" download=\"Acta de entrega\" title=\"Descargar acta de entrega\">Descargar</a></button>  \n");
      out.write("                                            </form>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                            </center> \n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("                </div>\n");
      out.write("            </div>      \n");
      out.write("        </main>\n");
      out.write("        <!--   Core JS Files   -->\n");
      out.write("        <script src=\"../assets/js/core/popper.min.js\"></script>\n");
      out.write("        <script src=\"../assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../assets/js/plugins/perfect-scrollbar.min.js\"></script>\n");
      out.write("        <script src=\"../assets/js/plugins/smooth-scrollbar.min.js\"></script>\n");
      out.write("        <script src=\"../assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var ctx1 = document.getElementById(\"chart-line\").getContext(\"2d\");\n");
      out.write("\n");
      out.write("            var gradientStroke1 = ctx1.createLinearGradient(0, 230, 0, 50);\n");
      out.write("\n");
      out.write("            gradientStroke1.addColorStop(1, 'rgba(94, 114, 228, 0.2)');\n");
      out.write("            gradientStroke1.addColorStop(0.2, 'rgba(94, 114, 228, 0.0)');\n");
      out.write("            gradientStroke1.addColorStop(0, 'rgba(94, 114, 228, 0)');\n");
      out.write("            new Chart(ctx1, {\n");
      out.write("                type: \"line\",\n");
      out.write("                data: {\n");
      out.write("                    labels: [\"Apr\", \"May\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"],\n");
      out.write("                    datasets: [{\n");
      out.write("                            label: \"Mobile apps\",\n");
      out.write("                            tension: 0.4,\n");
      out.write("                            borderWidth: 0,\n");
      out.write("                            pointRadius: 0,\n");
      out.write("                            borderColor: \"#5e72e4\",\n");
      out.write("                            backgroundColor: gradientStroke1,\n");
      out.write("                            borderWidth: 3,\n");
      out.write("                            fill: true,\n");
      out.write("                            data: [50, 40, 300, 220, 500, 250, 400, 230, 500],\n");
      out.write("                            maxBarThickness: 6\n");
      out.write("\n");
      out.write("                        }],\n");
      out.write("                },\n");
      out.write("                options: {\n");
      out.write("                    responsive: true,\n");
      out.write("                    maintainAspectRatio: false,\n");
      out.write("                    plugins: {\n");
      out.write("                        legend: {\n");
      out.write("                            display: false,\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    interaction: {\n");
      out.write("                        intersect: false,\n");
      out.write("                        mode: 'index',\n");
      out.write("                    },\n");
      out.write("                    scales: {\n");
      out.write("                        y: {\n");
      out.write("                            grid: {\n");
      out.write("                                drawBorder: false,\n");
      out.write("                                display: true,\n");
      out.write("                                drawOnChartArea: true,\n");
      out.write("                                drawTicks: false,\n");
      out.write("                                borderDash: [5, 5]\n");
      out.write("                            },\n");
      out.write("                            ticks: {\n");
      out.write("                                display: true,\n");
      out.write("                                padding: 10,\n");
      out.write("                                color: '#fbfbfb',\n");
      out.write("                                font: {\n");
      out.write("                                    size: 11,\n");
      out.write("                                    family: \"Open Sans\",\n");
      out.write("                                    style: 'normal',\n");
      out.write("                                    lineHeight: 2\n");
      out.write("                                },\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        x: {\n");
      out.write("                            grid: {\n");
      out.write("                                drawBorder: false,\n");
      out.write("                                display: false,\n");
      out.write("                                drawOnChartArea: false,\n");
      out.write("                                drawTicks: false,\n");
      out.write("                                borderDash: [5, 5]\n");
      out.write("                            },\n");
      out.write("                            ticks: {\n");
      out.write("                                display: true,\n");
      out.write("                                color: '#ccc',\n");
      out.write("                                padding: 20,\n");
      out.write("                                font: {\n");
      out.write("                                    size: 11,\n");
      out.write("                                    family: \"Open Sans\",\n");
      out.write("                                    style: 'normal',\n");
      out.write("                                    lineHeight: 2\n");
      out.write("                                },\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                    },\n");
      out.write("                },\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var win = navigator.platform.indexOf('Win') > -1;\n");
      out.write("            if (win && document.querySelector('#sidenav-scrollbar')) {\n");
      out.write("                var options = {\n");
      out.write("                    damping: '0.5'\n");
      out.write("                }\n");
      out.write("                Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- Github buttons -->\n");
      out.write("        <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
      out.write("        <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("        <script src=\"../assets/js/argon-dashboard.min.js?v=2.0.4\"></script>\n");
      out.write("    </body>\n");
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
