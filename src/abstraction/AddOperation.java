package abstraction;

public class AddOperation implements ArithmeticOperation {

    public double operate(double i, double j){
        return i + j;
    }

    public String operation(){
        return "+";
    }
}
