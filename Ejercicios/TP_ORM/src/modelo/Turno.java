/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alumno
 */
@Entity
public class Turno implements java.io.Serializable{
    
    private int idTurno;
    private Date fecha;
    private int minutos;
    private int hora;
    private Paciente paciente;
    private Medico medico;

    public Turno() {
    }

    public Turno(int idTurno, Date fecha, int minutos, int hora) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.minutos = minutos;
        this.hora = hora;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    //relacion muchos turnos a un paciente.fk=idPaciente
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idPaciente")
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    //relacion muchos turnos a un medico.fk=idMedico
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idMedico")
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
}
