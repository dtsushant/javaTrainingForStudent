<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 10/2/18
  Time: 7:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>HI this is parse 1 page </h1>

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

    <c:forEach var="s" items="${stdList}">

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
