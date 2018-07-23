<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 7/23/18
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    hello i am rendered from servlet
    <br/>


    <%
        out.println(request.getAttribute("prop1"));
    %>


    <%
        ArrayList<HashMap<String,String>> ar =(ArrayList<HashMap<String,String>>) request.getAttribute("bookMap");
    %>

    <table border="1px">
        <thead style="font-weight: bold;">
        <tr>
            <td>Name</td>
            <td>Author</td>
            <td>Genre</td>
            <td>Price</td>
        </tr>
        </thead>
        <tbody>
        <%
            for(HashMap<String,String> h : ar){


        %>
        <tr>
            <td><% out.print(h.get("name"));%></td>
            <td><%=h.get("author")%></td>
            <td><%=h.get("genre")%></td>
            <td><%=h.get("price")%></td>
        </tr>
        <%

            }
        %>
        </tbody>
    </table>
</body>
</html>
