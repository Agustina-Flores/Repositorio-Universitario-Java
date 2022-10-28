/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Agustina
 */
public class Conexion {
    private String USERNAME="root";
    private String PASSWORD ="";
    private String HOST="localhost";
    private String PUERTO="3307";
    private String DATABASE="pagina";
   private String CLASSNAME="com.mysql.jdbc.Driver";
   private String URL="jdbc:mysql://"+HOST+":"+PUERTO+"/"+DATABASE;
   private Connection cnx;

    public Conexion() {
       
        try{
            Class.forName(CLASSNAME);
            cnx = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            }catch(ClassNotFoundException ex){
                System.out.println("ERROR" + ex);
        }   catch(SQLException ex){
           System.out.println("ERROR" + ex);
        }
   
    }
    
    public Connection getConnection(){
    
        return cnx;
    }
    
    public static void main(String [] args){
    Conexion cnx = new Conexion();
    }
}