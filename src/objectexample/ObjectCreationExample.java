package objectexample;

public class ObjectCreationExample {

    int a ;
    int b ;
    int c ;


    public static void main(String args[]){
        ObjectCreationExample oce = new ObjectCreationExample();
        oce.a = 10;
        oce.b = 20;
        oce.c = oce.a + oce.b;
        oce.printSomething();

        System.out.println(oce.c);

        ObjectCreationExample oce2 = new ObjectCreationExample();
        oce2.a = 40;
        oce2.b = 60;
        oce.c = oce2.a + oce2.b;
        System.out.println(oce2.c);
        System.out.println(oce.c);

        ExternalClass ec = new ExternalClass();
        ec.i =  33;
        ec.k = 21;
        ec.j = ec.i + ec.k;

        System.out.println(ec.j);
        ec.printSomething();


    }

    public void printSomething(){
        System.out.println("something from object creation exampler");
    }


}
