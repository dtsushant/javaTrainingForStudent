package abstraction.abstractclass;

public class RightAngledTriangle extends  Shapes {

    private double base;
    private  double perpendicular;

    public RightAngledTriangle(double base, double perpendicular){
        this.base = base;
        this.perpendicular = perpendicular;
    }

    @Override
    public double perimeter() {
        return base + perpendicular + hypotenuse();
    }

    @Override
    public double area() {
        return 0.5 * base * perpendicular;
    }

    @Override
    public String shapeType() {
        return "Triangle";
    }

    public double hypotenuse(){
        return Math.sqrt(base*base + perpendicular* perpendicular);
    }


}
