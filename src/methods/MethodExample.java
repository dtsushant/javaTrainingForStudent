package methods;

import java.util.Scanner;

public class MethodExample {

    public void sum(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter an Integer Value:-");
        int a = inp.nextInt();

        System.out.println("Please enter another Integer Value:-");
        int b = inp.nextInt();

        int sum = a + b;
        System.out.printf(" the sum of two integer is %d + %d = %d \n",a,b,sum );
    }

    public void add(int a , int b ){
        int sum = a + b;
        System.out.printf(" the sum of two integer is %d + %d = %d \n",a,b,sum );

    }
}
