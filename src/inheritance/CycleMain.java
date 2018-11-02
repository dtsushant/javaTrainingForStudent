package inheritance;

public class CycleMain {

    public static void main(String args[]){
        Cycle c1 = new Cycle();
        c1.printSpeed();
        c1.pedalPerSec = 8.0;
        c1.printSpeed();

        Cycle c2 = new Cycle(5);
        c2.printSpeed();

        GearWalaCycle gc1 = new GearWalaCycle();
        gc1.printSpeed();
        gc1.pedalPerSec = 8.0;
        gc1.printSpeed();

        GearWalaCycle gc2 = new GearWalaCycle(5);
        gc2.printSpeed();

        GearWalaCycle gc3 = new GearWalaCycle(5,2);
        gc3.gear=7;
        gc3.printSpeed();

        Cycle gc4 = new GearWalaCycle();
        ((GearWalaCycle) gc4).gear= 4;
        gc4.pedalPerSec = 7.0;
        gc4.printSpeed();

    }
}
