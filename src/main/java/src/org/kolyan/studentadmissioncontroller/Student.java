package src.org.kolyan.studentadmissioncontroller;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String studentName;
    private String studentHobby;

    private Long studentMobile;
    // ID BE NOT VALID DATE WILL BE ERROR!!!
    private Date studentDOB;
    private ArrayList<String> studentSkills;

    // if in model have nested models this field must have this annotation
    @Valid
    private Address studentAddress;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    public Long getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(Long studentMobile) {
        this.studentMobile = studentMobile;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public ArrayList<String> getStudentSkills() {
        return studentSkills;
    }

    public void setStudentSkills(ArrayList<String> studentSkills) {
        this.studentSkills = studentSkills;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }
}