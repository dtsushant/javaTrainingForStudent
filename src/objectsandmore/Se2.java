package objectsandmore;

public class Se2 {

    public static void main(String args[]){
        System.out.println("j="+StaticMethodExample.j);
        StaticMethodExample sme = new StaticMethodExample();
        System.out.println("i="+sme.i);
        Se1.test();
        System.out.println("j="+StaticMethodExample.j);
        System.out.println("i="+sme.i);
    }
}
