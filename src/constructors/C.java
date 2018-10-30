package constructors;

public class C {
    public int i;
    public int j;

    public C(){

    }

    public C(int a, int b){
        i = a;
        j = b;
    }

    public void test(){
        System.out.printf("the value of i and j is %d %d\n",i,j);
    }
}
