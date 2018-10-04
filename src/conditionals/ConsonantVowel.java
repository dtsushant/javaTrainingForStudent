package conditionals;

public class ConsonantVowel {
    public static void main(String args[]){
        char alphabet = 'a';

        switch (alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Is a vowel");
                break;
                default:
                    System.out.println("is a consonant");
        }
    }

}
