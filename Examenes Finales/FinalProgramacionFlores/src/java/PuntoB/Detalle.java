/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoB;

import java.util.List;

/**
 *
 * @author Agustina
 */
public class Detalle {
    private int kmSalida;
    private int kmRegreso;
    private int horaSalida;
    private int horaRegreso;
    private int minutoSalida;
    private int minutoRegreso;
    private HojaRuta hojaRuta;
    
  
   
    public int getKmSalida() {
        return kmSalida;
    }

    public void setKmSalida(int kmSalida) {
        this.kmSalida = kmSalida;
    }

    public int getKmRegreso() {
        return kmRegreso;
    }

    public void setKmRegreso(int kmRegreso) {
        this.kmRegreso = kmRegreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(int horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public int getMinutoSalida() {
        return minutoSalida;
    }

    public void setMinutoSalida(int minutoSalida) {
        this.minutoSalida = minutoSalida;
    }

    public int getMinutoRegreso() {
        return minutoRegreso;
    }

    public void setMinutoRegreso(int minutoRegreso) {
        this.minutoRegreso = minutoRegreso;
    }
    
    
    
}
