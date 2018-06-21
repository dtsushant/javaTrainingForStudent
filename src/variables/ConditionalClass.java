package variables;

public class ConditionalClass {

    public static void main(String args[]){

        boolean bool = false;

        if(bool){
            System.out.println("here because statement is true");
        }

        if(!bool){
            System.out.println("here because statement is false");

        }


        int firstVal,secondVal,thirdval;

        firstVal=1000;
        secondVal=200;

        if(firstVal> secondVal){
            System.out.println("firstVal = " + firstVal+"is greater than "+ secondVal);
        }else{
            System.out.println("secondVal = " + secondVal+"is greater than "+ firstVal);
        }


        int testscore = 98;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);


        int num=878788787;
        if(num <100 && num>=1) {
            System.out.println("Its a two digit number");
        }
        else if(num <1000 && num>=100) {
            System.out.println("Its a three digit number");
        }
        else if(num <10000 && num>=1000) {
            System.out.println("Its a four digit number");
        }
        else if(num <100000 && num>=10000) {
            System.out.println("Its a five digit number");
        }
        else {
            System.out.println("number is not between 1 & 99999");
        }
    }
}
