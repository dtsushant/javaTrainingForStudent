package datastructure;

import model.Pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String args[]){
        HashMap<String, String> map1 = new HashMap<>();

        map1.put("name","Brownie");
        map1.put("color","Black");
        map1.put("type","bird");
        map1.put("age","Two");
        map1.put("name","Blackie");

        System.out.println(map1);

        System.out.println(map1.get("name"));
        System.out.println(map1.get("color"));

        HashMap<Integer,Integer> map2 = new HashMap<>();
        map2.put(1,100);

        map2.put(3,400);

        System.out.println(map2);

        System.out.println(map1.keySet());

        for(String a : map1.keySet()){
            System.out.printf("the value of key %s is = %s\n",a,map1.get(a));
        }

        Iterator<String> stringIterator = map1.keySet().iterator();

        while (stringIterator.hasNext()){
            String key = stringIterator.next();
            System.out.printf("the value of key %s is = %s\n",key,map1.get(key));

        }

        HashMap<String,ArrayList<Pets>> countryOfPets = new HashMap<>();

    }
}
