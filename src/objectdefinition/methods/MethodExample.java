package objectdefinition.methods;

import objectdefinition.ExternalClassExample;

public class MethodExample {

    public void printOddOrEven(boolean printEven, int n , int m ){
        if(printEven){
            if(n>m){
                while(m<n){
                    if(m%2==0)
                        System.out.println(m);

                    m++;
                }
            }else{
                while(n<m){
                    if(n%2==0)
                        System.out.println(n);

                    n++;
                }

            }

        }else {
            if(n>m){
                while(m<n){
                    if(m%2==1)
                        System.out.println(m);

                    m++;
                }
            }else{
                while(n<m){
                    if(n%2==1)
                        System.out.println(n);

                    n++;
                }

            }
        }
    }

    public int add(int a, int b){
        int c = 0;
        c = a + b;
        return c;
    }

    public String dayOfTheWeek(int n){
        String day = "";

        switch(n){
            case 1:
                day="Sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            case 7:
                day="Saturday";
                break;
            default:
                day="invalid";
        }

        return day;
    }

    public boolean isEven(int n){
        return n%2==0;
    }

    public ExternalClassExample returnExternalClassExample(){
        return  new ExternalClassExample();
    }

    public  int addThree(int a , int b , int c){
        return addTwo(addTwo(a,b),c);
    }

    public int addTwo(int a, int b){
        return a+b;
    }


    public boolean isPrime(int n){
        boolean bool = false;

        return bool;
    }


    /*
        if s = something
        then
        it should return gnihtemos
     */
    public String returnReverse(String s){
        String reverseString = "";

        return reverseString;
    }


}
