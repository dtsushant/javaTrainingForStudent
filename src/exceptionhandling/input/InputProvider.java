package exceptionhandling.input;

import exceptionhandling.customexception.IntegerNotInRangeException;

import java.util.Scanner;

public class InputProvider {

    public int nextInt(){
        int value = 0;
        try{
            Scanner scan = new Scanner(System.in);
            value = scan.nextInt();
        }catch (Exception e){
            System.out.println("the value you provided is not an integer please provide an integer");
            value = nextInt();
        }
        return value;
    }

    public String next(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double nextDouble(){
        double value = 0.0;
        try{
            Scanner scan = new Scanner(System.in);
            value = scan.nextDouble();
        }catch (Exception ex){
            System.out.println("the value you provided is not a double please provide decimal number:-");
            value = nextDouble();
        }
        return value;
    }

    public int nextIntInRange(int minRange, int maxRange){
        int value = 0;
        value = nextInt();
        try {
            if(value<minRange || value > maxRange){
                IntegerNotInRangeException inire = new IntegerNotInRangeException();
                inire.maxRange= maxRange;
                inire.minRange = minRange;
                inire.providedInput = value;
                throw inire;
            }
        }catch (IntegerNotInRangeException ex){
            System.out.println(ex.toString());
            value = nextIntInRange(minRange,maxRange);
        }
        return value;
    }
}
