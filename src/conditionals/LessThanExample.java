package conditionals;

public class LessThanExample {
    public static void main(String args[]){
        int num1, num2,num3;
        num1 = 200;
        num2= 40;
        num3 = 150;

        if(num1<num2 && num1 < num3){

            System.out.println(num1+"is the smallest");
            if(num2<num3){
                System.out.println(num2+" is the second smallest followed by "+num3);
            }else{
                System.out.println(num3+" is the second smallest followed by "+num2);
            }
        }else if(num2 < num3){
            System.out.println(num2+"is the smallest");
            if(num1<num3){
                System.out.println(num1+" is the second smallest followed by "+num3);
            }else{
                System.out.println(num3+" is the second smallest followed by "+num1);
            }
        }else{
            System.out.println(num3 + "is the Smallest");
            if(num2<num1){
                System.out.println(num2+" is the second smallest followed by "+num1);
            }else{
                System.out.println(num1+" is the second smallest followed by "+num2);
            }
        }
    }


}
