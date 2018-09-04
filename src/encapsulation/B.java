package encapsulation;

public class B {
    public void test(){
        A a  =new A();
        a.printSomethin();
        a.defaultDefiner();
        a.protectedDefiner();
    }

    protected void protectedDefinerInB(){
        System.out.println("hello hello");
    }
}
