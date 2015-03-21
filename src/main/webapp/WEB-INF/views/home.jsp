<%-- 
    Document   : home
    Created on : 21-mar-2015, 20.16.06
    Author     : jolab
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Web Application</title>
        <link rel="stylesheet" type="text/css"
              href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="<c:url value="/spittles" /> " >Spittles</a>
        <a href="<c:url value="/spitter/register" /> " >Register</a>
    </body>
</html>
