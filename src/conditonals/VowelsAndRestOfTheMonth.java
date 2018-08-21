package conditonals;

public class VowelsAndRestOfTheMonth {
    public static void main(String[] args){
        
        String currentMonth = "6";
        
        switch(currentMonth){
            case "1":
                System.out.println("January");
            case "2":
                System.out.println("February");
            case "3":
                System.out.println("March");
            case "4":
                System.out.println("April");
            case "5":
                System.out.println("May");
            case "6":
                System.out.println("June");
            case "7":
                System.out.println("July");
            case "8":
                System.out.println("August");
            case "9":
                System.out.println("September");
            case "10":
                System.out.println("October");
            case "11":
                System.out.println("November");
            case "12":
                System.out.println("December");
                break;
            default:
                System.out.println("invalid");
        }

        char v = 'o';

        switch(v){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Is a vowel");
                break;
            default:
                System.out.println("is not a vowel");

        }



    }
}
