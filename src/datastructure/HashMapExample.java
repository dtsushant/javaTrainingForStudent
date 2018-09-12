package datastructure;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<String,Integer> map1 = new HashMap();
        map1.put("value1",111);
        map1.put("value2",3333);
        System.out.println(map1);
        map1.put("value1",222);
        System.out.println(map1);

        System.out.println(map1.get("value1"));
        System.out.println(map1.get("value2"));

        System.out.println(map1.keySet());

        HashMap<String,String> map3 = new HashMap<>();
        map3.put("name","Harihar");
        map3.put("age","twenty five");
        map3.put("occupation","farmer");

        Iterator<String> i = map3.keySet().iterator();

        while(i.hasNext()){
            String key = i.next();
            System.out.printf("\n the key %s has value %s",key, map3.get(key));
        }

        HashMap<Integer, ArrayList<Student>> map2 = new HashMap();



    }
}
