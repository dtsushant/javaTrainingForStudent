package polymorph.overloading.constructoroverloading;

public class C {
    int a ;
    int b;
    int c;

    public C(){

    }

    public C(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }
    public int getMax(){
        return 0;
    }
}
