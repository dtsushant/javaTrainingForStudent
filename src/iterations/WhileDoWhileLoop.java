package iterations;

public class WhileDoWhileLoop {

    public static void main(String args[]){

        /*
            while(condition){
                execute body
            }
         */

        int i =0;

        while(i<20){
            System.out.print(++i +" ");

        }

        /*
               do{
                execute body
               }while(condition)
         */


        int j = 100;
        System.out.println();
        do{
            System.out.println(j);
        }while (j<20);
    }
}
