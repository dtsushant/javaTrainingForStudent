package iterations;

public class ForLoopExample {

    public static void main(String args[]){

        int a = 0;
        int b = a++;
        System.out.println(b);
        b = ++a;
        System.out.println(b);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);


        for(int i =0;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("****************Printing all the even no ***********");
        int evenSum = 0;
        for(int i =0;i<=20;i++){
            if(i%2==0) {
                System.out.print(i + " ");
                evenSum = evenSum+i;
            }
        }
        System.out.println(evenSum);

        System.out.println("\n***********printing all the odd no. ******************");
        for(int i =0; i<=20; i++) {
            if (i % 2 == 1)
                System.out.print(i + " ");
        }

        System.out.println("\n***********usage of break*****************");
        for(int i = 1000 ; i >=0; i--){
            if(i==980)
                break;
            System.out.print(i+ " ");
        }
        System.out.println("**************Usage of continue********************");
        for(int i = 31; i>=0; i--){
            if(i%5==0)
                continue;
            System.out.print(i+" ");
        }
}

}
