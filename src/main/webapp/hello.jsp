<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <!--XSS TEST-->
        <!--<h1>Cześć, ${p1.firstName}!</h1>-->
        
        h1>witaj, <c:out value="${p1.firstName} ${p1.lastName}"/>!</h1>
        <a href = "mailto: ${p1.email}">wyślij email</a>
        
        <c:forEach items="${daysOfTheWeek}" var="day">
            <p>
                ${day}
            </p>
        </c:forEach>

    </body>
</html>
