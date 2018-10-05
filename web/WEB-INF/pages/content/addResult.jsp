<form action="/addResult" method="post">
    Exam Name : <input type="text" required name="examName" /><br/>
    Math : <input type="number" required name="math" step="0.01" /><br/>
    English : <input type="number" required name="english" step="0.01"/><br/>
    Nepali : <input type="number" required name="nepali" step="0.01"/><br/>
    Science : <input type="number" required name="science" step="0.01" /><br/>
    Social Studies : <input type="number" required name="socialStudies" step="0.01"/><br/>
    <input type="hidden" value="${student.id}" name="studentId"/>
    <input type="submit"  value="Submit" />
</form>