<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/21/18
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
    <h1>Guess a number between 1 and 100</h1>
    <form action="/guess" method="post">
        <input type="text" name="guess">
        <button>Submit Number</button>
    </form>
</body>
</html>
