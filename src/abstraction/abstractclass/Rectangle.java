package abstraction.abstractclass;

public class Rectangle extends Shapes {

    private double l,b;

    public Rectangle(double l, double b){
        this.l= l;
        this.b = b;
    }
    @Override
    public double perimeter() {
        return 2*(l+b);
    }

    @Override
    public double area() {
        return l*b;
    }

    @Override
    public String shapeType() {
        return "Rectangle";
    }
}
