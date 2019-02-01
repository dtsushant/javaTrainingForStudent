package objects;

public class MethodExample {

    public double one =0;
    public double two =0;

    public void printSomething(){
        System.out.println("Hi I am printing something");
    }

    public double multiply(){
        double multiple = one * two;
        return multiple;
    }

    public String returnBeautifiedResult(){
        String beautifiedMultiple = String.format("the multiple of %f * %f is %f", one, two, one*two);
        return beautifiedMultiple;
    }

    public String reverse(String s){
        String r = "";
        for(int i =s.length()-1; i>=0;i--)
            r+=s.charAt(i);
        return r;
    }

    public void printDogProperty(String name, int age, double weight){
        System.out.printf("the name of the dog is %s, its age is %d and its weight is %f \n",name,age,weight);
    }


    public boolean isPalindrome(String s){
        String r = reverse(s);

        boolean bool = r.equalsIgnoreCase(s);

        return bool;

    }



}
