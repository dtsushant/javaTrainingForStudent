<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 10/7/18
  Time: 7:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form method="post" action="/login">
            Username: <input type="text" name="user" required /><br/>
            Password: <input type="password" name="pass" required/><br/>
            <input type="submit" value="submit"/>
        </form>
</body>
</html>
