package iterations;

public class BreakContinueInLoop {

    public static void main(String args[]){

        for(int i =0; true; i++){
            if(i==5)
                break;
            System.out.print(i+" ");

        }

        System.out.println();
        for(int i =0; i <=20; i++){
            if(i%2==0)
                continue;
            System.out.print(i+" ");
        }
    }
}
