package objectsandmore;

public class ObjectExample {
    int i = 10;
    String a = "test";
    // this will give out error because we can do operation outside of class
    //System.out.println("this is error");
    public void test(){
        int c  = 2* i;
        System.out.println(c);
    }

    public void something(String str){
        System.out.println("this value is passed from main"+str);
    }

    public static void main(String args[]){
        ObjectExample ob = new ObjectExample();
        ObjectExample ob1 = new ObjectExample();

        System.out.println(ob.i);
        System.out.println(ob.a);
        ob.test();
        ob.something("value 1");

        ob1.i = 20;
        System.out.println(ob1.i);
        System.out.println(ob.i);
        ob1.test();
        ob1.something("one");
    }

    public void oddEven(String oddOrEven){

    }
}
