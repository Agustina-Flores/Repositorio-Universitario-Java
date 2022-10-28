/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Agustina
 */
public class Factura {
    private String letra;
    private int numero;
    private double recargo;
    private String tipoPago;
    private double totalItems;
    private double totalFinal;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<DetalleFactura> detallesFactura=new ArrayList<DetalleFactura>();
    
    
      public Factura(String letra, int numero, double recargo, String tipoPago, double totalItems, double totalFinal, Date fecha, Cliente cliente, ArrayList<DetalleFactura> detallesFactura) {
        this.letra = letra;
        this.numero = numero;
        this.recargo = recargo;
        this.tipoPago = tipoPago;
        this.totalItems = totalItems;
        this.totalFinal = totalFinal;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detallesFactura = detallesFactura;
    }
     public Factura() {
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(double totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }
 public void agregarDetalle(DetalleFactura detalle) {
        this.detallesFactura.add(detalle);
    }
 
  public double calcularTotalItems() {
        if (this.getDetallesFactura() != null && !this.getDetallesFactura().isEmpty()) {
            /*for (int i = 0; i < this.getDetallesFactura().size(); i++) {
            this.totalItems+=this.getDetallesFactura().get(i).getSubTotal();
            }*/
            
            
            for (DetalleFactura df : this.getDetallesFactura()) {//for eatch
                df.calcularSubtotal();
                this.totalItems += df.getSubtotal();
            }

        }
        return totalItems;
    }

   
     public void mostrarDetallesFactura(){
        for (DetalleFactura df : this.getDetallesFactura()) {
                System.out.print(df.getArticulo().getCodigo()+"\t"+df.getArticulo().getDenominacion()
                +"\t"+df.getArticulo().getPrecio()+"\t"+df.getCantidad()+"\t"+df.getSubtotal()+"\n");
                
            }
    }
}
