package iteration;

public class BreakAndContinueExample {

    public static void main(String args[]){


        for(int j = 10 ; j > 0; j ++){
            if(j==100)
                break;

            System.out.print(j+ " ");
        }

        System.out.println();

        for(int k = 20; k >= 0;k--){
            if(k%5==0)
                continue;

            System.out.print(k+" ");
        }

        // print multiply of all number from 50 - 0 divisible by 3 using continue;
    }
}
