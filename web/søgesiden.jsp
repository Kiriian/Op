<%-- 
    Document   : søgesiden
    Created on : 31-May-2015, 18:47:20
    Author     : Pernille
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h5 align="right">Brugernavn:&nbsp ${user.getFornavn()} </h5>
        <c:set var="user" value="${user}"></c:set>
        <h1>Opskriftsøgning</h1>
        <form name="Søgning" action="ServletSøgning" method="POST">
      
    Vælg kategori &nbsp<select name="Kategori">
    <option value="Forret">Forret</option>
    <option value="Hovedret">Hovedret</option>
    <option value="Dessert">Dessert</option>
    <option value="Snack">Snack</option>
    <option value="Snack/Forret">Snack/Forret</option>
    <option value="Kage">Kage</option>
    <option value="Brød">Brød</option>
    <option value="Boller">Boller</option>
        </select>
        
        <p7><input type="submit" value="Search"/></p7>
        <br><br>

            <table>
                <tr>
                    <th>OpskriftID</th>
                    <th>Opskriftnavn</th>
                    <th>Kommentar</th>
                    <th>Hovedingrediens</th>
                    <th>Kategori</th>
                    <th>Kogebog</th>
                    <th>Forfatter</th>
                    
                    
                </tr>

        </form>
        <c:forEach var="o" items="${projects}">
        <tr>
            <td <a onclick="location.href = 'changeProjectServlet?projectid=${o.getOpskriftID()}'">${o.getOpskriftID()}</a></td>
            <td>${o.getOpnavn()}</td>
            <td>${p.getKommentar()}</td>
            <td>${p.getHiID()}</td>
            <td>${p.getKaID()}</td>
            <td>${p.getKogeID()}</td>
            <td>${p.getForfatterID()}</td>
            

<!-- <p>${o}</p> -->
        </tr>
    </c:forEach>
        
         </form>  
    </body>
</html>
