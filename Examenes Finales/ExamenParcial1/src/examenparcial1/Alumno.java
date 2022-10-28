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
public class Alumno {
    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Catedra catedra;
     List<Nota> notas=new ArrayList<Nota>();

  public Alumno() {
    }

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
     
     
    
    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
    
     public Nota mejorNota(Integer codigoCatedra) {
        Nota mejorNota = new Nota();
        double mayor = 0;
        if (codigoCatedra != null) {
            for (Nota nota : getNotas()) {
                if (nota.getCatedra().getCodigo() == codigoCatedra && nota.getValor() > mayor && nota.isEsRecuperatorio() == false) {
                    mayor = nota.getValor();
                    mejorNota = nota;
                }
            }
        } else {
            for (Nota nota : getNotas()) {
                if (nota.getValor() > mayor && nota.isEsRecuperatorio() == false) {
                    mayor = nota.getValor();
                    mejorNota = nota;
                }
            }
        }
        return mejorNota;
    }

    public double promedioNotas(Integer codigoCatedra) {
        double promedio = 0;
        int cont = 0;
        if (codigoCatedra != null) {
            for (Nota nota : getNotas()) {
                if (nota.getCatedra().getCodigo() == codigoCatedra) {
                    promedio += nota.getValor();
                    cont++;
                }
            }
        } else {
            for (Nota nota : getNotas()) {
                promedio += nota.getValor();
                cont++;
            }
        }
        return promedio / cont;
    }
    
    public boolean recupero(){
        boolean recupero=false;
        for(Nota nota:getNotas()){
            if(nota.isEsRecuperatorio()==false){
                recupero=false;
            }else{
                recupero=true;
            }
        }
        return recupero;
    }
}
