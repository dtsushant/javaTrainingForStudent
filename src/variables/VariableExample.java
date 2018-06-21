package variables;

public class VariableExample {


    //Primitive datatype
    public static void main(String args[]){

        //Integer declaration
        int a;
        int b,c,d,e;
        int f = 0;

        a = 5;

        //uncommenting this line will give error as save variable within same body cannot be declared multiple times
        //int b = 10;

        b = 100 +9;

        //since c is an integer it will not accept any value but integer

        //these values will give error
        //c = "a";
        //c = 9.9;


        //initial value of c
        //will give error since c value is not assigned
        //System.out.println(c);
        c = a;

        System.out.println("the value of c = "+c);
        System.out.println("the value of a = "+a);

        c = a +10;

        System.out.println("the value of c ="+c);
        System.out.println("the value of a ="+a);

        //Float variable declariation

        float f1;
        float f2,f3;
        float f4 = 9.9f;

        //will give error since incompatible type integer will not accept float value
        //d = f4;

        //is valid but will append .0 to the end of the value
        f4 = a;
        System.out.println(f4);

        f2 = 88.0f/5.0f;
        System.out.println(f2);

        f2 = 88/5;
        System.out.println(f2);
        f3= 22.0f/7.0f;
        System.out.println(f3);


        //Double variable declaration
        double d1, d2;
        d1 = 9.8;
        d2 = 22.0/7.0;
        System.out.println(d2);



        //boolean variable declaration
        boolean b1, b2;

        b1 = true;
        b1 = false;

        //will not accept 0 or 1 like in other programming language like php, javascript
       // b1 = 0;

       // b1 = "true";


        d = 20;

        b2 = (d==20);

        System.out.println("the value of d is "+d);
        System.out.println("the statement d == 20 is "+b2);

        b2= (d>20);
        System.out.println("the statement d > 20 is "+b2);

        b2= (d>=20);
        System.out.println("the statement d >= 20 is "+b2);

        b2= (d<20);
        System.out.println("the statement d < 20 is "+b2);

        b2= (d<=100);
        System.out.println("the statement d < 100 is "+b2);


        b2= (d!=20);
        System.out.println("the statement d != 20 is "+b2);

        b2= (d!=2);
        System.out.println("the statement d != 2 is "+b2);

        b2 = b> a && a ==99;

        System.out.println("the statement  is "+b2);

        b2 = b >= a || a == 99 || b == 100 && b == 99;

        System.out.println("the statement  is "+b2);



        char c1, c2;

        c1 = 'c';
        //not allowed
        //c1='kjkj';
        //c1 = "d";





    }
}
