<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Grade</th>
        <th>FullName</th>
        <th>Age</th>
        <th>Gender</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach var="s" items="${stdList}">

        <tr>
            <td>${s.id}</td>
            <td>${s.grade}</td>
            <td>${s.fullName}</td>
            <td>${s.age}</td>
            <td>${s.reverseGender}</td>

        </tr>
    </c:forEach>
    </tbody>

</table>