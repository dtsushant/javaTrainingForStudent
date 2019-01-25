package conditionals;

public class IfStatements {

    public static void main(String args[]){

        /*
            syntax of if statement
            if(accept boolean variable ){
                if boolean statement is true code enters here
            }
         */

        int b = 100;

        boolean bool = b !=100;

        if(bool)
        {
            System.out.println("b is not equal to 100");
        }

        bool = b > 100;

        if(bool){
            System.out.println("b is greater than 100");
        }

        bool = b == 100;

        if(bool){
            System.out.println("b is equal to 100");
        }


        int a = 20;

        if(b==a){
            System.out.println("b is equal to a");
        }

        if(b > a){
            System.out.println("b is greater than a");
        }



    }
}
