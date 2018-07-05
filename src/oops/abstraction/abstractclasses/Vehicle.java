package oops.abstraction.abstractclasses;

public abstract class Vehicle {


    public Vehicle(double speed){
        this.speed = speed;
    }


    protected double speed;

    protected int wheel;


    protected abstract int wheel();

    public void applyBrakes(double decreaseSpeed){
        if(this.speed > 0 ) {
            double speed = this.speed - decreaseSpeed;
            this.speed = speed >0?speed:0;
        }
    }

    public void printWheel(){
        System.out.printf("\nthe vehicle has %d no. of wheel\n",this.wheel());
    }

    public double getSpeed(){
        return this.speed;
    }
}
