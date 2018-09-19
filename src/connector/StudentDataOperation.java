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

    public static ArrayList<Student> findAllByClass(){
        System.out.println("Enter the grade you wish to retrieve student for:- ");
        int grade = de.getIntegerInRange(1,10);
        ArrayList<Student> studentList= new ArrayList<Student>();
        String sql = "Select * from student where grade = ?";
        try{
            Connection con = MysqlConnector.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,grade);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){

                int id = rs.getInt("id");
                String fullName = rs.getString("full_name");
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

    public static Student findById(){
        System.out.println("Enter the id of the student :- ");
        int id = de.nextInt();
        Student student = null;
        String sql = "Select * from student where id = ?";
        try{
            Connection con = MysqlConnector.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){


                String fullName = rs.getString("full_name");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                int grade = rs.getInt("grade");

                student = new Student(id,grade,fullName,age,gender);
            }

            con.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        return student;
    }

    public static void updateStudent(Student std){
        printStudentInfo(std);

        System.out.println("Enter 0 for no and 1 for yes:-");

        System.out.println("Update full name ?");
        if(de.getIntegerInRange(0,1)==1){
            System.out.println("enter edited fullname :-");
            std.setFullName(de.next());
        }

        System.out.println("Update grade ?");
        if(de.getIntegerInRange(0,1)==1){
            System.out.println("enter edited grade :-");
            std.setGrade(de.getIntegerInRange(1,10));
        }

        System.out.println("Update age ?");
        if(de.getIntegerInRange(0,1)==1){
            System.out.println("enter edited age :-");
            std.setAge(de.getIntegerInRange(1,25));
        }

        System.out.println("Update gender ?");
        if(de.getIntegerInRange(0,1)==1){
            System.out.println("enter edited gender :-");
            std.setGender(de.getGender());
        }

        String sql = "Update student set full_name = ? , age= ?, gender= ? , grade = ? where id = ? ";
        try{
            Connection con = MysqlConnector.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, std.getFullName());
            stmt.setInt(2,std.getAge());
            stmt.setString(3,std.getGender());
            stmt.setInt(4,std.getGrade());
            stmt.setInt(5,std.getId());

            stmt.executeUpdate();
            con.close();
            System.out.println("Student successfully modified");
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
            System.out.println("4. Update a student with id:-");
            System.out.println("5. Delete a student with id:-");
            System.out.println("6. Exit");

            Integer option = de.getIntegerInRange(1,6);
            ArrayList<Student> stdList = new ArrayList<>();
            switch (option){
                case 1:
                    stdList.clear();
                    stdList = findAll();
                    displayAllStudent(stdList);
                    break;
                case 2:
                    Student std = getStudentInfoFromUser();
                    insertNewStudent(std);
                    break;
                case 3:
                    stdList.clear();
                    stdList = findAllByClass();
                    displayAllStudent(stdList);
                    break;
                case 4:
                    Student std1= findById();
                    if(std1!=null){
                        updateStudent(std1);
                    }
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    bool = false;
                    break;

            }
        }

    }

    public static void deleteStudent(){
        System.out.println("Enter the id of the student :- ");
        int id = de.nextInt();
        try{
            String sql = "delete from student where id = ?";
            Connection c = MysqlConnector.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.executeUpdate();
            c.close();
            System.out.println("Student deleted successfully ");
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void displayAllStudent(ArrayList<Student> stdlist){
        System.out.println("--------displaying student information-------------");
        for(Student s : stdlist){
            printStudentInfo(s);
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

    public static void printStudentInfo(Student s){
        System.out.println("************************************************");
        System.out.printf(" Id = %d ",s.getId());
        System.out.printf(" Name = %s ",s.getFullName());
        System.out.printf(" Gender = %s ",s.getGender());
        System.out.printf(" Grade = %d ",s.getGrade());
        System.out.printf(" Age = %d \n",s.getAge());
    }
}
