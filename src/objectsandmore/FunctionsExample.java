package objectsandmore;

public class FunctionsExample {

    public static void main(String args[]){
        ExternalClass ec = new ExternalClass();
        ec.printSomething();
        int number2 = 40;
        ec.sum(10,number2);

        System.out.println(ec.add(40,number2));

        int a = ec.add(5,8);
        System.out.println(a);

        System.out.println(ec.reverse("abcd"));
        System.out.println(ec.reverse("dog"));


    }
}


