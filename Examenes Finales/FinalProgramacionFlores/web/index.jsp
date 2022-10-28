<%-- 
    Document   : index
    Created on : Mar 13, 2021, 4:20:19 PM
    Author     : Agustina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <h1>Iniciar Sesion</h1>
    <script src="js/main.js"></script>
    </head>
    <body>
        <form action="Iniciar" method="post" id="forminicio">
            
                <tr>
                    <td>Id </td>
                    <td><input type="text" name="txtCod" readonly="readonly"</td>
                </tr><br>
                <tr>
                    <td>Usuario </td>
                    <td><input type="text" name="txtUsu" id="usuario" </td>
                </tr><br>
                 <tr>
                    <td>Clave </td>
                    <td><input type="text" name="txtCla" id="clave" </td>
                </tr><br>
                  <tr>
                     <input type="button" id="btnIniciar" align="center"
                        value="Iniciar Sesion"> </th>
                  </tr>
         
        </form> 
        <br>
        <br>
  
    </body>
</html>
