package inheritance;

public class GearWalaCycle extends Cycle {

    Integer gear;

    public GearWalaCycle(){
        super();
        this.gear = 3;
    }

    public GearWalaCycle(double pedalPerSec){
        super(pedalPerSec);
        this.gear=3;
    }

    public GearWalaCycle(double pedalPerSec, Integer gear){
        super(pedalPerSec);
        if(gear<1 || gear>5)
            gear =3;
        this.gear = gear;
    }

    public Double getSpeed(){
        double speed = 0.0;
        switch (gear){
            case 1:
                speed = pedalPerSec * 10;
                break;
            case 2:
                speed = pedalPerSec * 8;
                break;
            case 3:
                speed = super.getSpeed();
                break;
            case 4:
                speed = pedalPerSec * 4;
                break;
            case 5:
                speed = pedalPerSec * 5;
        }
        return speed;
    }

    public String maker(){
        return " Giant";
    }
}
