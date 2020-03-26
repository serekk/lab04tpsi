<%-- 
    Document   : persons
    Created on : 2020-03-18, 16:39:09
    Author     : Karol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PersonList</title>
    </head>
    <body>
        <table border="1">
        <tr>
            <td>firstName</td>
            <td>lastName</td>
            <td>email</td>
        </tr>

            <c:forEach items="${persons}" var="name">
        <tr>
            <td>${name.firstName}</td>
            <td>${name.lastName}</td>
            <td>${name.email}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
