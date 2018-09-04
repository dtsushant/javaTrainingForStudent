package encapsulation.innerpackage;

import encapsulation.A;

public class D extends A {

    public void accessingProtectedTest(){
        C c = new C();
        //c.protectedDefinerInB();
        c.accessingProtected();
        //defaultDefiner();
    }
}
