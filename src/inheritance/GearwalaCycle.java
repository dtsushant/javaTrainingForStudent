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
        double speed = 0;
        switch (gear){
            case 1:
                speed = (30 * pedalPerSec*60)/1000;
                break;
            case 2:
                speed = (20 * pedalPerSec*60)/1000;
                break;
            case 3:
                speed = super.getSpeed();
                break;
            case 4:
                speed = (8 * pedalPerSec*60)/1000;
                break;
            case 5:
                speed = (5 * pedalPerSec*60)/1000;
                break;
            default:
                speed = super.getSpeed();
        }

        return speed;


    }



}