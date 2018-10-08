package iteration;

public class WhileLoop {
    public static void main(String args[]){

        int i = 0;
        while(i<10){
            i++;
            System.out.print(i + " ");

        }

        System.out.println();

        do{
            i++;
            System.out.println(i);
        }while (i < 10);

        // 0 1 1 2 3 5 8 13 21

        //printing fibonacci number
        int j = 0;
        int fibo0 = 0;
        int fibo1 = 1;
        int fibo=0;

        while(j < 10){

            System.out.print(fibo0 + " ");
            fibo = fibo0+fibo1;
            fibo0 = fibo1;
            fibo1 = fibo;
            j++;
        }
    }
}
