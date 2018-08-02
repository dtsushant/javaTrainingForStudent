<%@ taglib prefix="de" uri="http://tagblibtest.com" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 7/19/18
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String str = "hello this is a java string bvariable";

        int i = 5+5;
        out.println(test());


    %>

    <%!
       String test(){

           return "hello";
       }

       HashMap<String,String> prepareHashmap(int i){
           HashMap<String, String> hm = new HashMap<String, String>();
           hm.put("name","name"+i);
           hm.put("age","age"+i);
           hm.put("gender","gender"+i);
           return hm;
       }
    %>



    <br/>
    <p>
    <% out.println(str);%>
    <br/>
        <% out.println(i); %>

    </p>



    hello this is custom jsp file
    <p>

    </p>
    <br/>

    <b>5 + 5</b>

    <%
        ArrayList<HashMap<String,String>> ar = new ArrayList<HashMap<String,String>>();

        ar.add(prepareHashmap(1));
        ar.add(prepareHashmap(2));
        ar.add(prepareHashmap(3));
        ar.add(prepareHashmap(4));
        ar.add(prepareHashmap(5));
        ar.add(prepareHashmap(6));
    %>

    <table border="1px">
        <thead style="font-weight: bold;">
            <tr>
                <td>Name</td>
                <td>Age</td>
                <td>Gender</td>
            </tr>
        </thead>
        <tbody>
    <%
        for(HashMap<String,String> h : ar){
            Iterator<String> it = h.keySet().iterator();


    %>
        <tr>
            <td><% out.print(h.get("name"));%></td>
            <td><%=h.get("age")%></td>
            <td><%=h.get("gender")%></td>
        </tr>
    <%

        }
    %>
        </tbody>
    </table>

<de:empty/>

    <br/>

<de:withbody>
    something withiun the body
</de:withbody>

<de:withattribute  name="human" />


</body>
</html>
