<%-- 
    Document   : Søgeresultat
    Created on : 01-Jun-2015, 20:40:53
    Author     : Pernille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h5 align="right">Brugernavn:&nbsp ${user.getFornavn()} </h5>
        <c:set var="user" value="${user}"></c:set>
        <h1>Hello World!</h1>
    </body>
</html>
