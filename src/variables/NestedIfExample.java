package variables;

public class NestedIfExample {

    public static void main(String args[]){
        int a =80;
        int b = 9;
        int c = 40;

        if(a>b && a > c){
            if(b>c){
                System.out.println(a+"is greater than "+b+ " & "+c);
            }else{
                System.out.println(a+"is greater than "+c+ " & "+b);

            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println(b+"is greater than "+a+ " & "+c);
            }else{
                System.out.println(b+"is greater than "+c+ " & "+a);
            }
        }else{
            if(a>b){
                System.out.println(c+"is greater than "+a+ " & "+b);

            }else{
                System.out.println(c+"is greater than "+b+ " & "+a);

            }
        }

    }


}
