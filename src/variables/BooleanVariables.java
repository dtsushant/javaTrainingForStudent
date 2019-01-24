package variables;

public class BooleanVariables {

    public static void main(String args[]){
        boolean a,b;

        a = true;
        b = false;

        System.out.println(a);

        System.out.println(b);

        int i1, i2, i3;


        i1 = 100;
        i2 = 20;

        boolean b1 = i1 > i2;
        System.out.println("i1 > i2 here b1 is ="+b1);

        b1 = i1 == i2;

        System.out.println("i1 is equal to i2 here b1 is ="+b1);

        b1 = (i1> i2) && (i2+80 == i1);

        System.out.println("(i1> i2) && (i2+80 == i1) here b1 is  "+ b1);


        //classwork for today
        // create a class to get boolean value
        // declare two boolean variable bool1 and bool2
        // create 3 integer  a , b , c
        // assign value to a , b and c assign lowest value to b
        // compare if a is greater than b
        // compare if a is greater than b and also greater than c
        // add 100 to b and see if b is greater than a or c



    }
}
