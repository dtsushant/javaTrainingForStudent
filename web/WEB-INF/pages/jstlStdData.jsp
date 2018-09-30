<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 9/30/18
  Time: 7:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Data sent from servlet in variable 1 = ${variable1}
<br/>
Data sent from servlet in variable 2 = ${variable2}
<br/>

<c:set var="something" value="this is a value"/>
<c:set var="aaa" value="77"/>

Variable set in jsp from jstl usage:- ${something}
<br/>
<c:if test="${aaa<100}">
    the condition of variable aaa set in jstl is less than hundred
</c:if>

<c:if test="${aaa==100}">
    the condition of variable aaa set in jstl is equal to  hundred

</c:if>

<c:if test="${aaa>100}">
    the condition of variable aaa set in jstl is greater than  hundred

</c:if>

<br/>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Grade</th>
        <th>FullName</th>
        <th>Age</th>
        <th>Gender</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach var="s" items="${studentData}">

    <tr>
        <td>${s.id}</td>
        <td>${s.grade}</td>
        <td>${s.fullName}</td>
        <td>${s.age}</td>
        <td>${s.reverseGender}</td>

    </tr>
    </c:forEach>
    </tbody>

</table>




</body>
</html>
