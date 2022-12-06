<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.AdministrarSolicitudDAO"%>
<%@page import="ModeloVO.AdministrarSolicitudVO"%>

<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="img/INSAVE.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>
            Insave
        </title>
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
        <!-- Nucleo Icons -->
        <link href="../assets/css/nucleo-icons.css" rel="stylesheet" />
        <link href="../assets/css/nucleo-svg.css" rel="stylesheet" />
        <!-- Font Awesome Icons -->
        <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
        <!-- CSS Files -->
        <link id="pagestyle" href="css/index.css" rel="stylesheet" />
    </head>

    <body class="g-sidenav-show   bg-gray-100">


        <div class="min-height-300 bg-primary position-absolute w-100"></div>
        <aside class="sidenav bg-white navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-4 " id="sidenav-main">
            <div class="sidenav-header">

                <i class="fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none" aria-hidden="true" id="iconSidenav"></i>
                <a class="navbar-brand m-0" href="" target="_blank">
                    <img src="img/INSAVE.png" class="navbar-brand-img h-100" alt="main_logo">

                    <span class="ms-1 font-weight-bold">Menú</span>
                </a>
            </div>
            <hr class="horizontal dark mt-0">
            <div class="collapse navbar-collapse  w-auto " id="sidenav-collapse-main">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" href="ConsultarInstalacionTecnico.jsp">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="ni ni-tv-2 text-primary text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Solicitudes</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="consultarEquipoTecnico.jsp">
                            <div class="icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center">
                                <i class="ni ni-calendar-grid-58 text-warning text-sm opacity-10"></i>
                            </div>
                            <span class="nav-link-text ms-1">Equipos</span>
                        </a>
                    </li>             
                </ul>
            </div>

        </aside>
        <main class="main-content position-relative border-radius-lg ">
            <!-- Navbar -->
            <nav class="navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl " id="navbarBlur" data-scroll="false">
                <div class="container-fluid py-1 px-3">
                    <nav aria-label="breadcrumb">

                        <ol class="breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5">
                            <li class="breadcrumb-item text-sm"><a class="opacity-5 text-white" href="javascript:;">Pages</a></li>
                            <li class="breadcrumb-item text-sm text-white active" aria-current="page">Dashboard</li>
                        </ol>
                        <h6 class="font-weight-bolder text-white mb-0">Dashboard</h6>
                        <%@include file="Sesiones.jsp"%>
                    </nav>        
            </nav>
            <!-- End Navbar -->
            <div class="container-fluid py-4">
                <div class="row mt-4">
                    <div class="col-lg-7 mb-lg-0 mb-4">
                        <div class="card ">
                            <div class="card-header pb-0 p-3">
                                <div class="d-flex justify-content-between">
                                    <h6 class="mb-2">Solicitudes</h6>
                                </div>
                            </div>
                            <center>
                                <br>
                                <h1>¡CONSULTAR INSTALACION TECNICO!</h1>
                                <form method="POST" action="AdministrarSolicitudControlador">
                                    <table>
                                        <tr>
                                            ID:<br>
                                        <input type="text" name="textId"><br>
                                        </tr>
                                    </table><br><br>
                                    <button class="btn btn-success">Consultar</button>
                                    <input type="hidden" value="4" name="opcion">
                                </form><br><br>
                                <%            if (request.getAttribute("mensajeError") != null) {%>
                                <div class="alert alert-danger" role="alert">
                                    ${mensajeError}
                                </div>
                                <% } else { %>
                                <div class="alert alert-success" role="alert">
                                    ${mensajeExito}
                                </div>
                                <% }
                                %>
                                <table class="table table-light">
                                    <tr>
                                        
                                       
                                        <th class="bg-info">DESCRIPCION DE SOLICITUD</th>
                                        <th class="bg-info">FECHA DE INSTALACION</th>
                                        <th class="bg-info">ESTADO DE INSTALACION</th>
                                        <th class="bg-info">TECNICO</th>
                                        <th class="bg-info">INFORME</th>
                                        <th class="bg-info">GENERAR AC.E</th>

                                    </tr>
                                    <%
                                        AdministrarSolicitudVO adSoliVO = new AdministrarSolicitudVO();
                                        AdministrarSolicitudDAO adSoliDAO = new AdministrarSolicitudDAO();
                                        ArrayList<AdministrarSolicitudVO> listaSolicitudes = adSoliDAO.listar();
                                        for (int i = 0; i < listaSolicitudes.size(); i++) {

                                            adSoliVO = listaSolicitudes.get(i);
                                    %>
                                    <tr>
                                        
                                     
                                        <td><%= adSoliVO.getDescripcion_solicitud()%></td>
                                        <td><%= adSoliVO.getFecha_instalacion()%></td>
                                        <td><%= adSoliVO.getEstado_instalacion()%></td>
                                        <td><%=nom_usu%></td>
                                        <td><%= adSoliVO.getInforme()%></td>

                                        <td>
                                            <%
                                                if (adSoliVO.getEstado_instalacion().equals("Terminada")) {
                                            %>
                                            <form method="POST" action="AdministrarSolicitudControlador">
                                                <button class="btn btn-dark"><a href="public/uploads/Acta de Entrega de Satisfacción.pdf" download="Acta de entrega" title="Descargar acta de entrega">Descargar</a></button>  
                                            </form>
                                            <%}%>
                                        </td>
                                    </tr>
                                    <%}%>
                                </table>

                            </center> 
                        </div>
                    </div>        
                </div>
            </div>      
        </main>
        <!--   Core JS Files   -->
        <script src="../assets/js/core/popper.min.js"></script>
        <script src="../assets/js/core/bootstrap.min.js"></script>
        <script src="../assets/js/plugins/perfect-scrollbar.min.js"></script>
        <script src="../assets/js/plugins/smooth-scrollbar.min.js"></script>
        <script src="../assets/js/plugins/chartjs.min.js"></script>
        <script>
            var ctx1 = document.getElementById("chart-line").getContext("2d");

            var gradientStroke1 = ctx1.createLinearGradient(0, 230, 0, 50);

            gradientStroke1.addColorStop(1, 'rgba(94, 114, 228, 0.2)');
            gradientStroke1.addColorStop(0.2, 'rgba(94, 114, 228, 0.0)');
            gradientStroke1.addColorStop(0, 'rgba(94, 114, 228, 0)');
            new Chart(ctx1, {
                type: "line",
                data: {
                    labels: ["Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
                    datasets: [{
                            label: "Mobile apps",
                            tension: 0.4,
                            borderWidth: 0,
                            pointRadius: 0,
                            borderColor: "#5e72e4",
                            backgroundColor: gradientStroke1,
                            borderWidth: 3,
                            fill: true,
                            data: [50, 40, 300, 220, 500, 250, 400, 230, 500],
                            maxBarThickness: 6

                        }],
                },
                options: {
                    responsive: true,
                    maintainAspectRatio: false,
                    plugins: {
                        legend: {
                            display: false,
                        }
                    },
                    interaction: {
                        intersect: false,
                        mode: 'index',
                    },
                    scales: {
                        y: {
                            grid: {
                                drawBorder: false,
                                display: true,
                                drawOnChartArea: true,
                                drawTicks: false,
                                borderDash: [5, 5]
                            },
                            ticks: {
                                display: true,
                                padding: 10,
                                color: '#fbfbfb',
                                font: {
                                    size: 11,
                                    family: "Open Sans",
                                    style: 'normal',
                                    lineHeight: 2
                                },
                            }
                        },
                        x: {
                            grid: {
                                drawBorder: false,
                                display: false,
                                drawOnChartArea: false,
                                drawTicks: false,
                                borderDash: [5, 5]
                            },
                            ticks: {
                                display: true,
                                color: '#ccc',
                                padding: 20,
                                font: {
                                    size: 11,
                                    family: "Open Sans",
                                    style: 'normal',
                                    lineHeight: 2
                                },
                            }
                        },
                    },
                },
            });
        </script>
        <script>
            var win = navigator.platform.indexOf('Win') > -1;
            if (win && document.querySelector('#sidenav-scrollbar')) {
                var options = {
                    damping: '0.5'
                }
                Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);
            }
        </script>
        <!-- Github buttons -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
        <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->
        <script src="../assets/js/argon-dashboard.min.js?v=2.0.4"></script>
    </body>

</html>
