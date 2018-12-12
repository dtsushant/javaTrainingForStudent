<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.webtraining.model.Owner" %>
<%@ page import="java.util.ArrayList" %>
<a href="/owner/add">Add new owner</a>


<c:set var="i" value="0" />

<table>
    <thead>
    <tr >
        <th>Name</th>
        <th>Address</th>
        <th>Phone Number</th>
        <th>Action</th>

    </tr>
    </thead>
    <tbody>
        <c:forEach items="${ownerList}" var="o" >
            <c:set var="i" value="${i+1}" />
            <tr class="${i%2==0?"even":"odd"}">
            <td>${o.fullname}</td>
            <td>${o.address}</td>
            <td>${o.phoneNo}</td>
            <td><a href="${o.editUrl}">Edit</a> / <a href="#">Delete</a></td>
            </tr>
        </c:forEach>

    </tbody>


</table>