package variables;

public class ConditionalStatementExample {

    public static void main(String args[]){
        int num1 = 1010;
        int num2 = 155;
        int num3 = 103;

        boolean b = true;

        if(b){
            System.out.println("this condition is always true");
        }

        if(false){
            System.out.println("the is never executed");
        }

        if(num1%2==0){
            System.out.println(num1 + " is an even number");
        }


        if(num2%2==0){
            System.out.println(num2 + "is an even number");
        }else {
            System.out.println(num2 +"is an odd number");
        }


        if(num1>num2 && num1 > num3){

            System.out.println(num1+"is the greatest");
        }else if(num2 > num3){
            System.out.println(num2+"is the greatest");
        }else{
            System.out.println(num3 + "is the greatest");
        }
    }
}
