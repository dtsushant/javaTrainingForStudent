package objectsandmore;

public class StaticMethodExample {
    int i = 10;
    static int j = 100;
    public void test(){
        int a = i;
        System.out.println("hello  this is a test");
    }
    public void anotherTest(){
        System.out.println("simply another test");
        test();
        something();
    }

    public static void something(){
        int a = j;
        System.out.println("this prints out something");
    }

}
