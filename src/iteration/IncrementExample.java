package iteration;

public class IncrementExample {
    public static void main(String args[]){
        int i = 1;
        int j = 10;
        int a , b;

        a = i++;
        System.out.println(a);
        System.out.println(i);

        a = ++i;
        System.out.println(a);

        System.out.println(j--);
        System.out.println(--j);


    }
}
