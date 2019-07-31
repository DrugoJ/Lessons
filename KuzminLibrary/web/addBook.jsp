<%-- 
    Document   : addBook
    Created on : Feb 19, 2019, 12:40:26 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book</title>
    </head>
    <body>
        <h1>Add Book</h1>
        <form action="createBook" metod="POST">
            Book name:<br>
            <input type="text" name="name"><br>
            Author:<br>
            <input type="text" name="author"><br>
            Amount:<br>
            <input type="text" name="amount"><br>
            <br><br>
            <input type="submit" value="Add Book">
        </form>
    </body>
</html>
