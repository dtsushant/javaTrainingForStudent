package conditionals;

import java.util.Scanner;

public class SwitchVowelsConsonant {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an alphabet:-");

        String alpha = scan.next();

        switch (alpha){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("The value u've entered is a vowel");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println("You've entered a consonant");
                break;

                default:
                    System.out.println("invalid");
        }

        /*
            classwork:-
            Create a switch example that shows integer value of the week when string value is passed.

            Provide a traffic light program with switch i.e. red is stop, green is go yellow is get ready to stop or go etc.


         */
    }
}
