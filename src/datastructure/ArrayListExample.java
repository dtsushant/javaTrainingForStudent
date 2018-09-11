package datastructure;

import model.Student;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String args[]){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Student> studentArrayList = new ArrayList<>();

        integerArrayList.add(100);
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(500);
        integerArrayList.add(400);

        //THis shows all the the values in arraylist
        System.out.println(integerArrayList);
        //this shows the total no. of element in arraylist
        System.out.println(integerArrayList.size());

        //this will pull the element in 3rd index or 4th element as the index starts at 0
        System.out.println(integerArrayList.get(3));

        integerArrayList.add(0,50);
        System.out.println(integerArrayList);

        stringArrayList.add("one");
        stringArrayList.add("tw0");
        System.out.println(stringArrayList);

        stringArrayList.add(1,"zero");
        System.out.println(stringArrayList);

        for(int i =0; i<stringArrayList.size();i++){
            System.out.printf(" \n index i = %d , value = %s",i,stringArrayList.get(i));
        }


        System.out.println("\n this is using new kind of iteration ");
        for(String s: stringArrayList){
            System.out.println(s);
        }

        System.out.println("Starting to add student infor");

        Student s1 = new Student();
        s1.setFullName("Ram Aryal");
        s1.setAge(7);
        s1.setGender("Male");
        s1.setGrade(2);
        s1.setId(1);

        studentArrayList.add(s1);

        Student s2 = new Student(2,3,"Hari Lama",8,"male");

        studentArrayList.add(s2);

        studentArrayList.add(new Student(3,3,"Sushma karki",8,"female"));

        System.out.println(studentArrayList);

        for(Student st: studentArrayList){
            System.out.println("\n***********************************************");
            System.out.printf("id = %d |",st.getId());
            System.out.printf(" grade = %d |",st.getGrade());
            System.out.printf(" fullname = %s |",st.getFullName());
            System.out.printf(" age = %d |", st.getAge());
            System.out.printf(" gender = %s |",st.getGender());
        }


        System.out.println("\n classic for method");
        for(int i =0; i < studentArrayList.size(); i++){
            System.out.println("\n***********************************************");
            System.out.printf("id = %d |",studentArrayList.get(i).getId());
            System.out.printf(" grade = %d |",studentArrayList.get(i).getGrade());
            System.out.printf(" fullname = %s |",studentArrayList.get(i).getFullName());
            System.out.printf(" age = %d |", studentArrayList.get(i).getAge());
            System.out.printf(" gender = %s |",studentArrayList.get(i).getGender());
        }
    }
}
