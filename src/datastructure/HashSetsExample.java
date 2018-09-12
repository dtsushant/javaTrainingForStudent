package datastructure;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetsExample {
    public static void main(String args[]){
        HashSet<Integer> integerHashSet = new HashSet<>();
        HashSet<String> stringHashSet = new HashSet<>();

        integerHashSet.add(100);
        integerHashSet.add(100);
        integerHashSet.add(200);
        integerHashSet.add(300);
        integerHashSet.add(400);
        integerHashSet.add(200);

        System.out.println(integerHashSet);

        Iterator i = integerHashSet.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        stringHashSet.add("one");
        stringHashSet.add("two");
        stringHashSet.add("one");
        stringHashSet.add("two");
        stringHashSet.add("three");

        System.out.println(stringHashSet);

       Iterator si = stringHashSet.iterator();
        System.out.println(si.next());
        System.out.println(si.next());
        System.out.println(si.next());
    }
}
