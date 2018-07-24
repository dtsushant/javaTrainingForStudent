<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.javawebtraining.model.Reads" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 7/24/18
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body><%
    ArrayList<Reads> ar =(ArrayList<Reads>) request.getAttribute("readlist");
%>

<table border="1px">
    <thead style="font-weight: bold;">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Author</td>
        <td>Genre</td>
        <td>ISBN</td>
        <td>Publicaiton</td>
        <td>Price</td>
    </tr>
    </thead>
    <tbody>
    <%
        for(Reads h : ar){


    %>
    <tr>
        <td><% out.print(h.getId());%></td>
        <td><%=h.getName()%></td>
        <td><%=h.getAuthor()%></td>
        <td><%=h.getGenre()%></td>
        <td><%=h.getIsbnNo()%></td>
        <td><%=h.getPublication()%></td>
        <td><%=h.getPrice()%></td>


    </tr>
    <%

        }
    %>
    </tbody>
</table>

</body>
</html>
