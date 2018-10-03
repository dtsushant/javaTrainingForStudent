<form method="post" action="/editStudent">
    Grade : <select required name="grade">
    <option value="">--Please select a class --</option>
    <option ${studentData.grade == 1?"selected":""} >1</option>
    <option ${studentData.grade == 2?"selected":""}>2</option>
    <option ${studentData.grade == 3?"selected":""}>3</option>
    <option ${studentData.grade == 4?"selected":""}>4</option>
    <option ${studentData.grade == 5?"selected":""}>5</option>
    <option ${studentData.grade == 6?"selected":""}>6</option>
    <option ${studentData.grade == 7?"selected":""}>7</option>
    <option ${studentData.grade == 8?"selected":""}>8</option>
    <option ${studentData.grade == 9?"selected":""}>9</option>
    <option ${studentData.grade == 10?"selected":""}>10</option>
</select>
    <br/>

    Full Name : <input type="text" required name="fullname" value="${studentData.fullName}" />
    <br/>
    Gender : male<input type="radio" name="gender" value="male" ${studentData.gender == "male"?"checked":""}>  female<input type="radio" name="gender" value="female" ${studentData.gender == "female"?"checked":""}><br/>

    Age: <input type="number" required name="age" value="${studentData.age}"/>
    <br/>
    <input type="hidden" name="id" value="${studentData.id}"/>
    <input type="submit" value="Submit" />
</form>