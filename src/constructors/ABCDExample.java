package constructors;

public class ABCDExample {
    public static void main(String args[]){
        A a = new A();
        a.test();

        B b = new B(8,9);

        b.test();


        C c1 = new C();

        c1.test();
        System.out.println(c1.i);
        c1.i = 8888;
        c1.j = 98888;
        c1.test();

        C c2 = new C(88,99);

        c2.test();
        System.out.println(c2.i);

        D d1 = new D();
        d1.test();

        D d2 = new D(7,8);
        d2.test();

    }
}
