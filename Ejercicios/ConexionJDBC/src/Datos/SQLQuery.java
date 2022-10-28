/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;

/**
 *
 * @author Alumno
 */
public class SQLQuery {
    protected Connection conn;
    protected PreparedStatement consulta;
    protected ResultSet datos;
    protected Statement s;

    
    public void conectar(String puerto, String servidor, String bd, String usuario, String password) throws ClassNotFoundException, SQLException{//si no lanzo la excepcion tengo que usar try catch, la excepcion me obliga a meter todo en un try catch
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://"+servidor+":"+puerto+"/"+bd,usuario,password);
    }
    
    public void desconectar() throws SQLException{
        this.conn.close();
        this.consulta.close();
    }
    
    public void desconectar(ResultSet rs) throws SQLException{
        this.desconectar();
        rs.close();
    }
    
}
