package polymorphism;

public class MethodOverloading {

    public int add(int a , int b){
        System.out.println("calling method with 2 int parameter");
        return a + b;
    }

    public int add(int a, int b,int c){
        System.out.println("calling method with 3 int parameter");
        return add(add(a,b),c);
    }


    public int add(String a, String b){
        System.out.println("calling method with 2 string parameter");
        return add(Integer.parseInt(a) , Integer.parseInt(b));
    }




    public static void main(String args[]){
        MethodOverloading me = new MethodOverloading();

        System.out.println(me.add(7,8));

        System.out.println(me.add(8,9,10));

        System.out.println(me.add("888","444"));
    }


}
