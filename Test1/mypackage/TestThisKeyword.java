package mypackage;

public class TestThisKeyword {
    public int a;
    public int b;

    TestThisKeyword () {
        a = 10;
        b = 20;
    }

    TestThisKeyword get() {
        return this;
    }

    public void display() {
        System.out.println("Display " + a + " " + b);
    }
    public static void main ( String args [] ) {
        TestThisKeyword t = new TestThisKeyword();
        t.get().display();
    }
}
