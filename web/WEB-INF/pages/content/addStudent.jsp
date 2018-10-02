<form method="post" action="/addStudent">
    Grade : <select required name="grade">
                <option value="">--Please select a class --</option>
                <option >1</option>
                <option >2</option>
                <option >3</option>
                <option >4</option>
                <option >5</option>
                <option >6</option>
                <option >7</option>
                <option >8</option>
                <option >9</option>
                <option >10</option>
            </select>
    <br/>

    Full Name : <input type="text" required name="fullname" />
    <br/>
    Gender : male<input type="radio" name="gender" value="male">  female<input type="radio" name="gender" value="female"><br/>

    Age: <input type="number" required name="age"/>
    <br/>

    <input type="submit" value="Submit" />
</form>
