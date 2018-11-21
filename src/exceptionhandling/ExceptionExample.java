package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String args[]){

        Integer a;
        Integer b;

        try {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter an integer:-");
             a = scan.nextInt();
            System.out.println("Enter another integer:- ");
             b = scan.nextInt();
            int c = a / b;
            System.out.printf("the division of %d / %d = %d \n", a,b,c);
        }catch (Exception e){
            System.out.println(e.toString());
        }


        System.out.println("classification of exception :-");

        try {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter an integer:-");
            a = scan.nextInt();
            System.out.println("Enter another integer:- ");
            String someNumber = scan.next();
            b = Integer.parseInt(someNumber);
            int c = a / b;
            System.out.printf("the division of %d / %d = %d \n", a,b,c);
        }catch (InputMismatchException e){
            System.out.println(e.toString());
            System.out.println("Please provide a valid input ");
        }catch (ArithmeticException e){
            System.out.println(" number cannot be divided by Zero");
        }catch (Exception e){
            System.out.println(e.toString());
        }


        System.out.println("thank your for being good");
    }
}
