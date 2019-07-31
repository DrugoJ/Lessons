<%-- 
    Document   : addBlog
    Created on : Mar 11, 2019, 10:16:16 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Blog</title>
    </head>
    <body>
        <h1>Add Blog</h1>
        <br>
        <br>
        <form action="createBlog" method="POST">
            Author name:<br>
            <input type="text" name="author"><br>
            Title:<br>
            <input type="text" name="title"><br>
            Article:<br>
            <input type="text" name="article"><br>
            <br><br>
            <input type="submit" value="Add Blog">
        </form>
    </body>
</html>
