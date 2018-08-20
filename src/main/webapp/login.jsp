<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/20/18
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ((username.equals("admin")) && (password.equals("password"))) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>

<html>
<head>
    <title>Login</title>
    <%@ include file="./partials/head.jsp" %>
</head>
<body>

    <%@ include file="./partials/navbar.jsp" %>

    <form method="post" action="login.jsp">
        <label for="username">Username:</label><br>
        <input id="username" type="text" name="username">
        <br><br>
        <label for="password">Password:</label><br>
        <input id="password" type="password" name="password">
        <br><br>
        <button type="submit">Log In</button>
    </form>

</body>
</html>
