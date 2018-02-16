package com;

import java.util.List;
import java.util.Map;
import java.util.Properties;


public class College {

    private String collegeName;
    private String establishedYear;

    private List<Student> students;
    private Map<String, Student>  studentContracts;
    private Properties faculties;

    public College() {
    }

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(String establishedYear) {
        this.establishedYear = establishedYear;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<String, Student> getStudentContracts() {
        return studentContracts;
    }

    public void setStudentContracts(Map<String, Student> studentContracts) {
        this.studentContracts = studentContracts;
    }

    public Properties getFaculties() {
        return faculties;
    }

    public void setFaculties(Properties faculties) {
        this.faculties = faculties;
    }
}
