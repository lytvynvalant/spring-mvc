<h1> ${headerMessage}</h1>
<h1>Studen admission form for engineering courses</h1>
<%-- action -> it is 'url' where will be submitted form
  post -> form's method --%>
<form action="/spring_mvc/submitForm.html" method="post">
    <p>
        Student's name <input type="text" name="studentName">
        <br/>
    </p>
    <p>
        Student's Hobby <input type="text" name="studentHobby">
        <br/>
    </p>
    <p>
        Student's Mobile <input type="text" name="studentMobile">
        <br/>
    </p>
    <p>
        Student's DOB <input type="text" name="studentDOB">
        <br/>
    </p>
    <p>
        Student's Skills
        <select name="studentSkills">
            <option value="java">java</option>
            <option value="js">js</option>
        </select>
        <br/>
    </p>
    <input type="submit" name="Submit this form be clicking here">
</form>