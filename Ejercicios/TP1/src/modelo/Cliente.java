/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Agustina
 */
public class Cliente {
      private int numero;
    private String razonSocial;
    private long cuit;
    private ArrayList<Factura> facturas;
    
     public Cliente(int numero, String razonSocial, long cuit, ArrayList<Factura> facturas) {
        this.numero = numero;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.facturas = facturas;
    }
      public Cliente(String razonSocial, long cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
      public Cliente() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
}
