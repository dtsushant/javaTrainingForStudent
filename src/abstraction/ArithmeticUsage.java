package abstraction;

import java.util.Scanner;

public class ArithmeticUsage {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an option");
        System.out.println("1. for addition");
        System.out.println("2. for multiplicaiton");
        System.out.println("3. for division");
        System.out.println("4. for substraction");
        int option = scan.nextInt();

        System.out.println("Enter  first decimal value:-");

        double firstVal = scan.nextDouble();
        System.out.println("Enter Second Decimal value:-");

        double secondVal = scan.nextDouble();

        ArithmeticOperation operation =  null;

        switch (option){
            case 1:
                operation = new AddOperation();
                break;
            case 2:
                operation = new Multiplication();
                break;
            case 3:
                operation = new Division();
                break;
            case 4:
                operation = new Substraction();
                break;
            default:
                System.out.println("invalid Option ");


        }

        if(operation!=null) {
            double result = operation.operate(firstVal, secondVal);
            String operationType = operation.operation();

            System.out.printf("\nThe operation of %s  on %f and %f is eqal to %f",operationType,firstVal,secondVal,result);
        }




    }
}
