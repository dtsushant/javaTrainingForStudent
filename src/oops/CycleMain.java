package oops;

import oops.inheritence.Cycle;
import oops.inheritence.GearWalaCycle;

public class CycleMain {

    public static void main(String args[]){
        Cycle c = new Cycle();
        c.setPedalPerSec(9);
        c.prettyPrint();

        Cycle c1 = new Cycle(5);
        c1.prettyPrint();


        GearWalaCycle gc = new GearWalaCycle(9.9);
        gc.prettyPrint();
        gc.gearInformation();

        Cycle c3 = new GearWalaCycle();
        //cannot access property not present in parent class
        //c3.gearInformation();






    }
}
