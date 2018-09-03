package inheritance;

import java.util.Scanner;

public class CycleProperty {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Please enter the no. of pedals :-");
        double pedals = scan.nextDouble();

        Cycle c1 = new Cycle();
        c1.printSpeed();
        c1.pedalPerSec = pedals;
        c1.printSpeed();

        System.out.println("\nPlease enter the no. of pedals :-");
        double pedals1 = scan.nextDouble();
        Cycle c2 = new Cycle(pedals1);
        c2.printSpeed();
        double speed = c2.getSpeed();
        System.out.println(speed);

        GearwalaCycle gc = new GearwalaCycle();
        gc.pedalPerSec = 17;
        gc.printSpeed();

        GearwalaCycle gc1 = new GearwalaCycle(22);
        gc1.printSpeed();*/

        System.out.println("\ninheritance overridding example");
        GearwalaCycle gc3 = new GearwalaCycle(15);
        gc3.gear = 5;
        gc3.printSpeed();

        Cycle c3 = new Cycle(15);
        c3.printSpeed();

        System.out.println("\nEnter Pedal per sec for gearwala cycle :-");
        double pedal = scan.nextDouble();


        System.out.println("Enter gear for :-");
        int gear = scan.nextInt();


        GearwalaCycle gc4 = new GearwalaCycle(pedal,gear);
        gc4.printSpeed();


    }
}
