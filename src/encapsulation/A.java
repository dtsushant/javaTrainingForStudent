package encapsulation;

public class A {
    public void printSomethin(){
        System.out.println("hello something");
        privatedDefiner();
    }

     void defaultDefiner(){
        System.out.println("THE SCOPE OF HTIS IS DEFAULT");
    }

    protected void protectedDefiner(){
        System.out.println("the scope of this is protected");
    }

    private void privatedDefiner(){
        System.out.println("gthe scope of this is private and only this class can access this");
    }
}
