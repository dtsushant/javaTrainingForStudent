package objects;

public class MethodMainImplementation {

    public static void main(String args[]){
        MethodExample me = new MethodExample();

        me.printSomething();

        Double mul = me.multiply();

        System.out.println(mul);

        me.one = 90;
        me.two = 100;

        String beauMul = me.returnBeautifiedResult();
        System.out.println(beauMul);

        MethodExample me2 = new MethodExample();
        me2.one =9;
        me2.two = 4;

        Double mul2 = me2.multiply();

        String beauMul2 = me2.returnBeautifiedResult();

        System.out.println(mul2);

        System.out.println(beauMul2);

    }
}
