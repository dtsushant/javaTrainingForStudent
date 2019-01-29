package iterations;

public class ForLoop {

    public static void main(String args[]){

        int i = 0;
        int j = i++;



        System.out.println("after i ++ j="+j);

        j = ++i;
        System.out.println("after ++i j = "+j);
        i = j++;
        System.out.println("after j++ i = "+i);
        i = ++j;
        System.out.println("after ++j i = "+i);

        System.out.println("finally j = "+j);

        /*
            for(initialization; condition; increment/decrement)
            {
                  --body
            }
         */
        for(int k = 0; k <=10 ; k++){
            System.out.println(k);
        }

        /*
            print all odd no. from 1 to 20;

            print all even no. form 20 to 0;
         */

    }
}
