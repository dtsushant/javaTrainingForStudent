<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 10/1/18
  Time: 7:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title.toString().length()>0?title:"Student Management System"}</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css"/>
</head>
<body>

<div id="container">
    <div id="header">
        <jsp:include page="/WEB-INF/pages/common/header.jsp" />
    </div>

    <div id="content">
        <jsp:include page="/WEB-INF/pages/content/${page}.jsp" />
    </div>

    <div id="footer">
        <jsp:include page="/WEB-INF/pages/common/footer.jsp" />
    </div>

</div>
</body>
</html>
