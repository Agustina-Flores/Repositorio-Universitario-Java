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
public class Escuela {
    private int numero;
    private String denominacion;
    List<DivisionCurso> divisiones=new ArrayList<DivisionCurso>();

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DivisionCurso> getDivisiones() {
        return divisiones;
    }

    public void setDivisiones(List<DivisionCurso> divisiones) {
        this.divisiones = divisiones;
    }
    
   public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno){
        Alumno alumno=getDivisiones().get(0).mejorAlumnoDivisionCurso();
        for(DivisionCurso division:getDivisiones()){
            if(division.mejorAlumnoDivisionCurso().getFechaNacimiento().getYear()==anioNacimientoAlumno && division.mejorAlumnoDivisionCurso().promedioNotas(null)>=alumno.promedioNotas(null)){
                alumno=division.mejorAlumnoDivisionCurso();
            }
        }
        return alumno;
    }
    
    public List <Alumno> getMejoresAlumnos(int anioNacimientoAlumno){
        List<Alumno> mejores=new ArrayList();
        mejores.add(new Alumno());
        mejores.add(new Alumno());
        mejores.add(new Alumno());
        mejores.set(0, getDivisiones().get(0).mejorAlumnoDivisionCurso());
        for(DivisionCurso division:getDivisiones()){
            if(division.mejorAlumnoDivisionCurso().getFechaNacimiento().getYear()==anioNacimientoAlumno && division.mejorAlumnoDivisionCurso().promedioNotas(null)>=mejores.get(0).promedioNotas(null)){
                mejores.set(0, division.mejorAlumnoDivisionCurso());
                mejores.set(1, mejores.get(0));
                mejores.set(2, mejores.get(1));
            }
        }
        return mejores;
    }
}
