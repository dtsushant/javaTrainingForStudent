package objects;

public class StaticMethod {

    int a = 10;
    static int b = 100;

    String  s = "Twenty";
    static String s1 = "Twenty one";

    public static void doSomething(){

        //cant access a because it is non static
        //System.out.println(a);

        // can access a because it is static
        System.out.println(b);
        b=20;
    }

    public void againDoSomething(){
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String args[]){
       //cant access non static method
        // againDoSomething();
        System.out.println(b);
        doSomething();

        StaticMethod sm = new StaticMethod();
        sm.againDoSomething();
        System.out.println("Printing value of a in object sm");
        System.out.println(sm.a);
        sm.a= 90;
        System.out.println("Printing value of a in object sm after reassigning it");

        System.out.println(sm.a);
        System.out.println("Printing value of b in object sm");

        System.out.println(sm.b);
        sm.b = 109;
        System.out.println("Printing value of b in object sm after reassigning");

        System.out.println(sm.b);


        StaticMethod sm2 = new StaticMethod();
        System.out.println("Printing value of a in object sm2");

        System.out.println(sm2.a);
        System.out.println("Printing value of b in object sm2");

        System.out.println(sm2.b);



    }



}
