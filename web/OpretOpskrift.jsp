<%-- 
    Document   : OpretOpskrift
    Created on : 01-Jun-2015, 18:54:56
    Author     : Pernille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        
    </head>
    <body>
        <h5 align="right">Brugernavn:&nbsp ${user.getFornavn()} </h5>
        <c:set var="user" value="${user}"></c:set>
        <h1>Opret opskrift</h1>
        <br>
        <br>
        <br>
        
        <div class="form-group">
  <label for="kategori">Select list:</label>
  <select class="form-control" id="kategori">
    <option>Forret</option>
    <option>Hovedret</option>
    <option>Dessert</option>
    <option>Snack</option>
    <option>Snack/Forret</option>
    <option>Kage</option>
    <option>Brød</option>
    <option>Boller</option>
  </select>
</div>
    </body>
</html>
