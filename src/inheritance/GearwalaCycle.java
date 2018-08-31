package inheritance;

public class GearwalaCycle extends Cycle {

    int gear=3;

    public GearwalaCycle(){
        super();
    }

    public GearwalaCycle(double pedalPerSec){
        super(pedalPerSec);
    }

    public GearwalaCycle(double pedalPerSec,int gear){
        super(pedalPerSec);
        this.gear = gear;
    }


    public double getSpeed(){
        return  super.getSpeed()*2;
    }



}
