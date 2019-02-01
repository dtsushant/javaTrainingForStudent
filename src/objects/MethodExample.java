package objects;

public class MethodExample {

    public double one =0;
    public double two =0;

    public void printSomething(){
        System.out.println("Hi I am printing something");
    }

    public double multiply(){
        double multiple = one * two;
        return multiple;
    }

    public String returnBeautifiedResult(){
        String beautifiedMultiple = String.format("the multiple of %f * %f is %f", one, two, one*two);
        return beautifiedMultiple;
    }
}
