package objects;

public class MethodMainImplementation {

    public static void main(String args[]){
        MethodExample me = new MethodExample();

        me.printSomething();

        Double mul = me.multiply();

        System.out.println(mul);

        me.one = 90;
        me.two = 100;

        String beauMul = me.returnBeautifiedResult();
        System.out.println(beauMul);

        MethodExample me2 = new MethodExample();
        me2.one =9;
        me2.two = 4;

        Double mul2 = me2.multiply();

        String beauMul2 = me2.returnBeautifiedResult();

        System.out.println(mul2);

        System.out.println(beauMul2);

        String s = me2.reverse("reverse");
        System.out.println(s);

        me2.printDogProperty("Kale",4,mul2);

        boolean bool1 = me2.isPalindrome("liril");

        if (bool1){
            System.out.println(" the value passed was a palindrome");
        }

        if(me2.isPalindrome("test")){
            System.out.println(" the value passed was a palindrome");
        }else
            System.out.println(" the value passed was not a palindrome");


        /*

            create a method that accepts 1 integer parameter and returns boolean value true if it is prime
                eg. public boolean isPrime(int p)

            create a void method that accepts any integer and would print its multiplication table from 1 to 10


            create multiple interrelated methods that would work with 5 double value  as school subject and 1 String value to represent student name and prints if the students passed or failed with ranking
                eg.
                    this method shows the rank of student is student passed
                        public String rank(double total)
                    this method shows if the student has passed
                        public boolean isPassed(double math, double english, ..., double nepali)
                    this prints the student info in detail
                        public void studentInfo(String name,double math, double english, ... double nepali)


         */

    }
}
