/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class Consultas extends Conexion{
    
   
    
    public boolean autenticacion (String usuario,String clave){
        PreparedStatement pre=null;
        ResultSet rs=null;
        
        try{
        String consulta="select * from usuario where usuario = ? and clave = ?";
        pre =getConnection().prepareStatement(consulta);//requiere la consulta, llamamos al metodo q heredamos
        pre.setString(1, usuario);
        pre.setString(2, clave);
        rs= pre.executeQuery(); //ejecuta la consulta y la guarda en rs
        
            if(rs.absolute(1)){ //si tiene registro retorne true //ver
            return true;
            }
        }catch(Exception ex){
            System.out.println("Error" + ex);
        } finally{
            try{
                
            if(getConnection()!= null)getConnection().close(); //si no cerre la conexion que se cierre
            if(pre != null)pre.close(); //cierro el preparedstatement
            if(rs != null)rs.close();//cierro el resultSet
            
        }catch(Exception ex){
             
        }
        }
        
        return false; // de lo contrario retorna false
    }
    
    public boolean registrar (String usuario, String clave) { //metodo para registrarnos
        
        PreparedStatement pre = null; //no hace falta resultSet xq no es una consulta un insert?
       
        try{
            
            String consulta="insert into usuario (usuario,clave) values (?,?)";
            pre =getConnection().prepareStatement(consulta);
            pre.setString(1, usuario);//paso los parametros
            pre.setString(2, clave);
            
            if(pre.executeUpdate() == 1) { //update comparacion d numero entero si afecta a una fila retorne true
                return true;
            }
        }catch(Exception ex){
            System.out.println("Error " +ex);
        }finally{
           try{
           
            if(getConnection() != null)getConnection().close();
            if(pre != null) pre.close();
            
           }catch(Exception ex){
           System.out.println("Error " +ex);
           }
        }
        
        return false;
    }
    
      public boolean datos (String usuario,String clave){
          PreparedStatement pre=null;
        ResultSet rs=null;
        
        try{
        String consulta="select * from usuario where usuario = ? and clave = ?";
        pre =getConnection().prepareStatement(consulta);//requiere la consulta, llamamos al metodo q heredamos
        pre.setString(1, usuario);
        pre.setString(2, clave);
        rs= pre.executeQuery(); //ejecuta la consulta y la guarda en rs
        
            if(rs.absolute(1)){ //si tiene registro retorne true //ver
                 
               return true;
               
            }
        }catch(Exception ex){
            System.out.println("Error" + ex);
        } finally{
            try{
                
            if(getConnection()!= null)getConnection().close(); //si no cerre la conexion que se cierre
            if(pre != null)pre.close(); //cierro el preparedstatement
            if(rs != null)rs.close();//cierro el resultSet
            
        }catch(Exception ex){
             
        }
        }
        
        return false; // de lo contrario retorna false
    }
    
  
     public ArrayList<Usuario> consultaSelect(){
        
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        PreparedStatement pre=null;
        ResultSet rs=null;
        
        
        try{
        String consulta="select * from usuario";
        pre =getConnection().prepareStatement(consulta);//requiere la consulta, llamamos al metodo q heredamos
        
        rs= pre.executeQuery(); //ejecuta la consulta y la guarda en rs
        
            while ( rs.next()) {
                    Usuario usuarios = new Usuario();
                    usuarios.setiD(rs.getInt("iD"));
                    usuarios.setUsuario(rs.getString("usuario"));
                    usuarios.setClave(rs.getString("clave"));
                    listaUsuarios.add(usuarios);
                    
                    
                    for(int i= 0;i<listaUsuarios.size();i++){
                        System.out.println(listaUsuarios);
                    }
                    
            }
        }catch(Exception ex){
            System.out.println("Error" + ex);
        } finally{
            try{
                
            if(getConnection()!= null)getConnection().close(); //si no cerre la conexion que se cierre
            if(pre != null)pre.close(); //cierro el preparedstatement
            if(rs != null)rs.close();//cierro el resultSet
            
        }catch(Exception ex){
             
        }
        }
        
         return listaUsuarios;
    }
     
    
}
