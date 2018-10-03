<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Grade</th>
        <th>FullName</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Action</th>
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
            <td><a href="/editStudent?id=${s.id}">Edit Student</a> | <a href="/deleteStudent?id=${s.id}" onclick="return confirm('Are you sure?');">Delete Student</a></td>
        </tr>
    </c:forEach>
    </tbody>

</table>