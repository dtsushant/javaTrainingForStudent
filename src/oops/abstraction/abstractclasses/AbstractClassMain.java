package oops.abstraction.abstractclasses;

public class AbstractClassMain {

    public static void main(String args[]){

        Vehicle v = null;

        String s = "bike";
        if(s.equals("car")){
            v= new Car(88);
        }else if(s.equals("bike"))
            v = new Bike(60);

        v.printWheel();
        System.out.println(v.getSpeed());

        v.applyBrakes(20);

        System.out.println(v.getSpeed());

    }
}
