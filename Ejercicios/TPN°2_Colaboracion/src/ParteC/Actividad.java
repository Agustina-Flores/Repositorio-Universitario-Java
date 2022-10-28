/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteC;

import java.util.Date;

/**
 *
 * @author Agustina
 */
public class Actividad {
     private Date fechaInicio;
    private Date fechaFin;
    private String nombre;
    private String descripcion;
    private Persona persona;
    private TipoActividad tipoAct;

    public Actividad() {
    }

    public Actividad(Date fechaInicio, Date fechaFin, String nombre, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoActividad getTipoAct() {
        return tipoAct;
    }

    public void setTipoAct(TipoActividad tipoAct) {
        this.tipoAct = tipoAct;
    }

}
