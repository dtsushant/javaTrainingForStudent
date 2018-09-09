package exceptionhandling;

import dataentry.DataEntryTool;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String args[]){
        //THIs is an error
        //String a = 100;

        String intval = "100";

        int intFromString = Integer.parseInt(intval);

        System.out.println(intFromString);

        String anotherVal = "sixtysix";


        /* this will give out error*/
        //int intFromString1 = Integer.parseInt(anotherVal);
       // System.out.println(intFromString1);
        try{

            int intFromString2 = Integer.parseInt(anotherVal);
            System.out.println(intFromString2);

        }catch (NumberFormatException ex){
            System.out.println("entering catch");
            System.out.println(ex.toString());
        }


        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Enter an integer:-");
            int i = scan.nextInt();


            System.out.println("Enter another integer:-");
            String j = scan.next();

            int k = Integer.parseInt(j);

            System.out.println(i/k);







        }catch (InputMismatchException ex){
            System.out.println("Needed to enter integer you entered something else");
            System.out.println(ex.toString());
        }catch (NumberFormatException ex){
            System.out.println("cannot convert to integer");
            System.out.println(ex.toString());

        }catch (Exception ex){
            System.out.println("got some exception");
            System.out.println(ex.toString());
        }


        DataEntryTool det = new DataEntryTool();
        int i = det.nextInt();
        System.out.println(i);
        System.out.println("end of the example");

    }
}
