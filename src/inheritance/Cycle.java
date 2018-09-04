package inheritance;

public class Cycle {
    public double pedalPerSec=0;
    private String cycleName= "Budo";

    public Cycle(){

    }

    public Cycle(double pedalPerSec){
        this.pedalPerSec= pedalPerSec;
    }

    public Cycle(double pedalPerSec,String cycleName){
        this.pedalPerSec= pedalPerSec;
        this.cycleName=cycleName;
    }

    public double getSpeed(){
        return (10 * pedalPerSec*60)/1000;
    }

    public void setCycleName(String cycleName){
        this.cycleName= cycleName;
    }

    public void printSpeed(){
        double speed = getSpeed();
        if (speed==0) {
            System.out.printf("\n%s is in rest",getCycleName());
        }
        else{
            System.out.printf("\n%s is currently at the speed of %f KM/hr",getCycleName(),speed);
        }
    }

    protected String getCycleName(){
        return cycleName;
    }
}
