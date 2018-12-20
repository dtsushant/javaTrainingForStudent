<%@ taglib prefix="custom" uri="http://javatraining.com" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 12/5/18
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>something</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css"/>

</head>
<body>

<%
    for (int i =1; i<=10;i++){
        out.println(i+"<br/>");
    }
%>

<custom:empty/>

<input type="text" />

<custom:mulitiplier multiply="4" goUpto20="true" />
<custom:mulitiplier multiply="10"  />

<custom:errorFinder>
    hi this is an example of error while its not an error also Error
</custom:errorFinder>

</body>
</html>
