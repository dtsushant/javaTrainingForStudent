<%@ taglib prefix="my" uri="http://jpt.com" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 9/24/18
  Time: 7:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css"/>
</head>
<body>
<%
    String a = "hello";
    String b = "something";
    out.println(a.equals(b));
%>
 Hi this is my first web application
<br/>
hello ${sessionScope.get("name")}<br/>
hello ${sessionScope.get("dynamic")}

 <div id="container">
    <div class="section">
        this is 1st of the div
    </div>
     <div class="section">
        this is 2nd of the div
    </div>

     <my:pimple/>

     <my:eggBody>
         this will go to taglibwith body and will comeback with design
     </my:eggBody>
 </div>
</body>
</html>
