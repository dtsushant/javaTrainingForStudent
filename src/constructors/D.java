package constructors;

public class D {
    public int i;
    public int j;

    public D(){
        i = 99;
        j = 77;
    }


    public D(int i, int j){
        this.i = i;
        this.j = j;
    }

    public void test(){
        System.out.printf("the value of i and j is %d %d\n",i,j);
    }
}
