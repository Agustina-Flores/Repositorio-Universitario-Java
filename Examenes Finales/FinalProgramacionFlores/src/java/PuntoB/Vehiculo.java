/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoB;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Agustina
 */
public class Vehiculo {
    
    private String patente;
    private String marca;
    private String modelo;
    private ArrayList<HojaRuta> hojaRutas;
    
    
    public int calcularTotalKilometrosRecorridos(Date fechaDesde, Date fechaHasta){
        int totalKmRecorridos=0;
        
            for(HojaRuta hj:getHojaRutas()){
                if(hj.getFecha() == fechaDesde && hj.getFecha() == fechaHasta){
                   totalKmRecorridos = hj.calcularTotalKilometros();
                       
            }
        }
            return totalKmRecorridos;
    }
            
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<HojaRuta> getHojaRutas() {
        return hojaRutas;
    }

    public void setHojaRutas(ArrayList<HojaRuta> hojaRutas) {
        this.hojaRutas = hojaRutas;
    }
    
    
}
