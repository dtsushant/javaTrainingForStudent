package oops.datastructure;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String args[]){
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();


        stringArrayList.add("one");
        System.out.println("the value of arraylist ==>>"+stringArrayList);

        stringArrayList.add("two");
        stringArrayList.add("four");
        System.out.println("the value of arraylist ==>>"+stringArrayList);

        stringArrayList.add(2,"three");
        stringArrayList.add("5");
        stringArrayList.add("5");

        System.out.println("the value of arraylist ==>>"+stringArrayList);
        System.out.println(stringArrayList.size());

        System.out.println(integerArrayList.size());

        System.out.println(stringArrayList.get(1));
        System.out.println(stringArrayList.get(4));

        integerArrayList.add(51);
        integerArrayList.add(41);
        integerArrayList.add(31);
        integerArrayList.add(11);
        integerArrayList.add(3,21);
        integerArrayList.add(0,0);

        System.out.println("the value of integer arraylist ==>>"+integerArrayList);
        System.out.println(integerArrayList.get(3));

        System.out.println("printing all string arraylist from dynamic method");
        printArrayList(stringArrayList);

        System.out.println("printing all string arraylist");
        printStringArrayList(stringArrayList);

        System.out.println("printing all integer arraylist");
        printIntegerArrayList(integerArrayList);

        System.out.println(integerArrayList);

        System.out.println(integerArrayList);




    }

    public static void printArrayList(ArrayList a){
        for(int i =0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }

    public static void printStringArrayList(ArrayList<String> a){
        for(String s: a){
            System.out.println(s);
        }
    }

    public static void printIntegerArrayList(ArrayList<Integer> a){
        for(Integer i:a){
            System.out.println(i);
        }
    }
}
