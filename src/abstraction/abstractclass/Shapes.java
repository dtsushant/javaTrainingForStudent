package abstraction.abstractclass;

public abstract class Shapes {

    public abstract double perimeter();

    public abstract double area();

    public abstract String shapeType();

    public void areaDefinition(){
        System.out.printf("\nthe area of %s is the total portion of the surface covered by it",shapeType());
    }

    public void perimiterDefiniont(){
        System.out.printf("\n the perimiter of %s is the total length of its border",shapeType());
    }

    public void printFinal(){
        System.out.printf("\n THe area of %s is %f and its perimeter is %f",shapeType(),area(),perimeter());
    }


}
