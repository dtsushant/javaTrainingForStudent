<%@ page import="com.webtraining.model.Pets" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: spandey
  Date: 12/4/18
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
  </head>
  <body>
  <h1>hello this is index page</h1>
  <br/>
  5  + 5

  <%
    int a = 5;
    int b = 5;

    out.print(a + b);

    ArrayList<Pets> petsList = getPetsList();
    petsList.add(new Pets("kale","dog",7,"black",true,88.0));





  %>

  <%!

    public ArrayList<Pets> getPetsList(){
      ArrayList<Pets> petList = new ArrayList<Pets>();
      Pets pet = new Pets();
      pet.setName("Doggie");
      pet.setAge(7);
      pet.setColor("brown");
      pet.setType("Dog");
      pet.setWeight(23.1);
      pet.setVaccinated(true);

      petList.add(pet);

      Pets pet1 = new Pets("Billi","Cat",8,"Black and White",true,7.0);

      petList.add(pet1);

      petList.add(new Pets("Chari","Bird",1,"black",false,0.1));
      return petList;
    }
  %>


  <table>
    <thead>
      <tr >
        <th>Name</th>
        <th>Type</th>
        <th>Age</th>
        <th>Color</th>
        <th>Weight</th>
        <th>Is Vaccinated</th>
      </tr>
    </thead>

    <tbody>
      <tr class="odd">
        <td>kale</td>
        <td>kukur</td>
        <td>8</td>
        <td>kalo</td>
        <td>12</td>
        <td>cha</td>
      </tr>

      <tr class="even">
        <td>sete</td>
        <td>kukur</td>
        <td>4</td>
        <td>seto</td>
        <td>16</td>
        <td>cha</td>
      </tr>
    </tbody>
  </table>



  <table>
    <thead>
    <tr >
      <th>Name</th>
      <th>Type</th>
      <th>Age</th>
      <th>Color</th>
      <th>Weight</th>
      <th>Is Vaccinated</th>
    </tr>
    </thead>
    <tbody>
    <%
      int i = 0;
      for (Pets p:petsList) {
          i++;
    %>
      <tr class="<%=(i%2==0)?"even":"odd"%>">
        <td><% out.print(p.getName());%></td>
        <td><% out.print(p.getType());%></td>
        <td><%=p.getAge()%></td>
        <td><%=p.getColor()%></td>
        <td><%=p.getWeight()%></td>
        <td><%=p.isVaccinated()%></td>
      </tr>
    <%
      }
    %>
    </tbody>
  </table>

  </body>
</html>
