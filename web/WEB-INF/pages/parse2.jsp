<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 10/2/18
  Time: 7:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hi this is parse 2 page</h1>

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


<form method="post" action="/reqParse">
    name : <input type="text" name="name"/> <br/>
    id : <input type="text" name="id"/> <br/>
    gender : male<input type="radio" name="gender" value="male">  female<input type="radio" name="gender" value="female"><br/>
    age : <select name="age">
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            </select><br/>
    <input type="submit" value="submit">
</form>
</body>
</html>
