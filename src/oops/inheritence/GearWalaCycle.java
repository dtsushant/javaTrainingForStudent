package oops.inheritence;


public class GearWalaCycle extends Cycle {

    private int gear = 3;

    private boolean discBrakeOption = false;

    public GearWalaCycle(){
        super();
    }

    public GearWalaCycle(double pedalPerSec){
        super(pedalPerSec);
    }

    public GearWalaCycle(double pedalPerSec, int gear){
        super(pedalPerSec);
        setGear(gear);
    }

    public void gearInformation(){
        System.out.println("Supports upto 5th gear from 1st");
    }

    public double speed(){
        double speed = 0.0;
        switch (this.gear){
            case 1:
                speed = 10 * this.pedalPerSec;
                break;
            case 2:
                speed = 8 * this.pedalPerSec;
                break;
            case 3:
                speed = super.speed();
                break;
            case 4:
                speed = 4 * pedalPerSec;
                break;
            case 5:
                speed= 3 * pedalPerSec;
                break;
            default:
                speed = super.speed();

        }
        return speed;
    }

    public void setGear(int gear){
        if(gear>5 || gear < 1)
            this.gear = 3;
        this.gear = gear;
    }




}
