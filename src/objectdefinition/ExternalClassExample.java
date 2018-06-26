package objectdefinition;

public class ExternalClassExample {
    public void add2And2(){
        int a = 2 + 2;
        System.out.println("the sum of 2 & 2 is = " + a);
    }

    public void add(int a, int b){
        int c = a + b;
        System.out.printf("\nthe sum of %d & %d is = %d",  a,b,c);
    }

    public void doSometing(String condt, int a, int b){
        if(condt.equals("add")){
            int c = a + b;
            System.out.printf("\nthe sum of %d & %d is = %d\n",  a,b,c);
        }else if(condt.equals("minus")){
            int c = a - b;
            System.out.printf("\nthe subtraction of %d & %d is = %d\n",  a,b,c);
        }else{
            System.out.println("invalid string option");
        }
    }

    public void printUptoAscending(int n){

    }

    public void printUptoDescending(int n,int m){

    }

    public void printOddOrEven(boolean printEven, int n , int m ){

    }
}
