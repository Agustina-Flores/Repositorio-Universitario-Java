/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn.pkg2_colaboracion;

import java.util.List;

/**
 *
 * @author Agustina
 */
public class Control {
      private int id;
    private String denominacion;
    private boolean esObligatorio;
    private List<Expediente> expedientes;
    private List <EstadoControl> estadosControles;

    public Control() {
    }

    public Control(int id, String denominacion, boolean esObligatorio) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public List<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(List<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public List<EstadoControl> getEstadosControles() {
        return estadosControles;
    }

    public void setEstadosControles(List<EstadoControl> estadosControles) {
        this.estadosControles = estadosControles;
    }
}
