<%-- 
    Document   : addReader
    Created on : Feb 19, 2019, 12:40:39 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Reader</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="createReader" metod="POST">
        Reader name:<br>
        <input type="text" name="name"><br>
        Reader surname:<br>
        <input type="text" name="surname"><br>
        Reader phone:<br>
        <input type="text" name="phone"><br>
        <br><br>
        <input type="submit" value="Add Reader">
        
        </form>
    </body>
</html>
