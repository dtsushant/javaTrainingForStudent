package com.webtraining.servlets.com.webtraining.model;

import com.webtraining.servlets.com.webtraining.db.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

    public String getReverseGender(){
        if(this.gender.equalsIgnoreCase("male"))
            return "female";
            else
                return "male";
    }

    public static ArrayList<Student> getStudentList(){
        ArrayList<Student> stdList = new ArrayList<>();
        stdList.add(new Student(1,2,"John Doe",7,"male"));
        stdList.add(new Student(2,3,"Jane Doe",8,"Female"));
        stdList.add(new Student(3,2,"Sita Gita",7,"Female"));
        stdList.add(new Student(3,3,"Ram Hari",9,"male"));
        stdList.add(new Student(3,2,"Hari Ram",8,"male"));
        return stdList;
    }

    public static ArrayList<Student> findAll(){
        ArrayList<Student> studentList= new ArrayList<Student>();
        String sql = "Select * from student";
        try{
            Connection con = Connector.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String fullName = rs.getString("full_name");
                int grade = rs.getInt("grade");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                studentList.add(new Student(id,grade,fullName,age,gender));
            }

            con.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        return studentList;
    }
}
