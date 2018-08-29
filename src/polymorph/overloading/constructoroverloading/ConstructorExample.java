package polymorph.overloading.constructoroverloading;

public class ConstructorExample {

    public static void main(String args[]){
        A a = new A();
        System.out.println(a.sum());
        a.a = 12;
        a.b = 32;
        System.out.println(a.sum());

        B b = new B(35,97);
        System.out.println(b.sum());

        C c1 = new C();
        System.out.println(c1.sum());
        c1.a=23;
        c1.b = 45;
        int intVal = c1.sum();
        System.out.println(intVal);

        C c2 = new C(54,67);
        System.out.println(c2.sum());
    }
}
