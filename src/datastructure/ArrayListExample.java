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
    }
}
