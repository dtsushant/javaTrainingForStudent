<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 7/26/18
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title!=null?title:"Book Library"}</title>

    <style>
        #main{
            margin: auto;
            width: 90%;
            border: 1px solid #000;

        }

        #header{
             margin-top: 4px;
             margin-left:5px;
             margin-right: 4px;
             border: 1px solid #000;
             width: 98%;
             height: 100px;

         }

        #container{
            margin-top: 4px;

            margin-left: 5px;
            border: 1px solid #000;
            width: 96%;
            min-height: 350px;
            padding: 6px;
        }

        #footer{
            margin-top: 4px;
            margin-left:5px;
            margin-right: 4px;
            border: 1px solid #000;
            width: 98%;
            height: 50px;
        }

        .menu li{
            display: inline;
            margin-right: 3px;
        }

        .menu li a {
            text-decoration: none;
            padding: 1px;
        }

        .element{
            display: block;
            line-break: strict;
        }
    </style>
</head>
<body>

<div id="main">
    <c:if test="${pageName==null}">
        <c:redirect url="/404.jsp" />
    </c:if>

    <jsp:include page="/WEB-INF/views/common/header.jsp" />

    <div id="container">
        <jsp:include page="/WEB-INF/views/pages/${pageName}.jsp" />
    </div>
    <jsp:include page="/WEB-INF/views/common/footer.jsp" />
</div>
</body>
</html>
