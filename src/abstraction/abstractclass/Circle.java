package abstraction.abstractclass;

public class Circle extends Shapes {
    private  double radius;
    private final double _PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2* _PI* radius;
    }

    @Override
    public double area() {
        return _PI*radius*radius;
    }

    @Override
    public String shapeType() {
        return "Circle";
    }
}
