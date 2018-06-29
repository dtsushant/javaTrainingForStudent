package oops.overloading;

public class OverloadingMain {
    public static void main(String args[]){
        OverloadingExample o = new OverloadingExample();
        OverloadingExample o1 = new OverloadingExample("s1","s2");
        OverloadingExample o2 = new OverloadingExample(2,2);
        Integer i1, i2;
        i1 = 5;
        i2 = 7;
        OverloadingExample o3 = new OverloadingExample(i1,i2);
        System.out.println(o1.i);

        o1.i = 188;



        OverloadingExample.i=9;

        System.out.println(o1.i);

        System.out.println(o.i);

        System.out.println(o.s);

        System.out.println(o.s2);

        System.out.println(o1.s);
        System.out.println(o1.s2);

        System.out.println(o1.add(8,9,10));


    }
}
