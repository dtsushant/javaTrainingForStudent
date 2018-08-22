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
    }

}
