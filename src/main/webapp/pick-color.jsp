<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/21/18
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <h1>Enter your favorite color</h1>
    <form action="/pickcolor" method="post">
        <input type="text" name="pickcolor">
        <button>Submit Color</button>
    </form>
</body>
</html>
