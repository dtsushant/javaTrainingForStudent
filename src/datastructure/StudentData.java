package datastructure;

import dataentry.DataEntryTool;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentData {
    static HashMap<Integer,ArrayList<Student>> studentInfo = new HashMap<>();
    static DataEntryTool de = new DataEntryTool();

    public static void main(String args[]){
        boolean bool = true;

        while(bool){
            System.out.println("Enter an option below:-");
            System.out.println("1. Enter a student information:-");
            System.out.println("2. Display All student:-");
            System.out.println("3. Display Student for class:-");
            System.out.println("4. Delete a student for class:-");
            System.out.println("5. Exit");

            int option = de.getIntegerInRange(1,5);
            int grade;

            switch (option){
                case 1:
                    System.out.println("enter grade for the student:-");
                    grade = de.getIntegerInRange(1,10);

                    ArrayList<Student> studentList = studentInfo.get(grade);

                    if(studentList!=null){
                        enterNewStudentInfo(grade,studentList);
                    }else{
                        ArrayList<Student> std = new ArrayList<>();
                        enterNewStudentInfo(grade,std);
                        studentInfo.put(grade,std);
                    }
                    break;
                case 2:
                    displayAllStudent();
                    break;
                case 3:
                    System.out.println("enter grade for the student:-");
                    grade = de.getIntegerInRange(1,10);
                    System.out.printf("displaying student information for grade %d\n",grade);
                    displayStudentOfGrade(grade);
                    break;

                case 4:
                    System.out.println("enter grade for the student:-");
                    grade = de.getIntegerInRange(1,10);
                    System.out.println("Enter id for the student");
                    int id = de.nextInt();
                    System.out.println(deleteStudentOfClass(grade,id));
                    break;
                case 5:
                    bool= false;
            }


        }
    }

    public static void enterNewStudentInfo(int grade, ArrayList<Student> studentList){
        System.out.println("Enter student id");
        int id = de.nextInt();
        System.out.println("Enter student full name");
        String fullname = de.next();
        System.out.println("Enter student age");
        int age = de.getIntegerInRange(1,16);
        System.out.println("Enter student gender");
        String gender = de.getGender();

        Student std = new Student(id,grade,fullname,age,gender);
        studentList.add(std);

    }

    public static void displayStudentOfGrade(int grade){
        ArrayList<Student> studentList = studentInfo.get(grade);
        if(studentList!=null) {
            for (Student st : studentList) {
                System.out.println("\n***********************************************");
                System.out.printf("id = %d |", st.getId());
                System.out.printf(" fullname = %s |", st.getFullName());
                System.out.printf(" age = %d |", st.getAge());
                System.out.printf(" gender = %s |", st.getGender());
            }
            System.out.println();
        }

    }

    public static void displayAllStudent(){
        Iterator<Integer> grades = studentInfo.keySet().iterator();
        while (grades.hasNext()){
            int grade = grades.next();
            System.out.printf("displaying information for grade %d\n",grade);
            displayStudentOfGrade(grade);
        }
    }

    public static String deleteStudentOfClass(int grade, int id){
        String studentFullnameId = "";
        ArrayList<Student> studentArrayList = studentInfo.get(grade);

        int i = 0;
        for(Student st: studentArrayList){
            if(id==st.getId()){
                studentFullnameId = String.format("Student named %s with id %d is deleted",st.getFullName(),st.getId());
                studentArrayList.remove(i);
                break;
            }
            i++;
        }

        if(studentFullnameId.equals("")){
            studentFullnameId="No student found with that Id";
        }


        return studentFullnameId;
    }


}
