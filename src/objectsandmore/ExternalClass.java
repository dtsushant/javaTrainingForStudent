package objectsandmore;

public class ExternalClass {

    public void printSomething(){
        System.out.println("hello hello");
    }

    public void sum(int a , int b){
        System.out.printf("the sum of %d and %d is %d\n",a,b, a+b);
    }

    public int add(int a , int b){
        int c = a + b;
        return c;
    }

    public String reverse(String s){
        String str = "";
        for(int i =s.length()-1; i>=0;i--){
            str+=s.charAt(i);
        }

        return str;
    }



}
