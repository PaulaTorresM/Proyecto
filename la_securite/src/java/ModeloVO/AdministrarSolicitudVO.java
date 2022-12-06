/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author macbookair
 */
public class AdministrarSolicitudVO 
{
    private String id_seguimiento, id_pedidoC, fecha_solicitud, descripcion_solicitud, fecha_instalacion, estado_instalacion, id_usuario, informe, estado_solicitud;

    public AdministrarSolicitudVO(String id_seguimiento, String id_pedidoC, String fecha_solicitud, String descripcion_solicitud, String fecha_instalacion, String estado_instalacion, String id_usuario, String informe, String estado_solicitud) 
    {
        this.id_seguimiento = id_seguimiento;
        this.id_pedidoC = id_pedidoC;
        this.fecha_solicitud = fecha_solicitud;
        this.descripcion_solicitud = descripcion_solicitud;
        this.fecha_instalacion = fecha_instalacion;
        this.estado_instalacion = estado_instalacion;
        this.id_usuario = id_usuario;
        this.informe = informe;
        this.estado_solicitud = estado_solicitud;
    }

    public AdministrarSolicitudVO() 
    {
        
    }

    public String getId_seguimiento() 
    {
        return id_seguimiento;
    }

    public void setId_seguimiento(String id_seguimiento) 
    {
        this.id_seguimiento = id_seguimiento;
    }

    public String getId_pedidoC() 
    {
        return id_pedidoC;
    }

    public void setId_pedidoC(String id_pedidoC) 
    {
        this.id_pedidoC = id_pedidoC;
    }

    public String getFecha_solicitud() 
    {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) 
    {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getDescripcion_solicitud() 
    {
        return descripcion_solicitud;
    }

    public void setDescripcion_solicitud(String descripcion_solicitud) 
    {
        this.descripcion_solicitud = descripcion_solicitud;
    }

    public String getFecha_instalacion() 
    {
        return fecha_instalacion;
    }

    public void setFecha_instalacion(String fecha_instalacion) 
    {
        this.fecha_instalacion = fecha_instalacion;
    }

    public String getEstado_instalacion() 
    {
        return estado_instalacion;
    }

    public void setEstado_instalacion(String estado_instalacion) 
    {
        this.estado_instalacion = estado_instalacion;
    }

    public String getId_usuario() 
    {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) 
    {
        this.id_usuario = id_usuario;
    }

    public String getInforme() 
    {
        return informe;
    }

    public void setInforme(String informe) 
    {
        this.informe = informe;
    }

    public String getEstado_solicitud() 
    {
        return estado_solicitud;
    }

    public void setEstado_solicitud(String estado_solicitud) 
    {
        this.estado_solicitud = estado_solicitud;
    }
}