package methods;

import java.util.Scanner;

public class RevisionMain {

    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);

        RevisionClass rc = new RevisionClass();


        do{


            System.out.println("Please enter an integer:-");
            int num = sca.nextInt();

            boolean b = rc.isPrime(num);
            if (b) {
                System.out.printf("the number %d is prime\n", num);
            } else
                System.out.printf("the number %d is not a prime\n", num);

            System.out.println("enter an option");
            System.out.println("enter 1 for keep going or any other number to exit");
            int option = sca.nextInt();
            if(option!=1)
                break;

        }while (true);

        int a = rc.sum(5,9);

        System.out.println("the sum is "+a);
    }
}

