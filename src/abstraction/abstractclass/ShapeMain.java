package abstraction.abstractclass;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what u want to do :-");
        System.out.println("1. Get circle info");
        System.out.println("2. Get Triangle Info");
        System.out.println("3. Get Rectangle Info");

        int option = scanner.nextInt();

        Shapes shape = null;
        switch (option){
            case 1:
                System.out.println("enter Radius of Circle");
                double r = scanner.nextDouble();
                shape = new Circle(r);
                break;
            case 2:
                System.out.println("enter Base of triangle");
                double b = scanner.nextDouble();
                System.out.println("enter Height of triangle");
                double p = scanner.nextDouble();

                shape = new RightAngledTriangle(b,p);
                break;
            case 3:
                break;
                default:
                    System.out.println("invalid");
        }

        if(shape!=null){
            shape.printInformation();
        }
    }
}
