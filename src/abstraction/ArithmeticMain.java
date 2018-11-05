package abstraction;

import java.util.Scanner;

public class ArithmeticMain {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what u want to do :-");
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");

        int option = scanner.nextInt();

        System.out.println("Enter a number :- ");
        double a = scanner.nextDouble();

        System.out.println("enter another noumber: - ");
        double b = scanner.nextDouble();

        ArithmeticOperation ao = null;
        switch (option){
            case 1:
                ao = new AddOperation();
                break;
            case 2:
                ao = new SubtractOperation();
                break;
            case 3:
                ao = new MultiplyOperation();
                break;
            case 4:
                ao = new DivideOperation();
                break;
                default:
                    System.out.println("invalid option ");
        }

        if(ao!=null){
            double value = ao.operate(a,b);
            String operation = ao.operation();

            System.out.printf("the value of %f %s %f is %f",a,operation,b,value);
        }
    }
}
