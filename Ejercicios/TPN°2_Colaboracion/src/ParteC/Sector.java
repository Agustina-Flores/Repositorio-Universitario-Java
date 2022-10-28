/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class Sector {
     
    private int numero;
    private String denominacion;
    private String tipo;
    private List<Persona> personas;
    private Sector sectorPadre;
    private List<Sector> sectoresHijos;

    public Sector() {
    }

    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Sector getSectorPadre() {
        return sectorPadre;
    }

    public void setSectorPadre(Sector sectorPadre) {
        this.sectorPadre = sectorPadre;
    }

    public List<Sector> getSectoresHijos() {
        return sectoresHijos;
    }

    public void setSectoresHijos(List<Sector> sectoresHijos) {
        this.sectoresHijos = sectoresHijos;
    }
    
    
      public List<Sector> obtenerTotalSubsectores(){
        List<Sector>sectores=new ArrayList<>();
        metodoRecursivo(sectores, this);
        return sectores;
    }
    
    public void metodoRecursivo(List<Sector>sectores, Sector nodoActual){
        sectores.add(nodoActual);
        if(nodoActual.getSectoresHijos()!=null){
            for(Sector sectHijo: nodoActual.getSectoresHijos()){
                metodoRecursivo(sectores, sectHijo);
            }
        }
    }
}
