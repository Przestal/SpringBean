package com;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class College {

    private String collegeName;
    private String establishedYear;

    private List<Student> students;
    private Map<String, Student>  studentContacts;
    private Properties faculties;
    private Set books;
    private Student collegeStudent;

    public void setCollegeStudent(Student collegeStudent) {
        this.collegeStudent = collegeStudent;
    }

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

    public Map<String, Student> getStudentContacts() {
        return studentContacts;
    }

    public void setStudentContracts(Map<String, Student> studentContracts) {
        this.studentContacts = studentContracts;
    }

    public Properties getFaculties() {
        return faculties;
    }

    public void setFaculties(Properties faculties) {
        this.faculties = faculties;
    }

    public void setBooks(Set books) {
        this.books = books;
    }

    public Set getBooks() {
        return books;
    }



    public void setStudentContacts(Map<String, Student> studentContacts) {
        this.studentContacts = studentContacts;
    }

    public Student getCollegeStudent() {
        return collegeStudent;
    }
}
