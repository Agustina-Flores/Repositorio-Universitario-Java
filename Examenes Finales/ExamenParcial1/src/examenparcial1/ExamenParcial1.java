/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class ExamenParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Escuela escuela1 = new Escuela(4521, "");
        
        List<DivisionCurso> divisiones = new ArrayList<>();
        divisiones.add(new DivisionCurso(1, 2000, 1));
        divisiones.add(new DivisionCurso(2, 2001, 2));
        divisiones.add(new DivisionCurso(3, 2002, 1));
        divisiones.add(new DivisionCurso(4, 2000, 2));
        divisiones.add(new DivisionCurso(5, 2001, 1));
        
        escuela1.setDivisiones(divisiones);
        
        List<Catedra> catedras = new ArrayList<>();
        catedras.add(new Catedra(1, "Prog1"));
        catedras.add(new Catedra(2, "Prog2"));
        catedras.add(new Catedra(3, "Prog3"));
        catedras.add(new Catedra(4, "Prog4"));
        
        for (DivisionCurso division : escuela1.getDivisiones()) {
            division.setCatedras(catedras);
        }
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(321, "", "", new Date()));
        alumnos.add(new Alumno(434, "", "", new Date()));
        alumnos.add(new Alumno(356, "", "", new Date()));
        alumnos.add(new Alumno(343, "", "", new Date()));
        alumnos.add(new Alumno(387, "", "", new Date()));
        
        for (DivisionCurso division : escuela1.getDivisiones()) {
            for (Catedra catedra : division.getCatedras()) {
                catedra.setAlumnos(alumnos);
                
                catedra.mejorAlumnoCatedra();
                Alumno a = new Alumno();
                a = catedra.mejorAlumnoCatedra();
                System.out.println("mejor alumno " + a);
            }
        }
        
        List<Nota> notas1=new ArrayList<>();
        notas1.add(new Nota(1, 6, new Date(), true));
        notas1.add(new Nota(1, 7, new Date(), false));
        notas1.add(new Nota(1, 7, new Date(), false));
        notas1.add(new Nota(1, 9, new Date(), true));
        notas1.add(new Nota(1, 8, new Date(), true));
        
        List<Nota> notas2=new ArrayList<>();
        notas2.add(new Nota(1, 6, new Date(), false));
        notas2.add(new Nota(1, 7, new Date(), false));
        notas2.add(new Nota(1, 7, new Date(), false));
        notas2.add(new Nota(1, 9, new Date(), false));
        notas2.add(new Nota(1, 8, new Date(), false));
        
        }
    }
    

