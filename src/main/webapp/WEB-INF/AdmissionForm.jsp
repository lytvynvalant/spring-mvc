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
        <p style="color:red;">*Student's DOB value can't be empty<p>
        Student's DOB <input type="text" name="studentDOB" value="2014/02/09">
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

    <table>
        <tbody>
            <tr>
                <td></td>
            </tr>
            <tr>
               <%-- through a point specified fields and sub-entities --%>
                <td>country: <input type="text" name="studentAddress.country"></td>
                <td>city: <input type="text" name="studentAddress.city"></td>
                <td>street: <input type="text" name="studentAddress.street"></td>

                <p style="color:red;">*Pincode value can't be empty<p>
                <td>pincode: <input type="text" name="studentAddress.pincode" value="0"></td>
            </tr>
        </tbody>
    </table>
    <input type="submit" name="Submit this form be clicking here">
</form>