package objectexample;

import java.util.Scanner;

public class ObjectCreationExample {

    int a ;
    int b ;
    int c ;


    public static void main(String args[]){
        ObjectCreationExample oce = new ObjectCreationExample();
        oce.a = 10;
        oce.b = 20;
        oce.c = oce.a + oce.b;
        oce.printSomething();

        System.out.println(oce.c);

        ObjectCreationExample oce2 = new ObjectCreationExample();
        oce2.a = 40;
        oce2.b = 60;
        oce.c = oce2.a + oce2.b;
        System.out.println(oce2.c);
        System.out.println(oce.c);

        ExternalClass ec = new ExternalClass();
        ec.i =  33;
        ec.k = 21;
        ec.j = ec.i + ec.k;

        System.out.println(ec.j);
        ec.printSomething();

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter some stirng");
        String abc = scan.next();

        System.out.println("please enter an integer");
        int a = scan.nextInt();
        System.out.println("Please enter an integer");
        int b = scan.nextInt();

        System.out.println("the value of sum of a & b is "+ (a+b));


    }

    public void printSomething(){
        System.out.println("something from object creation exampler");
    }


}
