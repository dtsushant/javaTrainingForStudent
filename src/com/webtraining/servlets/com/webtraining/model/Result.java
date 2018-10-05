package com.webtraining.servlets.com.webtraining.model;

import com.webtraining.servlets.com.webtraining.db.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Result {
    private int id;
    private String examName;
    private Student student;
    private double math;
    private double science;
    private double english;
    private double socialStudies;
    private double Nepali;

    public Result(int id, String examName, Student student, double math, double science, double english, double socialStudies, double nepali) {
        this.id = id;
        this.examName = examName;
        this.student = student;
        this.math = math;
        this.science = science;
        this.english = english;
        this.socialStudies = socialStudies;
        Nepali = nepali;
    }

    public Result(String examName, Student student, double math, double science, double english, double socialStudies, double nepali) {
        this.examName = examName;
        this.student = student;
        this.math = math;
        this.science = science;
        this.english = english;
        this.socialStudies = socialStudies;
        Nepali = nepali;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getScience() {
        return science;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getSocialStudies() {
        return socialStudies;
    }

    public void setSocialStudies(double socialStudies) {
        this.socialStudies = socialStudies;
    }

    public double getNepali() {
        return Nepali;
    }

    public void setNepali(double nepali) {
        Nepali = nepali;
    }

    public double getTotal(){
        return (this.english+this.science+this.getNepali()+this.math+this.socialStudies);
    }

    public static ArrayList<Result> findAllByStudent(Student std){
        ArrayList<Result> results = new ArrayList<>();
        String sql = "Select * from result where student_id = ?";

        try{
            Connection con = Connector.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,std.getId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String examName = rs.getString("exam_name");
                double math = rs.getDouble("math");
                double science = rs.getDouble("science");
                double english = rs.getDouble("english");
                double socialStudies = rs.getDouble("social_studies");
                double nepali = rs.getDouble("nepali");

                Result r = new Result(id,examName,std,math,science,english,socialStudies,nepali);
                results.add(r);

            }
            con.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        return results;
    }

    public boolean save(){
        boolean bool = false;
        String sql = "Insert into result ( exam_name, student_id, math , science, english , nepali , social_studies) values(?,?,?,?,?,?,?)";
        try{
            Connection con = Connector.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,this.examName);
            stmt.setInt(2,this.student.getId());
            stmt.setDouble(3,this.math);
            stmt.setDouble(4,this.science);
            stmt.setDouble(5,this.english);
            stmt.setDouble(6,this.getNepali());
            stmt.setDouble(7,this.socialStudies);
            stmt.execute();
            con.close();
            bool = true;
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        return bool;
    }
}
