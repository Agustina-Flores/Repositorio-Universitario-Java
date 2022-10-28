<%-- 
    Document   : abmUsuario
    Created on : Mar 13, 2021, 4:30:02 PM
    Author     : Agustina
--%>
 
<%@page import="Controlador.Consultas"%>
<%@page import="Controlador.Conexion"%>
 <%@page import="Controlador.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  HttpSession objsesion = request.getSession(false);
   Consultas con = new Consultas();
  ArrayList<Usuario> listaUsuarios = con.consultaSelect();
  String usuario = (String)objsesion.getAttribute("usuario");
  String clave = (String)objsesion.getAttribute("clave");
  if(usuario.equals(usuario!=null) && clave.equals(clave!=null)){  //si no existe el usuario que vaya a index..
    response.sendRedirect("index.jsp");
    
  }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
        
    </head>
    <body>
        <h1>Accesso Correcto <% out.println(usuario); %></h1>
        <h2>Nuevo Usuario</h2>
        <h3>Formulario de Registro</h3>
        
       
        <form action="nuevousuario" method="post">
             
            <label>Usuario: </label>
            <input type="text" name="txtUsu"/><br>
             <label>Clave: </label>
            <input type="text" name="txtCla"/><br>
            <input type="submit" align="center" value="Registrarme"/>
                
        </form> 
        

          <form action="usuarioD" method="post">
	<table border="1" width="250" align="center">
            <tr>
             <th>Id</th>
            <th>Usuario</th>
            <th>Clave</th>
            </tr>
            
        <% 
            
            for (int i=0; i<listaUsuarios.size(); i++) { %>
               <tr>	
                   <td><%=listaUsuarios.get(i).getiD()%></td>
                   <td><%=listaUsuarios.get(i).getUsuario()%></td>
                   <td><%=listaUsuarios.get(i).getClave()%></td>
               </tr>
       <% } %>
                
         </table>
     </form>
    </body>
</html>
