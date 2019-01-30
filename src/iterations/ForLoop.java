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

        System.out.println("Printing all odd no. from 1 to 20");
        for(int k = 1;k<=20; k++){
            if(k%2==1)
                System.out.print(k+ " ");

        }

        System.out.println("\nPrinting all even no. from 20 to 1");
        for(int k = 20;k>=0; k--){
            if(k%2==0)
                System.out.print(k+ " ");
        }

        System.out.println("Mutiplication Table from 1 t0 10");
        for(int k = 1;k<=10; k++){
            System.out.println("Mutiplication Table for "+ k);
            for(int l = 1;l<=10; l++){
                System.out.printf("%d * %d = %d\n",k,l,k*l);
            }
        }
    }
}
