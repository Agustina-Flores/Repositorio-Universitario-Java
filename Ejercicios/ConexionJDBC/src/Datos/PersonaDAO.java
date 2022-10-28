/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Persona;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class PersonaDAO extends SQLQuery {

    public PersonaDAO() {
    }

    public List<Persona> consultaSelect(String select) {
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            this.consulta = this.conn.prepareStatement(select);
            this.datos = this.consulta.executeQuery();
            if (select.contains("Nombre") || select.contains("nombre")) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setNombre(this.datos.getString("Nombre"));
                    listaPersonas.add(persona);
                }
            } else if (select.contains("Apellido") || select.contains("apellido")) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setApellido(this.datos.getString("Apellido"));
                    listaPersonas.add(persona);
                }
            } else if (select.contains("Edad") || select.contains("edad")) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setEdad(this.datos.getInt("Apellido"));
                    listaPersonas.add(persona);
                }
            } else if (select.contains("fechaAlta") || select.contains("FechaAlta")) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setFechaAlta(this.datos.getDate("fechaAlta"));
                    listaPersonas.add(persona);
                }
            } else if ((select.contains("Nombre") && select.contains("Apellido")) || (select.contains("nombre") && select.contains("apellido"))) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setNombre(this.datos.getString("Nombre"));
                    persona.setApellido(this.datos.getString("Apellido"));
                    listaPersonas.add(persona);
                }
            } else if ((select.contains("Nombre") && select.contains("Edad")) || (select.contains("nombre") && select.contains("edad"))) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setNombre(this.datos.getString("Nombre"));
                    persona.setEdad(this.datos.getInt("Edad"));
                    listaPersonas.add(persona);
                }
            } else if ((select.contains("Nombre") && select.contains("fechaAlta")) || (select.contains("nombre") && select.contains("FechaAlta"))) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setNombre(this.datos.getString("Nombre"));
                    persona.setFechaAlta(this.datos.getDate("fechaAlta"));
                    listaPersonas.add(persona);
                }
            } else if ((select.contains("Apellido") && select.contains("Edad")) || (select.contains("apellido") && select.contains("edad"))) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setApellido(this.datos.getString("Apellido"));
                    persona.setEdad(this.datos.getInt("Edad"));
                    listaPersonas.add(persona);
                }
            } else if ((select.contains("Apellido") && select.contains("fechaAlta")) || (select.contains("apellido") && select.contains("FechaAlta"))) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setApellido(this.datos.getString("Apellido"));
                    persona.setFechaAlta(this.datos.getDate("fechaAlta"));
                    listaPersonas.add(persona);
                }
            } else if ((select.contains("Edad") && select.contains("fechaAlta")) || (select.contains("edad") && select.contains("FechaAlta"))) {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setEdad(this.datos.getInt("Edad"));
                    persona.setFechaAlta(this.datos.getDate("fechaAlta"));
                    listaPersonas.add(persona);
                }
            } else {
                while (this.datos.next()) {
                    Persona persona = new Persona();
                    persona.setNombre(this.datos.getString("Nombre"));
                    persona.setApellido(this.datos.getString("Apellido"));
                    persona.setEdad(this.datos.getInt("Edad"));
                    persona.setFechaAlta(this.datos.getDate("fechaAlta"));
                    listaPersonas.add(persona);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPersonas;
    }

    public boolean consultaUpdate(String update) {
        try {
            this.s = this.conn.createStatement();
            this.s.executeUpdate(update);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean consultaInsert(String insert) {
        System.out.println("4444");
        try {
            this.s = this.conn.createStatement();
            this.s.executeUpdate(insert);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean consultaDelete(String delete) {
        try {
            this.s = this.conn.createStatement();
            this.s.executeUpdate(delete);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
