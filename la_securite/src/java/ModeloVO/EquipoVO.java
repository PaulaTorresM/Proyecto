/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Usuario
 */
public class EquipoVO 
{
    
    private String  nombre_equipo, estado_equipo, id_equipo; 
    private String cantidad_equipo;

    public EquipoVO() 
    {
        
    }

    public EquipoVO(String id_equipo,  String nombre_equipo, String estado_equipo, String cantidad_equipo) {
        this.id_equipo = id_equipo;
     
        this.nombre_equipo = nombre_equipo;
        this.estado_equipo = estado_equipo;
        this.cantidad_equipo = cantidad_equipo;
    }



    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getEstado_equipo() {
        return estado_equipo;
    }

    public void setEstado_equipo(String estado_equipo) {
        this.estado_equipo = estado_equipo;
    }

    public String getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(String id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getCantidad_equipo() {
        return cantidad_equipo;
    }

    public void setCantidad_equipo(String cantidad_equipo) {
        this.cantidad_equipo = cantidad_equipo;
    }

    
}
