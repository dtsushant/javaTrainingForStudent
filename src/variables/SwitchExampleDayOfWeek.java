package variables;

import java.util.Scanner;

public class SwitchExampleDayOfWeek {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day of the week:-");
        int d = scan.nextInt();


        String day;

        switch(d){
            case 1:
                day="Sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            case 7:
                day="Saturday";
                break;
            default:
                day="invalid";
        }

        System.out.println("day is = " + day);
    }
}
