package encapsulation.innerpackage;

import encapsulation.A;
import encapsulation.B;

public class C extends B {

    protected void accessingProtected(){
        protectedDefinerInB();
        A a = new A();
        //a.defaultDefiner();


    }
}
