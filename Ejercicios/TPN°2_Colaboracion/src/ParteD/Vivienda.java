/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteD;

import java.util.List;

/**
 *
 * @author Agustina
 */
public class Vivienda {
    
    private long id;
    private String calle;
    private int numeroCalle;
    private double superficieTerreno;
    private Barrio barrio;
    private List<Habitacion> habitaciones;

    public Vivienda() {
    }

    public Vivienda(long id, String calle, int numeroCalle, double superficieTerreno) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficieTerreno = superficieTerreno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public double getSuperficieTerreno() {
        return superficieTerreno;
    }

    public void setSuperficieTerreno(double superficieTerreno) {
        this.superficieTerreno = superficieTerreno;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
  public double getMetrosCuadradosCubiertos(){
        double metrosCubiertos = 0;
        
            for (Habitacion habitacion : getHabitaciones()) {
                metrosCubiertos += habitacion.getMetrosCuadrados();
            }
        
            if (metrosCubiertos > this.superficieTerreno) {
                throw new RuntimeException("La superficie cubierta no puede ser mayor a la superficie del terreno");
            }
        return metrosCubiertos;
    }
    
}
