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
        gc3.printSpeed();
    }
}
