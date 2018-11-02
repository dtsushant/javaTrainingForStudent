package encapsulation.inner;

public class A {

    private int a ;
    protected int b;
    public int c;
    int d;

    void testADefault(){
        System.out.println("hi this is test");
        testAPrivate();
    }

    public void testAPublic(){
        System.out.println("hi this method is public");
    }

    protected void testAProtected(){
        System.out.println("his this method is protected");
    }

    private void testAPrivate(){
        System.out.println("Hi this method is private");
    }
}
