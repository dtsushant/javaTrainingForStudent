<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form method="post" action="/pets/add">
    <label>Pet's Name</label>
    <input type="text" name="name" required/>
    <br/>
    <label>Color</label>
    <input type="text" name="color" required/>
    <br/>
    <label>Age</label>
    <input type="number" name="age" required/>
    <br/>
    <label>Weight</label>
    <input type="number" name="weight" required/>
    <br/>
    <label>Type</label>
    <select name="type" required>
        <option selected value="">--Select type--</option>
        <option>Bird</option>
        <option>Dog</option>
        <option>Cat</option>
        <option>Fish</option>
    </select>
    <br/>
    <label>Is vaccinated:</label>
    <input type="radio" value="1" name="isVaccinated"/> true <input type="radio" value="0" name="isVaccinated"/> false
    <br/>
    <label>Pet's Owner:</label>
    <select name="owner" required>
        <option selected value="">--Select an Owner--</option>
        <c:forEach items="${ownerList}" var="o">
            <option value="${o.id}">${o.fullname}</option>
        </c:forEach>
    </select>
    <br/>
    <input type="submit" value="Save" />
</form>