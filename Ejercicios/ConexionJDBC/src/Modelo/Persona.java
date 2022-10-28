/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Datos.PersonaDAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaAlta;
    private PersonaDAO persDao=new PersonaDAO();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, Date fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaAlta = fechaAlta;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public PersonaDAO getPersDao() {
        return persDao;
    }

    public void setPersDao(PersonaDAO persDao) {
        this.persDao = persDao;
    }
    
    public List<Persona> consultaSelect(String select){
        return this.persDao.consultaSelect(select);
    }
    
    public boolean consultaInsert(String insert){
        System.out.println("3333");
        return this.persDao.consultaInsert(insert);
    }
    
    public boolean consultaUpdate(String update){
        return this.persDao.consultaUpdate(update);
    }
    
    public boolean consultaDelete(String delete){
        return this.persDao.consultaDelete(delete);
    }
}
