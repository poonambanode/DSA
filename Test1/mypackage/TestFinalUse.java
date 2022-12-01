package mypackage;

public class TestFinalUse {
    final public int CONSTANT_VAR;

    {
        CONSTANT_VAR = 10;
    }

    // Static block : initialize static final variable
    //    static {
    //        CONSTANT_VAR = 10;
    //    }

    TestFinalUse () {
        //CONSTANT_VAR = 10;
    }

    TestFinalUse (int a) {
        //CONSTANT_VAR = 10;
        System.out.println(("parameterize constructor: " + a));
    }

    public static void main(String args[]) {

        TestFinalUse test = new TestFinalUse(5);

        //Final Variable
        System.out.println("Final Variable: " + test.CONSTANT_VAR);

        //Final reference variable
        final StringBuilder sb = new StringBuilder("Poonam");
        System.out.println("Before Change: " + sb);

        // change internal state object reference by final reference variable
        sb.append(" Hedau");
        System.out.println("After change:" + sb);
    }
}
