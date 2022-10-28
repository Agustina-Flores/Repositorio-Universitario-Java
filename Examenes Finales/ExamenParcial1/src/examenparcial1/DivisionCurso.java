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
public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    List<Catedra> catedras=new ArrayList<Catedra>();
        public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
    }
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

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }
    
  public Alumno mejorAlumnoDivisionCurso(){
        Alumno mejorAlumno=new Alumno();
        double promedio=0;
        for(Catedra catedra:getCatedras()){
            for(Alumno alumno: catedra.getAlumnos()){
                if(alumno.getNotas().size()>=5 && alumno.recupero()==false){
                    double promedioAlum=alumno.promedioNotas(alumno.getCatedra().getCodigo());
                    if(promedioAlum>promedio){
                        promedio=promedioAlum;
                        mejorAlumno=alumno;
                    }
                    
                }
            }
        }
        return mejorAlumno;
    }
    
}
