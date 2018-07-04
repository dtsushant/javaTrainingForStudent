package oops.abstraction;

public class SubtractOperation implements Operation{
    int a,  b;

    public SubtractOperation(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double operate() {
        return this.a - this.b;
    }

    @Override
    public String operated() {
        return "Subtraction";
    }
}
