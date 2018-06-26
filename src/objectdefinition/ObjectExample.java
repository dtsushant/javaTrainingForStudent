package objectdefinition;

public class ObjectExample {

    int a = 10;
    int b;

    public static void main(String args[]){
        ObjectExample o = new ObjectExample();
        o.a = 100;
        o.b = 15;

        System.out.println(o.a);
        System.out.println(o.b);

        ObjectExample o1 = new ObjectExample();
        System.out.println(o1.a);
        
        System.out.println(o1.b);
        
        o1.b = o.a + o.b;
        System.out.println("o1.b = " + o1.b);

        ExternalClassExample ecx = new ExternalClassExample();
        ecx.add2And2();
        ecx.add(1,2);

        ecx.doSometing("add",4,5);
        //following case would be invalid
        //ecx.doSometing(5,8,"minus");

        ecx.doSometing("minus",4,5);
        ecx.doSometing("mul",4,5);







    }
}
