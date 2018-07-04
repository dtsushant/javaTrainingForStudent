package oops.abstraction;

public class MultiplyOperation implements Operation {
    int a,  b;

    public MultiplyOperation(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double operate() {
        return this.a*this.b;
    }

    @Override
    public String operated() {
        return "Multiplication";
    }
}
