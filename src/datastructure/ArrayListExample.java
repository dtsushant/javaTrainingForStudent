package datastructure;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String args[]){
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        ArrayList<String> stringArrayList = new ArrayList<>();

        integerArrayList.add(99);

        integerArrayList.add(188);

        integerArrayList.add(37);

        System.out.println(integerArrayList);

        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.get(2));

        integerArrayList.add(1,72);

        System.out.println(integerArrayList);

        System.out.println(integerArrayList.get(2));


        stringArrayList.add("1");

        stringArrayList.add("ek");

        stringArrayList.add("uno");

        System.out.println(stringArrayList);

        stringArrayList.add(0,"One");

        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(2));

    }
}
