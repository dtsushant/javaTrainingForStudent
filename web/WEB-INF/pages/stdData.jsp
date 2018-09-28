<%@ page import="com.webtraining.servlets.com.webtraining.model.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 9/28/18
  Time: 7:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    hi hello something something
    <br/>

    <b>THis is a data from servlet ===> <%=request.getAttribute("variable1")    %></b>
    <br/>
    <b>THis is another data from servlet ===> <%=request.getAttribute("variable2")    %></b>
    <br/>
    <b>THis is another data from servlet ===> <%=request.getAttribute("studentData")    %></b>
    <br/>
    <b>THis is another data from servlet ===> <%=request.getAttribute("jpt")    %></b>

    <br>
    <br>
    <br>
    Another way of representing data
    data from server in variable 1 = ${variable1}
    <br/>
    data from servelet in variable 2 = ${variable2}
    <br/>
    data from servelet in studentdata = ${studentData}

    <br/>
    data from servlet in jpt = ${jpt}
    <br/>
    <br/>
    <br/>
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

    <%
        ArrayList<Student> stdList = (ArrayList<Student>) request.getAttribute("studentData");

        for(Student s: stdList){
    %>
        <tr>
            <td><%= s.getId()%></td>
            <td><%= s.getGrade()%></td>
            <td><%= s.getFullName()%></td>
            <td><%= s.getAge()%></td>
            <td><%= s.getGender()%></td>

        </tr>
    <%
        }
    %>
        </tbody>

    </table>
</body>
</html>
