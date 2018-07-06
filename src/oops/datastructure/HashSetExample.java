package oops.datastructure;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String args[]){
        HashSet<String> stringHashSet = new HashSet<>();
        HashSet<Integer> integerHashSet = new HashSet<>();

        stringHashSet.add("one");
        stringHashSet.add("two");
        stringHashSet.add("two");
        stringHashSet.add("three");
        stringHashSet.add("three");
        stringHashSet.add("four");

        System.out.println(stringHashSet);

        Iterator<String> i = stringHashSet.iterator();

      /*  System.out.println("i.next() = " + i.next());
        System.out.println("i.hasNext() = " + i.hasNext());;
        System.out.println("i.next() = " + i.next());
        System.out.println("i.hasNext() = " + i.hasNext());;

        System.out.println("i.next() = " + i.next());
        System.out.println("i.hasNext() = " + i.hasNext());;

        System.out.println("i.next() = " + i.next());
        System.out.println("i.hasNext() = " + i.hasNext());;
        // this will give error
        System.out.println("i.next() = " + i.next());
        System.out.println("i.hasNext() = " + i.hasNext());;*/



        while (i.hasNext()){
            System.out.println(i.next());
        }


        integerHashSet.add(99);
        integerHashSet.add(88);
        integerHashSet.add(0);
        integerHashSet.add(55);
        System.out.println(integerHashSet);


    }

    public void printSetsIntegerElement(){

    }

}
