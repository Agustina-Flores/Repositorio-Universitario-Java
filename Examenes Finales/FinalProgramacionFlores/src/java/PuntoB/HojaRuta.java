/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class HojaRuta {
    
    private Date fecha;
    private long numero;
    private ArrayList<Detalle> detalles;
    private Vehiculo vehiculo;
    
   public List<Detalle> detalleOrdenado() {
       
       ArrayList<Detalle> detalles=new ArrayList<>();
       
       for(Detalle det:getDetalles()){
            
                for(int i=0;i<det.getHoraRegreso();i++){
                    
                    
                   
                }
             
       }
       return detalles;
      }
         
      public int calcularTotalKilometros(){
          int totalKm=0;
          for(Detalle det:getDetalles()){
              totalKm =  det.getKmRegreso() - det.getKmSalida();
              
          }
          return totalKm;
      }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalles = detalles;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
