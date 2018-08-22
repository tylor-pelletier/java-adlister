<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/22/18
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <h1>All ADs</h1>
    <c:forEach var="ad" items="${allAds}">
        <div class="each-ad">
            <h1>${ad.id}: ${ad.title}</h1>
            <h3>${ad.description}</h3>
            <div>Seller ID: ${ad.userId}</div>
        </div>
    </c:forEach>
</body>
</html>
