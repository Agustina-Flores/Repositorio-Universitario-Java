/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Alumno
 */
@Entity
@PrimaryKeyJoinColumn(name="PersonaID")
public class Paciente extends Persona implements java.io.Serializable{
    
    private int idPaciente;
    private int nroSocio;
    private List<Turno> turnos;
    private HistoriaClinica historia;

    public Paciente() {
    }
    
    
    public Paciente(int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
    }

    public Paciente(int idPaciente, int nroSocio, List<Turno> turnos, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
        this.turnos = turnos;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    //relacion un paciente a muchos turnos.pk=turnos
    @OneToMany(mappedBy = "paciente", cascade=CascadeType.ALL)
    public List<Turno> getTurnos() {
        return turnos;
    }

    
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    //relacion un paciente a una historia clinica.pk=idHistoriaClinica
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public HistoriaClinica getHistoria() {
        return historia;
    }

    public void setHistoria(HistoriaClinica historia) {
        this.historia = historia;
    }
    
    
}
