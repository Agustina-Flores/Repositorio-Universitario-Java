/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class Catedra {
    private int codigo;
    private String denominacion;
    private DivisionCurso divisionCurso;
    List<Alumno> alumnos=new ArrayList<Alumno>();
    List<Nota> nota=new ArrayList<Nota>();
    
     public Catedra() {
    }

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public DivisionCurso getDivisionCurso() {
        return divisionCurso;
    }

    public void setDivisionCurso(DivisionCurso divisionCurso) {
        this.divisionCurso = divisionCurso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Nota> getNota() {
        return nota;
    }

    public void setNota(List<Nota> nota) {
        this.nota = nota;
    }
    
     public Alumno mejorAlumnoCatedra(){
        Alumno mejorAlumno=new Alumno();
        double promedio=0;
        for(Alumno alumno:getAlumnos()){
            if(alumno.promedioNotas(this.codigo)>promedio){
                
                mejorAlumno=alumno;
                
            }
        }
        return mejorAlumno;
    }
}
