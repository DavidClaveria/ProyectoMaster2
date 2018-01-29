<%-- 
    Document   : conceptos
    Created on : 29-ene-2018, 11:28:00
    Author     : David Claveria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello David</title>
    </head>
    <body>
        <h1>Hello David</h1>
        <a href="/ProyectoMaster2/concepto/newConcepto">New</a>
        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
            </tr>
            
            <c:forEach var="concepto" items="${conceptos}">
                <tr>
                    <td>
                        <c:out value="${concepto.getId()}"></c:out>
                    </td>
                     <td>
                        <c:out value="${concepto.getConcepto()}"></c:out>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
