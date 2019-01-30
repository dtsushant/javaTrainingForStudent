package strings;

public class StringProperty {

    public static void main(String args[]){

        String s1;
        s1 =" Hi this is a String variable";

        System.out.println(s1);

        String s2 = " hi this is a String variable";

        // this compares 2 string with matching case
        System.out.println(s1.equals(s2));

        // this compares 2 string without case
        System.out.println(s1.equalsIgnoreCase(s2));

        // this converts sting to lower case;

        System.out.println(s1.toLowerCase());

        // this converts string to upper case;

        System.out.println(s1.toUpperCase());

        // this gives length of string
        System.out.println(s1.length());


        // converting string to integer
        String intString = "80";
        int i = Integer.parseInt(intString);
        System.out.println(i);

        for(int j=0; j<s1.length(); j++){
            System.out.println(s1.charAt(j));
        }



        int j = 0;

        System.out.println("here "+s1.indexOf("x"));
        System.out.println("here again"+s1.indexOf("i",2+1));
        System.out.println(recurseStringForChar(s2,'h',0));

        /*
            use while loop to reverse a string eg. deerwalk -> klawreed

            use loop to to check if string is palindrome  liril

         */

        System.out.printf("hi this is a formatted string, eg %s, %d, %f, %c","String",77,7.8,'b');

        String format = String.format("\neg  %d, %f, %c,%s",77,7.8,'b',"String");
        System.out.println(format);

    }

    public static int recurseStringForChar(String s, char c,int fromIndex){
        int ind = s.indexOf(c,fromIndex);
        if(ind!=-1)
            return recurseStringForChar(s,c,s.indexOf(c,fromIndex)+1)+1;
        else
            return 0;
    }
}
