/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import persistencia.ConfigHibernate;

/**
 *
 * @author Alumno
 */
public class GestorMedico extends Gestor{

    public GestorMedico() {
        sesion = ConfigHibernate.openSession();
    }
    
    
}
