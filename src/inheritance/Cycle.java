package inheritance;

public class Cycle {
    Double pedalPerSec;

    public Cycle(){
        this.pedalPerSec =0.0;
    }

    public Cycle(double pedalPerSec){
        this.pedalPerSec = pedalPerSec;
    }

    public Double getSpeed(){
        return this.pedalPerSec * 5;
    }

    public String maker(){
        return " Hero";
    }

    public void printSpeed(){
        String msg = String.format("%s cycle is currently moving at %f KM/Hr",maker(),getSpeed());
        System.out.println(msg);
    }

}
