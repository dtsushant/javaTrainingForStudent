package abstraction;

public class MultiplyOperation implements ArithmeticOperation {
    @Override
    public double operate(double a, double b) {
        return a * b;
    }

    @Override
    public String operation() {
        return "*";
    }
}
