/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Alumno
 */
@Entity
@PrimaryKeyJoinColumn(name="PersonaID")
public class Empleado extends Persona implements java.io.Serializable{
    
    private int idEmpleado;
    private int nroLegajo;
    private double sueldo;

    public Empleado() {
    }

    
    public Empleado(int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
    }

    public Empleado(int idEmpleado, int nroLegajo, double sueldo, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.idEmpleado = idEmpleado;
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
