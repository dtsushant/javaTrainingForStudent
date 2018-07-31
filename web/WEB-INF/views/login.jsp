<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 7/31/18
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div>
        <form method="post" action="/login">
            <div>
                <label for="username">Username</label>
                <input type="text" name="username"  id="username" />
            </div>

            <div>
                <label for="password">Password</label>
                <input type="password" name="password"  id="password" />
            </div>

            <div>
                <input type="submit" value="Login In"/>
            </div>
        </form>
    </div>
</body>
</html>
