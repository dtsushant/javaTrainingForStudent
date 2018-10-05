package iteration;

public class LoopingStatementExample {
    public static void main(String args[]){

        //printing from 0 to 10
        for(int i =0;i<=10;i++){
            System.out.print(i+" ");
        }

        System.out.println();

        //printing from 10 to 0;
        for(int i = 10;i>=0;i--){
            System.out.print(i+" ");
        }

        System.out.println();
        //print all odd no. from 1 to 20;

        for(int i = 0;i <=20; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

        // sum of all even no. from 1 to 20
        //write your code here
    }
}
