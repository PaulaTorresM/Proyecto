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
public class PedidoEquipoCVO 
{
    private int item, cantidad;
    private String id_pedidoC, id_usuario, nombre_equipo, fecha_pedido, servicio, estado, id_producto;

    public PedidoEquipoCVO(int item, String id_producto, int cantidad, String id_pedidoC, String id_usuario, String nombre_equipo, String fecha_pedido, String servicio, String estado) 
    {
        this.item = item;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.id_pedidoC = id_pedidoC;
        this.id_usuario = id_usuario;
        this.nombre_equipo = nombre_equipo;
        this.fecha_pedido = fecha_pedido;
        this.servicio = servicio;
        this.estado = estado;
    }
    

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }


    public String getId_pedidoC() {
        return id_pedidoC;
    }

    public void setId_pedidoC(String id_pedidoC) {
        this.id_pedidoC = id_pedidoC;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public PedidoEquipoCVO() {
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
