package com;

public class Student {
    private String name;
    private String age;
    private String department;
    private Book javaBook;
    private String studentName;

    public Book getJavaBook() {
        return javaBook;
    }


    public void setJavaBook(Book javaBook) {
        this.javaBook = javaBook;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
