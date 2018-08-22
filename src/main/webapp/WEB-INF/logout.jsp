<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/22/18
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>
    <h1>Are you sure you want to log out?</h1>
    <form action="/logout" method="post">
        <input type="hidden" name="yes" value="yes">
        <button class="btn">Yes</button>
    </form>
    <form action="/logout" method="post">
        <input type="hidden" name="no" value="no">
        <button class="btn">No</button>
    </form>
</body>
</html>
