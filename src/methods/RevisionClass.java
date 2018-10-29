package methods;

public class RevisionClass {

    public boolean isPrime(Integer p){
        boolean b = true;
        for(int i=2;i<=p/2;i++){
            if(p%i == 0){
                b = false;
                break;
            }
        }

        return b;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public void printEvenUpto20(){

    }


    // this should return 1 + 3 + 5 + ...... + i = sum jati ho teti
    public String sumOfAllOddUptoI(int i){
        return "";
    }
}
