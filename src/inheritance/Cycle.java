package inheritance;

public class Cycle {
    public double pedalPerSec=0;

    public Cycle(){

    }

    public Cycle(double pedalPerSec){
        this.pedalPerSec= pedalPerSec;
    }

    public double getSpeed(){
        return (10 * pedalPerSec*60)/1000;
    }

    public void printSpeed(){
        System.out.printf("\nThe Cycle is currently at the speed of %f KM/hr",getSpeed());
    }
}
