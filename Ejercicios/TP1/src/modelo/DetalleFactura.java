/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Agustina
 */
public class DetalleFactura {
  private int cantidad;
    private double subtotal;
    private Articulo articulo;
    private Factura factura;
    
    
     public DetalleFactura(int cantidad, double subTotal, Articulo articulo, Factura factura) {
        this.cantidad = cantidad;
        this.subtotal = subTotal;
        this.articulo = articulo;
        this.factura = factura;
    }

    public DetalleFactura() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
      public void calcularSubtotal(){
        this.subtotal=this.cantidad*this.getArticulo().getPrecio();
    }
    
}
