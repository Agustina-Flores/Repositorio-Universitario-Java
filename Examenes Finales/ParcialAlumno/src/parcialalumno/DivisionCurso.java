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
public class DivisionCurso {
   private int codigo;
   private int anio;
   private int division;
   private Escuela escuela;
   private ArrayList <Catedra>catedras;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(ArrayList<Catedra> catedras) {
        this.catedras = catedras;
    }
    public Alumno mejorAlumnoDivisionCurso(){
        double promedio=0;
        Alumno mejorAlumnoDivision = new Alumno();
        
        for(Catedra catedras: getCatedras()){
            for(Alumno alumnos :catedras.getAlumnos()){
                if(alumnos.getNotas().size()>=5 && alumnos.recupero()==false){
                    double promedioAlum=alumnos.promedioNotas(alumnos.getCatedra().getCodigo());
                    if(promedioAlum>promedio){
                        promedio=promedioAlum;
                        mejorAlumnoDivision=alumnos;
                    }
            }
            }
        }
        
        return mejorAlumnoDivision;
    }
   
   
}
