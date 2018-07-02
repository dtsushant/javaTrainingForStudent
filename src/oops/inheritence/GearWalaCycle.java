package oops.inheritence;

import oops.inheritence.Cycle;

public class GearWalaCycle extends Cycle {

    public int gear;

    public GearWalaCycle(){
        super();
    }

    public GearWalaCycle(double pedalPerSec){
        super(pedalPerSec);
    }

    public void gearInformation(){
        System.out.println("Supports upto 5th gear from 1st");
    }


}
