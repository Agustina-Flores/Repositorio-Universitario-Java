<%-- 
    Document   : pagina2
    Created on : 07/10/2019, 21:16:42
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
        <table border="1" cellspacing="0">
        <%
            int filas=Integer.parseInt(request.getParameter("filas"));
            int columnas=Integer.parseInt(request.getParameter("columnas"));
            int [][] tabla=new int [filas][columnas];
            for(int i=1; i<=tabla.length; i++){
                out.print("<tr>");
                for(int j=1; j<=tabla.length; j++){
                    out.print("<td>");
                    out.print(i+"."+j+" ");
                    out.print("</td>");
                }
                out.print("</tr>");
            }
        %>
        </table>
    </body>
</html>
