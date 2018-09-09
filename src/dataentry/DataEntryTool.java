package dataentry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntryTool {

    public int nextInt(){
        int intVal = 0;
        boolean bool = true;
        System.out.println("Please provide an integer value:- ");

        do{
            try{
                Scanner scanner = new Scanner(System.in);
                intVal = scanner.nextInt();
                bool = false;
            }catch (InputMismatchException ex){
                System.out.println("the value you provided is not an integer please provide a valid integer");
            }

        }while (bool);

        return intVal;
    }
}
