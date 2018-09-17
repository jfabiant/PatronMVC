<jsp:useBean id="clientedato" type="modelo.ClienteBean" scope="request"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Semana 6</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        Codigo: <jsp:getProperty name="clientedato" property="id"/>
        <br>
        Nombres: <jsp:getProperty name="clientedato" property="nombres"/>
        <br>
        Apellidos: <jsp:getProperty name="clientedato" property="apellidos"/>
        <br>
        Sueldo <jsp:getProperty name="clientedato" property="sueldo"/>
        <br>
        <br>
        <a href="Busqueda.jsp">Otra busqueda</a>
    </body>
</html>
