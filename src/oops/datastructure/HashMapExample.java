package oops.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

    public static void main(String args[]){
        HashMap<String,String> hashMap = new HashMap<>();
        HashMap<Integer,String> hashMap1 = new HashMap<>();

        hashMap.put("name","ram");
        hashMap.put("age","100");
        hashMap.put("status","divorced");
        hashMap.put("work","retired");
        hashMap.put("name","Ram");

        System.out.println(hashMap);
        System.out.println(hashMap.get("name"));
        System.out.println(hashMap.get("age"));
        System.out.println(hashMap.get("status"));

        hashMap1.put(1,"one");
        hashMap1.put(2,"two");
        hashMap1.put(3,"three");
        hashMap1.put(4,"four");

        System.out.println(hashMap.keySet());
        System.out.println(hashMap1.keySet());

        Set<String> sKey = hashMap.keySet();
        Set<Integer> iKey = hashMap1.keySet();


        System.out.println("\n\nthe value for String hasmap");

        Iterator<String> s = sKey.iterator();

        while (s.hasNext()){
            String key = s.next();
            System.out.printf("\nthe value for key %s  is %s ",key,hashMap.get(key));
        }

        System.out.println("\n\nthe value for integer hasmap");


        Iterator<Integer> i = hashMap1.keySet().iterator();
        while (i.hasNext()){
            Integer key = i.next();
            System.out.printf("\nthe value for key %d  is %s ",key,hashMap1.get(key));
        }


        /*
            should contain the final result with information of 5 individuals


         */
        ArrayList<HashMap<String, String>> listOfPerson = new ArrayList<>();




    }
}
