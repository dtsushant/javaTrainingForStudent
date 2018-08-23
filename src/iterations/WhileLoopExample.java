package iterations;

public class WhileLoopExample {
    public static void main(String args[]){
        int i = 1;
        while(i<=10){
            System.out.print(i+" ");

            i++;
        }

        System.out.println("\nin reverse order");
        while(true){
            System.out.print( i + " ");
            i--;
            if(i==0)
                break;
        }

        int sumOfEvenInteger = 0;
        int sumOfOddInteger = 0;
        String stringOfEvenInteger="";
        String stringOfOddInteger="";

        while(i<=100){
            if (i % 2 == 0) {
                sumOfEvenInteger = sumOfEvenInteger + i;
                stringOfEvenInteger = stringOfEvenInteger+"+"+i;
            }else{
                sumOfOddInteger = sumOfOddInteger + i;
                stringOfOddInteger = stringOfOddInteger+"+"+i;
            }
            i++;
        }

        System.out.printf("\n%s = %d",stringOfEvenInteger,sumOfEvenInteger);
        System.out.printf("\n%s = %d",stringOfOddInteger,sumOfOddInteger);

        do{
            System.out.println("\nthe final value of i = "+i);
            i++;
        }while(i<=100);



    }
}
