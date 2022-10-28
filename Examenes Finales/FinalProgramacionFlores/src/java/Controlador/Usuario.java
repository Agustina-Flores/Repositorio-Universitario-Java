/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Agustina
 */
public class Usuario {
    
    private int iD;
    private String usuario=""; //"maria"
    private String clave = ""; //"eeeee1"
    private Consultas consulta = new Consultas();

    public Usuario() {
    }
    

    
     public Usuario(int iD, String usuario, String clave) {
        
        this.usuario = usuario;
        this.clave = clave;
         
    }
    

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
