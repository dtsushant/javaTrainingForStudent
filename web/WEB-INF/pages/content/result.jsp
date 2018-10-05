<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Displaying result for ${student.fullName}</h1>
<br/>
<div><a href="/addResult?studentId=${student.id}">Add new Result</a></div>
<table>
    <thead>
        <tr>
            <th>Exam Name</th>
            <th>Math</th>
            <th>Science</th>
            <th>Enlish</th>
            <th>Social Studies</th>
            <th> Nepali</th>
            <th>Total</th>
            <th>Percentage</th>
            <th>Remarks</th>
            <th>Action</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="r" items="${resultData}">
            <tr>
                <td>${r.examName}</td>
                <td>${r.math}</td>
                <td>${r.science}</td>
                <td>${r.english}</td>
                <td>${r.socialStudies}</td>
                <td>${r.nepali}</td>
                <td>${r.total}</td>
                <td></td>
                <td></td>
                <td>Edit</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

