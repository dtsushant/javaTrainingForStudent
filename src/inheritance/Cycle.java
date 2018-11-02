package inheritance;

public class Cycle {
    public Double pedalPerSec;

    public Cycle(){
        this.pedalPerSec =0.0;
    }

    public Cycle(double pedalPerSec){
        this.pedalPerSec = pedalPerSec;
    }

    public Double getSpeed(){
        return this.pedalPerSec * 5;
    }

    protected String maker(){
        return " Hero";
    }

    public final void printSpeed(){
        String msg = getMessage();
        System.out.println(msg);
    }

    private String getMessage(){
        return String.format("%s cycle is currently moving at %f KM/Hr",maker(),getSpeed());
    }

}
