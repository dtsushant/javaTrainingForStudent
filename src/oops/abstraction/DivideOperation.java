package oops.abstraction;

public class DivideOperation implements Operation {

    int a,  b;

    public DivideOperation(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double operate() {
        return this.a/this.b;
    }

    @Override
    public String operated() {
        return "Division";
    }
}
