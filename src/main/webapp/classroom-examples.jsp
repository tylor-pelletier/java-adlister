<%--
  Created by IntelliJ IDEA.
  User: tylorpelletier
  Date: 8/20/18
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.util.*" %>
<%! int instanceCount = 0; %>
<%
  int localCount = 1;
  localCount += 1;
  instanceCount += 1;
  List test = new ArrayList<>();
%>


<html>
<head>

    <title>Title</title>

</head>
<body>

<!-- This comment will be seen by the client -->
<%-- This comment will only be seen server side --%>

    <h1>JSP Example</h1>
    <h2>Local Count: <%= localCount %></h2>
    <h2>Instance Count: <%= instanceCount %></h2>
    <h2>Query String: <%= request.getQueryString() %> </h2>

</body>
</html>