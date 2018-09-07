package abstraction.abstractclass;

public class Circle extends Shapes {
    private double radius;

    public Circle(double r){
        radius = r;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String shapeType() {
        return "Circle";
    }
}
