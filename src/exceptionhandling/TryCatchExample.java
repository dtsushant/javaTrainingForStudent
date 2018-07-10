package exceptionhandling;

import java.util.Scanner;

public class TryCatchExample {

    public static void main(String args[]){

        int i = 1;

        int j = 1;
        int l =0;

        try {
            System.out.println("now dividing");
            int k = j / i;
            System.out.println("the value of k is "+k);
            Scanner scan = new Scanner(System.in);
            System.out.println("provide an integer");
            l = scan.nextInt();
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println("this is the end of the program");

        try{
            testThrowImplementagtion(true);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("you provided "+l);
    }

    public static void testThrowImplementagtion(boolean var) throws Exception{
        System.out.println("hello i am about to throw and exception");
        if(var)
            throw new Exception("THrowing exception for no reason");
    }
}
