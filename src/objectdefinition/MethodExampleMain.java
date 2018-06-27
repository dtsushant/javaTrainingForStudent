package objectdefinition;


import objectdefinition.methods.MethodExample;

import java.util.Scanner;

public class MethodExampleMain {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        MethodExample m = new MethodExample();
        int a = m.add(8, 9);
        System.out.println(a);

        System.out.println(m.add(99,99));

        System.out.println("Enter a number between 1 and 7");
        int d = scan.nextInt();

        String dayOfWeek = m.dayOfTheWeek(d);

        System.out.println( "the day of the week is :-"+ dayOfWeek);

        System.out.println("the statement number "+ d  + " is even is "+ m.isEven(d));

        /*if(m.add(8,9)){
            // this doesnt work because the medthod doesn't return boolean
        }*/

        if(m.isEven(d)){
            System.out.printf("\n the number %d is even \n",d);
        }else{
            System.out.printf("\n the number %d is odd \n",d);
        }


        ExternalClassExample e = m.returnExternalClassExample();

        e.add2And2();


    }
}
