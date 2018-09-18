package connector;

import dataentry.DataEntryTool;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDataOperation {

    private static DataEntryTool de = new DataEntryTool();

    public static ArrayList<Student> findAll(){
        ArrayList<Student> studentList= new ArrayList<Student>();
        String sql = "Select * from student";
        try{
            Connection con = MysqlConnector.getConnection();
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

    public static void insertNewStudent(Student std){
        try{
            Connection con = MysqlConnector.getConnection();
            String sql = "INSERT into student (grade, full_name, age, gender) values(?, ?, ?, ? );";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, std.getGrade());
            stmt.setString(2, std.getFullName());
            stmt.setInt(3,std.getAge());
            stmt.setString(4,std.getGender());

            stmt.execute();
            con.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]){

        boolean bool = true;

        while(bool) {
            System.out.println("Enter an option below:-");
            System.out.println("1. Display All student:-");
            System.out.println("2. Enter a student information:-");
            System.out.println("3. Display Student for class:-");
            System.out.println("4. Delete a student for class:-");
            System.out.println("5. Exit");

            Integer option = de.getIntegerInRange(1,6);

            switch (option){
                case 1:
                    ArrayList<Student> stdList = findAll();
                    displayAllStudent(stdList);
                    break;
                case 2:
                    Student std = getStudentInfoFromUser();
                    insertNewStudent(std);
                    break;
                case 6:
                    bool = false;
                    break;

            }
        }

    }

    public static void displayAllStudent(ArrayList<Student> stdlist){
        System.out.println("--------displaying student information-------------");
        for(Student s : stdlist){
            System.out.println("************************************************");
            System.out.printf(" Id = %d ",s.getId());
            System.out.printf(" Name = %s ",s.getFullName());
            System.out.printf(" Gender = %s ",s.getGender());
            System.out.printf(" Grade = %d ",s.getGrade());
            System.out.printf(" Age = %d \n",s.getAge());
        }
    }

    public static Student getStudentInfoFromUser(){

        System.out.println("Enter student full name");
        String fullname = de.next();
        System.out.println("Enter student age");
        int age = de.getIntegerInRange(1,16);
        System.out.println("Enter student gender");
        String gender = de.getGender();

        System.out.println("Enter student grade:- ");
        int grade = de.nextInt();

        Student std = new Student();
        std.setGrade(grade);
        std.setFullName(fullname);
        std.setGender(gender);
        std.setAge(age);
        return std;


    }
}
