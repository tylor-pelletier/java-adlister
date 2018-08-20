<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/20/18
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="./partials/head.jsp">
        <jsp:param name="title" value="Admin Profile" />
    </jsp:include>
</head>
<body>

    <%@ include file="./partials/navbar.jsp" %>

    <h1>Hello Admin!</h1>

</body>
</html>
