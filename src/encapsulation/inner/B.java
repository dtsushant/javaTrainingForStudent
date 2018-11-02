package encapsulation.inner;

public class B {

    public void testB(){
        A a = new A();
        a.testADefault();
        a.testAPublic();
        a.testAProtected();

        //a.a = 900;
        a.b = 99;
        a.d = 199;
    }
}
