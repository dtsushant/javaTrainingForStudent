package abstraction.abstractclass;

public class RightAngledTriangle extends Shapes{

    private double base, height;

    public RightAngledTriangle(double b, double h){
        base = b;
        height = h;
    }


    @Override
    public double perimeter() {
        return base + height+ returnHypotenuse();
    }

    @Override
    public double area() {
        return 1/2f * height * base;
    }

    @Override
    public String shapeType() {
        return "Triangle";
    }

    public double returnHypotenuse(){
        return Math.sqrt(base*base + height* height);
    }
}
