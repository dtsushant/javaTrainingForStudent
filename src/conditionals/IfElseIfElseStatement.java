package conditionals;

public class IfElseIfElseStatement {

    public static void main(String args[]){
        Double math, science, english, nepali, health;
        math = 80.0;
        science = 50.4;
        english = 80.0;
        nepali = 55.8;
        health = 70.0;

        if(math>40 && science > 40 && english >40 && nepali > 40 && health >40){

            double total = math+ science+ english+ nepali+ health;
            double percentage = total/5;
            if(percentage >40 && percentage < 50){
                System.out.println("pass in 3rd division");
            }else if(percentage>50 && percentage <60){
                System.out.println("pass in 2nd division");
            }else if(percentage>60 && percentage < 80)
                System.out.println("pass in 1st division");
            else
                System.out.println("passed with distinction");


        }else {
            System.out.println("fail");
        }



        /*
            classwork
            declare 3 integer
            assing value to all 3
            show them in descending order i.e highes to lowest

            eg
            say a = 67 b = 88 c = 17
            then it must say
            b is the greatest no. and a is second greatest no. and finally c is lowest no.
         */
    }
}
