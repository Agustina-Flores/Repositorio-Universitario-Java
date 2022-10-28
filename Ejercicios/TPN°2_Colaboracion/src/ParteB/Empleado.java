/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class Empleado {
     private String nombre;
    private long cuit;
    private String domicilio;
    private String email;
    private RegimenHorario regHor;
    private List<Asistencia> asistencias;
    private List<Tardanza> tardanzas;

    public Empleado() {
    }

    public Empleado(String nombre, long cuit, String domicilio, String email) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.email = email;
    }
    
     public List<Asistencia> getAsistenciaXMesXAnio(int mes,int anio){
    
        List<Asistencia> asistencias=new ArrayList<>();
        for(Asistencia asis:getAsistencias()){
            if(asis.getFecha().getYear()==anio && asis.getFecha().getMonth()==mes){
               asistencias.add(asis);
            }
        }
        return asistencias;
        
    }
        
        public List<Tardanza> getDiasConTardanza(int mes,int anio){
              
          List<Tardanza> tardanzas = new ArrayList <>();
          
          for(Asistencia asistencia: getAsistenciaXMesXAnio(mes, anio)){
              int minutosDiferencia = asistencia.getMinuto() - regHor.getMinutoIngreso();
              if(minutosDiferencia>15){
                  Tardanza tar = new Tardanza();
                   tar.setId(asistencia.getId());
                   tar.setTipo(asistencia.getTipo());
                   tar.setFecha(asistencia.getFecha());
                   tar.setHora(asistencia.getHora());
                   tar.setMinuto(asistencia.getMinuto());
                   tardanzas.add(tar);
              }
          }
          return tardanzas;
        }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegimenHorario getRegHor() {
        return regHor;
    }

    public void setRegHor(RegimenHorario regHor) {
        this.regHor = regHor;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public List<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(List<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }
}
