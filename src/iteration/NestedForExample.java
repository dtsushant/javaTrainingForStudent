package iteration;

public class NestedForExample {
    public static void main(String args[]){

        for(int i = 1; i <= 10; i++){
            System.out.println("************** Multiplication table of "+i+"**************");
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d * %d = %d \n",i, j, i*j );
            }

        }

        //printing all prime no. within 1000

        for(int i = 2; i<=1000;i++){
            boolean check = true;
            for(int j = 2; j <= i/2; j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.print(i + " ");
        }
    }
}
