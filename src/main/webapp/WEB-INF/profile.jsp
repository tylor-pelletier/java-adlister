<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user}</h1>
        <h3>You are viewing your profile.</h3>
    </div>

    <div class="container">
        <form action="/profile" method="post">
            <input type="hidden" name="log-out">
            <button class="btn btn-primary">Log Out</button>
        </form>
    </div>

</body>
</html>
