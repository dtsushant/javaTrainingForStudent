package oops.abstraction;

public class AddOperation implements Operation {

    int a,  b;

    public AddOperation(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double operate() {
        return this.a + this.b;
    }

    public String operated(){
        return "Addition";
    }
}
