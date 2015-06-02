<%-- 
    Document   : index
    Created on : 30-May-2015, 14:28:50
    Author     : Pernille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <title>Opskrftsamling</title>
    </head>
    <body>
        <form name="LogIn" action="ServletLogInd" method="POST">
        
        <h1>Velkommen til min opskriftsamling</h1>
        <h3>Når du er logget ind kan du:</h3>
        <ul><ul type="circle">
                <li>Søge opskrifter ud fra navn</li>
                <li>Søge opskrifter ud fra ingrediens</li>
                <li>Søge opskrifter ud fra kategori</li>
            </ul>
            <br>
            <br>
            <br>
            Indtast fornavn: &nbsp &nbsp<input type="text" name="Fornavn" value="" size="20" />
            <br>
            Indtast efternavn: &nbsp<input type="text" name="Efternavn" value="" size="20" />
            <br>
            Indtast password: &nbsp<input type="password" name="Password" value="" size="10" />
            <br>
            <input type="submit" value="Log ind" name="ServletLogInd" />
            <br>
            <h3>${validateMsg}</h3>
            </form>
    </body>
</html>
