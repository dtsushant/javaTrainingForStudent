<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page import="com.webtraining.servlets.com.webtraining.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 9/25/18
  Time: 8:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css" />
</head>
<body>
Hi this is a request dispatch page
<h1>
    hello hello hello
</h1>
<%
    int a = 5;
    int b = 10;

%>
<b>
    5 * 10 =
    <%
        out.println(a*b);
    %>


</b>


<u><% out.println(returnSomeString());%></u>

<i><%
    System.out.println(lisOfStudent());
    out.println(lisOfStudent());
%></i>
<%!
    ArrayList<HashMap<String, String>> lisOfStudent(){
        ArrayList<HashMap<String,String>> arr = new ArrayList<>();
        HashMap<String,String> h1 = new HashMap<>();
        HashMap<String,String> h2 = new HashMap<>();
        HashMap<String,String> h3 = new HashMap<>();

        h1.put("name","Ram hari");
        h1.put("age","19");
        h1.put("class","12");
        h1.put("School","NCIT");

        h2.put("name","Sita hari");
        h2.put("age","18");
        h2.put("class","11");
        h2.put("School","BCIT");

        h3.put("name","Gita hari");
        h3.put("age","17");
        h3.put("class","10");
        h3.put("School","GCIT");

        arr.add(h1);
        arr.add(h2);
        arr.add(h3);

        return arr;
    }

    String returnSomeString(){
        return "this is a string";
    }

    ArrayList<Student> listStudent(){
        return null;
    }

%>

<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Class</th>
            <th>School</th>
        </tr>
    </thead>

    <tbody>
        <%
            for(HashMap<String,String> h: lisOfStudent()){


        %>
        <tr>
            <td><% out.print(h.get("name"));%></td>
            <td><%= h.get("age")%></td>
            <td><%= h.get("class")%></td>
            <td><%= h.get("School")%></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>
</body>
</html>
