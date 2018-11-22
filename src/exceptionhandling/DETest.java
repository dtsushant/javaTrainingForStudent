package exceptionhandling;

public class DETest {

    public static void main(String args[]) throws Exception{

        System.out.println("enter an integer:- ");
        Integer i = DataEntryTool.nextInt();

        System.out.println(i);

        System.out.println("enter a value between 1 & 5");

        Integer a = DataEntryTool.nextInt();

        if(a <1 || a >5 ){
            throw new Exception();
        }

        System.out.println("enter a value between 1 & 5");
        Integer n = DataEntryTool.nextIntInRange(1,5);

        System.out.println("hello hello hello");



    }
}
