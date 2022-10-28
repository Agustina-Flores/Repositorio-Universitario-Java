/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialalumno;

import java.util.ArrayList;

/**
 *
 * @author Agustina
 */
public class Catedra {
    private int codigo;
    private String denominacion;
    private ArrayList<Nota> notas;
    private ArrayList<Alumno> alumnos;

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

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public Alumno mejorAlumnoCatedra(){
        
        double promedio=0;
        Alumno mejorAlumno = new Alumno();
        
        for(Alumno alumnos:getAlumnos()){
            if(alumnos.promedioNotas(codigo) > promedio ){
                mejorAlumno=alumnos;
            }
        }
        return mejorAlumno;
    }
    
}
