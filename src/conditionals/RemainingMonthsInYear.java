package conditionals;

import java.util.Scanner;

public class RemainingMonthsInYear {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide month value in integer");
        int i = sc.nextInt();


        switch (i){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("Feb");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("Aug");
            case 9:
                System.out.println("Sept");
            case 10:
                System.out.println("Oct");
            case 11:
                System.out.println("Nov");
            case 12:
                System.out.println("Dec");
                break;
                default:
                    System.out.println("invalid");

        }


    }
}
