package abstraction.abstractclass;

public abstract class Shapes {

    public abstract double perimeter();

    public abstract double  area();

    public void printInformation(){
        String info = String.format(" The perimeter of %s is %f and area is %f ",shapeType(),perimeter(),area());
        System.out.println(info);
    }

    public abstract String shapeType();
}
