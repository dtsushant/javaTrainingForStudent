package oops;

public class GearWalaCycle extends Cycle {

    public int gear;

    public double speed(){
        double speed = 0;
        switch(gear){
            case 1:
                speed = 10 * pedalPerSec;
                break;

            case 2:
                speed = 8 * pedalPerSec;
                break;

            case 3:
                speed = super.speed();
                break;

            case 4:
                speed = 4 * pedalPerSec;
                break;

            case 5:
                speed = 3 * pedalPerSec;
                break;

                default:
                    speed= super.speed();
        }

        return speed;
    }
}
