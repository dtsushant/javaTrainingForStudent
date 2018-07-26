<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <td>Action</td>
    </tr>
    </thead>
    <tbody>

    <c:forEach var="r" items="${booklist}" >

        <tr>
            <td >${r.id}</td>
            <td>${r.name}</td>
            <td>${r.author}</td>
            <td>${r.genre}</td>
            <td>${r.isbnNo}</td>
            <td>${r.publication}</td>
            <td>${r.price}</td>
            <td><a href="#">Edit</a>/ <a href="#">Delete</a></td>
        </tr>

    </c:forEach>

    </tbody>
</table>