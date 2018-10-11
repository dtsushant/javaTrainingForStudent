package methods;

public class ClassExercises {

    public int greatest(int a , int b , int c){
        int greates = 0;
        if(a>=b && a >=c){
            greates =a;
        }else if(b>=c){
            greates =c;
        }else {
            greates = c;
        }

        return greates;
    }

    public static void main(String args[]){
        ClassExercises c = new ClassExercises();

        int num1 = 199;
        int num2 = 299;
        int num3 = 399;
        int num4 = 499;
        int num5 = 599;
        int num6 = 699;
        int num7 = 799;
        int num8 = 899;
        int num9 = 999;

        int great1 = c.greatest(num1,num3,num5);
        System.out.printf("the greatest among %d %d and %d is %d \n", num1, num3, num5,great1);

        int great2 = c.greatest(num2, num4, num6);
        System.out.printf("the greatest among %d %d and %d is %d \n", num2, num3, num6,great2);


        int great3 = c.greatest(num7, num8, num9);
        System.out.printf("the greatest among %d %d and %d is %d \n", num7, num8, num9,great3);

        System.out.println("and the greatest ="+c.greatest(great1,great2,great3));
    }

    //if the passed no. is prime it should say "the number <> is prime" else it should say "the number <> is not a prime"
    public String isPrime(int i){
        String s= "";
        //complete your code here
        return s;
    }


    // this method should call sum
    public int add(int a, int b, int c){
        int sum = 0;
        //complete your code here
        return sum;
    }


    public int sum(int a, int b){
        int sum =0;
        // complete your code here
        return sum;
    }


    //needs to call reverseString
    // any string which is same when reversed is palindrome ex. wow, saas etc
    public Boolean returnPalindrome(String s){
        // complete your code here
        return false;
    }

    // should reverse the string content ex. GOD should reverse to DOG
    public String reverseString(String s){
        return "";
    }
}
