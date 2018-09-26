package com.webtraining.servlets.com.webtraining.model;

public class Student {
    private Integer id;
    private Integer grade;
    private String fullName;
    private Integer age;
    private String gender;

    public Student() {
    }

    public Student(Integer id, Integer grade, String fullName, Integer age, String gender) {
        this.id = id;
        this.grade = grade;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
