<%-- 
    Document   : formulario
    Created on : 09/10/2019, 09:10:06
    Author     : Vani y Tati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="infoTabla.jsp" method="post">
            <table>
                <tr>
                    <td>
                        DNI:
                    </td>
                    <td>
                            <input type="text" name="txtDni">
                    </td>
                </tr>
                <tr>
                    <td>
                        Nombre:
                    </td>
                    <td>
                        <input type="text" name="txtNombre">
                    </td>
                </tr>
                <tr>
                    <td>
                        Domicilio:
                    </td>
                    <td>
                        <input type="text" name="txtDomicilio">
                    </td>
                </tr>
            </table><br>
            <input type="submit" value="Enviar Datos">
        </form>
    </body>
</html>
