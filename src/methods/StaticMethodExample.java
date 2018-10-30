package methods;

import java.util.Scanner;

public class StaticMethodExample {

    public static String reverse(String str){
        String retStr="";
        for(int i =str.length()-1; i>=0;i--){
            retStr+=str.charAt(i);
        }
        return retStr;
    }

    public boolean isPalindrome(String str){
        boolean bool = false;
        if(str.equals(reverse(str))){
            bool = true;
        }
        return bool;
    }


    public void printUltoAndCheckIfPalindrome(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String sulto = sc.next();
        String ulto = reverse(sulto);
        System.out.printf("%s ko ulto is %s",sulto,ulto);

        if(isPalindrome(sulto)){
            System.out.println( "and the string is also palindrome");
        }else{
            System.out.println( "and the string is not palindrome");

        }
    }
}
