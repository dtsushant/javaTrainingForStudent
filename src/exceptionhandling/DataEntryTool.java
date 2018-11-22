package exceptionhandling;

import java.util.Scanner;

public class DataEntryTool {

    public static Integer nextInt(){
        boolean keepOn = true;
        Integer returnInt=0;

        while (keepOn){
            try{
                Scanner scanner = new Scanner(System.in);
                returnInt = scanner.nextInt();
                keepOn = false;


            }catch (Exception ex){
                System.out.println("The value you've entered is not an Integer, please provide a valid Integer:-");
            }
        }
        return  returnInt;
    }


    public static Double nextDouble(){
        boolean keepOn = true;
        Double returnDouble=0.0;

        while (keepOn){
            try{
                Scanner scanner = new Scanner(System.in);
                returnDouble = scanner.nextDouble();
                keepOn = false;


            }catch (Exception ex){
                System.out.println("The value you've entered is not an float value, please provide a valid float value:-");
            }
        }
        return  returnDouble;
    }

    public static Integer nextIntInRange(Integer minRange, Integer maxRange){
        Integer returnInt = 0;
        while (true) {
            try {
                returnInt = nextInt();
                if (returnInt < minRange || returnInt > maxRange) {
                    throw new NumberNotInRangeException(minRange, maxRange, returnInt);
                }
                break;
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }

        return returnInt;
    }
}
