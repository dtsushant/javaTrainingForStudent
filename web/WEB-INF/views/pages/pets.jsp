<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="i" value="0"/>

<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Type</th>
        <th>Age</th>
        <th>Color</th>
        <th>Is Vaccinated</th>
        <th>Weight</th>
        <th>Owner</th>
        <th>Action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${petList}" var="p" >
        <c:set var="i" value="${i+1}" />
        <tr class="${i%2==0?"even":"odd"}">
            <td>${p.name}</td>
            <td>${p.type}</td>
            <td>${p.age}</td>
            <td>${p.color}</td>
            <td>${p.vaccinated}</td>
            <td>${p.weight}</td>
            <td>${p.owner.fullname}</td>
            <td><a href="#">Edit</a> / <a href="#">Delete</a></td>
        </tr>
    </c:forEach>

    </tbody>


</table>