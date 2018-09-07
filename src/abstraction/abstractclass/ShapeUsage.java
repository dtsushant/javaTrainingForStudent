package abstraction.abstractclass;

import java.util.Scanner;

public class ShapeUsage {

    public static void main(String args[]){
        System.out.println("Please enter a choice:-");
        System.out.println("1. Operation on Circle");
        System.out.println("2. Operation on Rectangle");
        System.out.println("3. Operatoin on Triangle");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        Shapes shape = null;


        switch (option){
            case 1:
                System.out.println("please enter the radius of the circle");

                shape= new Circle(scanner.nextDouble());
                break;
            case 2:
                System.out.println("Please enter the lenght of rectangle");
                double l = scanner.nextDouble();
                System.out.println("Please enter the breadth of rectangle");
                double b = scanner.nextDouble();
                shape = new Rectangle(l,b);
                break;
            case 3:
                System.out.println("please enter perpendicular of Triangle");
                double height = scanner.nextDouble();
                System.out.println("please enter base of Triangle");
                double base = scanner.nextDouble();
                shape= new RightAngledTriangle(base,height);
                break;
                default:
                    System.out.println("invalid");
        }

        if(shape!=null){
            shape.printFinal();
        }
    }
}
