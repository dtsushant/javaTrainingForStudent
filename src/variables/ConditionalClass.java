package variables;

public class ConditionalClass {

    public static void main(String args[]){

        int firstVal,secondVal;

        firstVal=100;
        secondVal=200;

        if(firstVal> secondVal){
            System.out.println("firstVal = " + firstVal);
        }else{
            System.out.println("secondVal = " + secondVal);
        }


        int testscore = 76;
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


        int num=-1;
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
