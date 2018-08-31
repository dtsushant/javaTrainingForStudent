package inheritance;

import java.util.Scanner;

public class CycleProperty {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the no. of pedals :-");
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

    }
}
