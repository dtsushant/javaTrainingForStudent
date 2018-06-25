package loop;

public class IterationExample {

    public static void main(String args[]){

        System.out.println("printing from 10 to 1");
        for(int i = 10;i>0;i--){
            System.out.println(i);
        }

        System.out.println("pringing from 10 to 5");
        for(int i = 10;i>0;i--){
            if(i==4)
                break;
            System.out.println(i);
        }


        System.out.println("printing all even");
        int i = 0;
        while(i<10){
            i++;
            if(i%2==1)
                continue;

            System.out.println(i);
        }


        do{
            System.out.println("hello");
        }while (i<10);



    }
}
