package oops.abstraction;

import java.util.Scanner;

public class OperationMainClass {

    public static void main(String args[]){


        System.out.println("What do you want to do Enter an option below?");
        System.out.println("Enter +");
        System.out.println("Enter -");
        System.out.println("Enter *");
        System.out.println("Enter /");

        Scanner scan = new Scanner(System.in);
        String option = scan.next();

        System.out.println("enter two numbers:-");
        System.out.println("First Number:-");
        int a = scan.nextInt();
        System.out.println("Second Number:-");
        int b = scan.nextInt();

        Operation o = null;

        switch (option){
            case "+":
                o = new AddOperation(a,b);
                break;

            case "-":
                o = new SubtractOperation(a,b);
                break;
            case "*":
                o = new MultiplyOperation(a,b);
                break;
            case "/":
                o = new DivideOperation(a,b);
                break;
                default:
                    System.out.println("invalid input");
        }

        if(o!=null){
            System.out.printf("the value for %d %s by %d is %f",a,o.operated(),b,o.operate());
        }
    }

}
