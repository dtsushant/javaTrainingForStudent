<%@ page import="com.webtraining.model.Owner" %>
<%@ page import="java.util.ArrayList" %>
<a href="/owner/add">Add new owner</a>


<table>
    <thead>
    <tr >
        <th>Name</th>
        <th>Address</th>
        <th>Phone Number</th>

    </tr>
    </thead>
    <tbody>
        <%
            for(Owner o : (ArrayList<Owner>)request.getAttribute("ownerList")){
        %>
        <tr/>
            <td><%=o.getFullname()%></td>
            <td><%=o.getAddress()%></td>
            <td><%=o.getPhoneNo()%></td>
        </tr>
        <%
            }
        %>
    </tbody>

</table>