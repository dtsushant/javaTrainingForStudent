package datastructure;

import java.util.HashSet;
import java.util.Iterator;

public class SetsExample {

    public static void main(String srt[]){
        HashSet<Integer> integerHashSet = new HashSet<>();
        HashSet<String> stringHashSet = new HashSet<>();

        integerHashSet.add(5);
        integerHashSet.add(61);
        integerHashSet.add(43);

        System.out.println(integerHashSet);

        integerHashSet.add(7);
        System.out.println(integerHashSet);

        stringHashSet.add("66");
        stringHashSet.add("cow");
        stringHashSet.add("milk");
        stringHashSet.add("cheese");
        stringHashSet.add("cheese");

        System.out.println(stringHashSet);

        System.out.println("printing all element of sets:-");
        for(Integer a : integerHashSet){
            System.out.println(a);
        }


        System.out.println("printing all element of string sets:-");
        for(String a: stringHashSet){
            System.out.println(a);
        }

        Iterator<Integer> i = integerHashSet.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }


        Iterator<String> s = stringHashSet.iterator();

        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
    }
}
