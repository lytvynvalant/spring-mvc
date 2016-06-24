<html>
    <body>
       <h1> ${headerMessage}</h1>
        <h1>Congratulations!! The Engineering college has processed you Application form successfully</h1>
        <h2>${msg}</h2>
        <table>
            <tbody>
                <tr>
                    <td>Student name: </td>
                    <td>${student1.getStudentName()}</td>
                </tr>
                <tr>
                    <td>Student Hobby: </td>
                    <td>${student1.getStudentHobby()}</td>
                </tr>
                <tr>
                    <td>Student Mobile: </td>
                    <td>${student1.getStudentMobile()}</td>
                </tr>
                <tr>
                    <td>Student DOB: </td>
                    <td>${student1.getStudentDOB()}</td>
                </tr>
                <tr>
                    <td>Student Skills: </td>
                    <td>${student1.getStudentSkills()}</td>
                </tr>

            <tbody>
        <table>

        <hr>

        <table>
            <tbody>

                <%-- through a point specified fields and sub-entities --%>

                <tr>
                    <td>country: </td>
                    <td>${student1.studentAddress.country}</td>
                </tr>
                <tr>
                    <td>city: </td>
                    <td>${student1.studentAddress.city}</td>
                </tr>
                <tr>
                    <td>street: </td>
                    <td>${student1.studentAddress.street}</td>
                </tr>
                <tr>
                    <td>pincode: </td>
                    <td>${student1.studentAddress.pincode}</td>
                </tr>
            <tbody>
        <table>
    </body>
</html>
