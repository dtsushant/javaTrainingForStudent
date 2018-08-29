package polymorph.overloading.constructoroverloading;

public class B {
    int a;
    int b;
    int c;
    public B(int x, int y){
        a = x;
        b= y;
    }


    public int sum(){
        return a + b;
    }

    public int getMax(){
        return 0;
    }
}
