<%-- 
    Document   : nameView
    Created on : Mar 5, 2018, 2:55:09 PM
    Author     : ALVIN
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>/hello</title>
    </head>
    <body>
        <h1>Enter your name: </h1>
        <spring:nestedPath path="name">
    <form action="" method="post">
        Name:
        <spring:bind path="value">
            <input type="text" name="${status.expression}" value="${status.value}">
        </spring:bind>
        <input type="submit" value="OK">
    </form>
</spring:nestedPath>
    
    
    </body>
</html>
