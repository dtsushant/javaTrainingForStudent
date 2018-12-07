<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 12/6/18
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body>
<div id="container">
    <div id="header">
        <jsp:include page="/WEB-INF/views/common/header.jsp" />
    </div>

    <div id="content">
        <jsp:include page="/WEB-INF/views/pages/${pageName}.jsp" />
    </div>

    <div id="footer">
        <jsp:include page="/WEB-INF/views/common/footer.jsp" />
    </div>

</div>

</body>
</html>
