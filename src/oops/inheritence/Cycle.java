package oops.inheritence;

public class Cycle {

    protected double pedalPerSec=0.0;
    private double speed = 0.0;

    public Cycle(){

    }

    public Cycle(double pedalPerSec){
        this.pedalPerSec = pedalPerSec;
    }


    public double speed(){
        this.speed = 5 * pedalPerSec;
        return this.speed;
    }

    public void prettyPrint(){
        System.out.printf("\nthe speed of the cycle is %f KM / hr. \n",this.speed());
    }

    public void setPedalPerSec(double pedalPerSec)
    {
        this.pedalPerSec = pedalPerSec;
    }


}
