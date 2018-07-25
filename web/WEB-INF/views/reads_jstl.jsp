<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 7/25/18
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        .odd{
            background: #ccc;
        }

        .even{
            background: cadetblue;
        }
    </style>
</head>
<body>

${example}

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

    <c:forEach var="r" items="${readlist}" >

    <tr class="${r.id%2==0?"even":"odd"}">
        <td >${r.id}</td>
        <td>${r.name}</td>
        <td>${r.author}</td>
        <td>${r.genre}</td>
        <td>${r.isbnNo}</td>
        <td>${r.publication}</td>
        <td>
                <c:if test="${r.price>100}">
                    Expensive
                </c:if>

            <c:if test="${r.price<=100}">
                Cheap
            </c:if>





        </td>


    </tr>

    </c:forEach>

    </tbody>
</table>

</body>
</html>
