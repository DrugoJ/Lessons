<%-- 
    Document   : getBlog
    Created on : Mar 11, 2019, 10:16:30 AM
    Author     : User
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Blog</title>
    </head>
    <body>
        <h1>Get Blog</h1>
        <br>
        <br>
      
                <c:forEach var="blog" items="${listBlogs}">
                    <p>${product.name}</p>
                    <p>${product.basePrice}</p>
                    <p>${product.description}</p>
                    <p>${product.releaseDate}</p>
                </c:forEach>
           
    </body>
</html>
