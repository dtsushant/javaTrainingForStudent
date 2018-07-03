package oops.inheritence;

public class Cycle {

    protected double pedalPerSec=0.0;
    //private double speed = 0.0;

    public Cycle(){

    }

    public Cycle(double pedalPerSec){
        this.pedalPerSec = pedalPerSec;
    }


    public double speed(){
        return 5 * pedalPerSec;
       // return this.speed;
    }

    public void prettyPrint(){
        System.out.printf("\nthe speed of the cycle is %f KM / hr. \n",this.speed());
    }

    public void setPedalPerSec(double pedalPerSec)
    {
        this.pedalPerSec = pedalPerSec;
    }

    public double braking(){
        double speed = speed();
        if(speed>0)
            return speed/10;
        else
            return 0;
    }

    public void brakingTime(){
        System.out.printf("\nthe cycle will come to rest in %f\n",braking());
    }


}
