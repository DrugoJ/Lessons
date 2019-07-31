<%-- 
    Document   : addRenting
    Created on : Feb 19, 2019, 12:40:52 PM
    Author     : User
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rent the Book</title>
    </head>
    <body>
        <h1>Rent the Book</h1>
        <form action="createRenting" metod="POST">
            Book list:<br>
            <select name="bookId">
                <c:forEach var="book" items="${listBooks}">
                    <option value="${book.ID}">${book.name}</option>
                </c:forEach>
            </select><br>
            Customer list:<br>
            <select name="readerId">
                <c:forEach var="reader" items="${listReaders}">
                    <option value="${reader.ID}">${reader.name}</option>
                </c:forEach>
            </select><br>
            <br>
            <input type="submit" value="Rent">
        </form>
    </body>
</html>
