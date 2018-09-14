package dataentry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntryTool {

    public int nextInt(){
        int intVal = 0;
        boolean bool = true;

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

    public String next(){
        return new Scanner(System.in).next();
    }


    public double nextDouble(){
        double val = 0;
        boolean bool = true;

        do{
            try{
                Scanner scanner = new Scanner(System.in);
                val = scanner.nextDouble();
                bool = false;
            }catch (InputMismatchException ex){
                System.out.println("the value you provided is not an double please provide a valid integer");
            }

        }while (bool);

        return val;
    }

    public String getGenderWithThrow() throws Exception{
        String g = "";
        Scanner scanner =new Scanner(System.in);
        g = scanner.next();

        if(!g.toLowerCase().equals("male") && !g.toLowerCase().equals("female")){
            throw new Exception("Not a valid gender");
        }

        return g;
    }

    public String getGender(){
        String g = "";

        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                g = scanner.next();

                if (!g.toLowerCase().equals("male") && !g.toLowerCase().equals("female")) {

                    throw new Exception("Not a valid gender");
                } else {
                    break;
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }

        return g;
    }

    public Integer getIntegerInRangeWithThrow(int minRange, int maxRange) throws NumberNotInRangeException{
        int i = nextInt();

        if(i< minRange || i > maxRange){
            throw new NumberNotInRangeException(minRange,maxRange,i);
        }

        return i;
    }

    public Integer getIntegerInRange(int minRange,int maxRange){
        int i = nextInt();
        while(true) {
            try {
                if (i < minRange || i > maxRange) {
                    throw new NumberNotInRangeException(minRange, maxRange, i);
                }
                break;
            } catch (NumberNotInRangeException ex) {
                System.out.println(ex.toString());
            }
        }
        return i;
    }
}
