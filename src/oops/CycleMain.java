package oops;

public class CycleMain {

    public static void main(String args[]){
        Cycle c = new Cycle();
        c.pedalPerSec = 5;
        System.out.println(c.speed());

        GearWalaCycle gc = new GearWalaCycle();
        gc.pedalPerSec = 10;
        gc.gear = 4;
        System.out.println(gc.speed());

        gc.gear = 3;
        System.out.println(gc.speed());

    }
}
