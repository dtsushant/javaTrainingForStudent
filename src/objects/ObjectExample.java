package objects;

public class ObjectExample {

    int a;
    String b;
    double c = 50.8;

    public void printProperty(){
        System.out.println("here the value of a is "+a);
        System.out.println("here the value of b is "+b);
        System.out.println("here the value of c is "+c);
    }

    public void add(){
        System.out.println("the sum of a and c is "+(a +c));
    }


}
