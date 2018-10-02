package variables;

public class BooleanExample {
    public static void main(String args[]){
        boolean b1;
        b1 = true;
        System.out.println(b1);
        b1 = false;
        System.out.println(b1);

        boolean operation1 = 100>200;
        System.out.println("the statement 100> 200 is ="+operation1);

        int a = 20;
        int b = 20;
        int c = 21;
        int d = 19;
        System.out.println("the value of a is 20 and b is 20 and c is 21 and d is 19");

        boolean operation2 = a == b;

        System.out.println("the statement a == b is "+ operation2);

        // % is an operator used of modulo division

        boolean operation3 = a % 2 == 0;

        System.out.println(" the statement a is an even no is "+ operation3);

        boolean operation4 = a != b;
        System.out.println("the statement a != b is "+operation4);

        boolean operation5 = a > d;
        System.out.println("the statement a > d is "+ operation5);

        boolean operation6 = (c < d);
        System.out.println("the statement c < d is "+ operation6);

        boolean operation7 = (c > b && c % 2 == 0);

        System.out.println(" the statement c is greater than b and c is even no. is "+ operation7);


        boolean operation8 = (d%2==0 || d<a);

        System.out.println("the statment d is even or d less than a is "+ operation8);

        boolean operation9,operation10,operation11, operation12;

        System.out.println("the statment c is divisible by 3 and c is greater than a but is not divisible by 9 is ");

        System.out.println("the statment a is equal to b and  is greater than d  ");

        System.out.println("the statment (a is divisible by 5 or a is odd) and (b is greater than c )");

        System.out.println("the statment (c is greatest of all) and ( d is smallest of all )");



    }
}
