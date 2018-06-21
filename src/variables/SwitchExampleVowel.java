package variables;

import java.util.Scanner;

public class SwitchExampleVowel {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an alphabet:-");
        String alpha = scan.next();


        switch(alpha){
            case "a":

            case "e":

            case "i":

            case "o":

            case "u":
                System.out.println(alpha +"is a vowel");
                break;
            default:
                System.out.println(alpha + "is a consonant");
        }
    }
}
