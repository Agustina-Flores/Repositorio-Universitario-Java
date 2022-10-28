/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Alumno
 */
@Entity
@PrimaryKeyJoinColumn(name="PersonaID")
public class Medico extends Persona implements java.io.Serializable{
    
    private int idMedico;
    private int matricula;
    private long celular;
    private List<Especialidad> especialidades;
    private List<Turno> turnos;

    public Medico() {
    }

    
    public Medico(int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
    }

    public Medico(int idMedico, int matricula, long celular, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.idMedico = idMedico;
        this.matricula = matricula;
        this.celular = celular;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    //relacion muchos medicos a muchas especialidades
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="MedicoEspecialidad", joinColumns={@JoinColumn(name="idMedico")}, inverseJoinColumns = {@JoinColumn(name="idEspecialidad")})
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }
    
    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    //relacion un medico a muchos turnos.pk=turnos
    @OneToMany(mappedBy = "medico", cascade=CascadeType.ALL)
    public List<Turno> getTurnos() {
        return turnos;
    }
    
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
}
