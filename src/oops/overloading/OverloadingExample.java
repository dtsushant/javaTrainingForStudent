package oops.overloading;

public class OverloadingExample {
    String s;
    String s2;

    static int i = 8;

    public OverloadingExample(){
        s="someghing";
        s2="nothing";
        System.out.println("now constructing a class");
    }

    public OverloadingExample(String s, String s1){
        this.s=s;
        this.s2=s1;
        System.out.println("constructing class through parameterized String constructor");
    }

    public OverloadingExample(Integer i , Integer i2){
        System.out.println("constructing class through parameterized integer constructor");

    }

    public int add(int a, int b){
        System.out.println("calling me");
        return a + b;

    }

    public int add(int a, int b, int c ){
        return add(add(a , b) , c);
    }




}
