<%@ page import="com.webtraining.model.Pets" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 12/6/18
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

this jsp page is being rendered from servlet

<br/>
<%
    out.print(request.getAttribute("somevalue"));
    out.print("<br/>");
    double d2 = 100;

    double d3 = d2 + (double)request.getAttribute("doubleValue");

    out.print(d3);

    out.print("<br/>");

    Pets p = (Pets) request.getAttribute("pets");


%>

name = <%=p.getName()%>
type = <%=p.getType()%>
age = <%=p.getAge()%>
color = <%=p.getColor()%>

<br/>

${somevalue}<br/>
${doubleValue}<br/>
${doubleValue + 100}<br/>
${pets}<br/>
${pets.name}<br/>
${pets.color}<br/>
${pets.category}<br/>



</body>
</html>
