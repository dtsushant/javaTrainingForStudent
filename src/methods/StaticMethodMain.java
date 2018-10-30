package methods;

import java.util.Scanner;

public class StaticMethodMain {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String sulto = sc.next();

        String ulto = StaticMethodExample.reverse(sulto);

        System.out.printf("%s ko ulto is %s\n",sulto,ulto);

        StaticMethodExample sme = new StaticMethodExample();
        if(sme.isPalindrome(sulto)){
            System.out.printf("%s is palindrome\n",sulto);
        }

        sme.printUltoAndCheckIfPalindrome();




    }
}
