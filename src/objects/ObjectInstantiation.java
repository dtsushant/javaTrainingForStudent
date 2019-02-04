package objects;

public class ObjectInstantiation {

    public static void main(String args[]){
        ObjectExample o1 = new ObjectExample();
        o1.a=100;
        o1.b = "something";
        o1.c=90;

        o1.printProperty();
        o1.add();


        ObjectExample o2 = new ObjectExample();
        o2.a = 200;
        o2.b = "twenty";

        o2.printProperty();
        o2.add();


        /*
            create a class with 2 global integers int1 and int2  and 1 global String str1

            create 1 method reverse() to reverse the string str1

            create 1 method printOdd() to print all odd no. from 1 to int1

            create 1 method printEven() to print all even no. from int2 to 0
         */
    }


}
