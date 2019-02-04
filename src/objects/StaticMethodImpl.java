package objects;

public class StaticMethodImpl {

    public static void main(String args[]){
        StaticMethod.doSomething();
        //cannot call non static reference like this
        //StaticMethod.againDoSomething();

        StaticMethod sm = new StaticMethod();
        sm.againDoSomething();

        /*

         create a static method isPrime(int p), which returns true if p is a prime number

         create another static method sumOfPrime(int n), which would print all the combination of two prime number which would result in n
            eg.
            sumOfPrime(14) should print
                7 + 7 = 14
                11 + 3 = 14

            sumOfPrime(11) should print
                9 + 2 = 11

            sumOfPrime(12) should print
                5 + 7 = 12
         */

    }
}
