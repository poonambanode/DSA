package mypackage;

public class Test {
    public static int a = 10;
    public Integer b = 20;
    private int x;

    Test(){
        this(3);
        System.out.println("Constructor 1");
    }

    Test(int x){
        //this(2,4);
        System.out.println("Constructor 2");
    }

    Test(int x,int y){
        System.out.println("Constructor 3");
    }

    public void myFunction(){
        System.out.println(a);
    }

    public void setX(int x){
        this.x = x;
    }

    public static void main(String []args ) {
        Test t = new Test();
        t.myFunction();
        Test t1 = new Test();
        t1.setX(30);
        {
            int a = 5;
            {
                System.out.println(t1.x);
            }
        }

        //For Each Loop
        String[] array = {"a","b","c"};
        for (String x:array){
            System.out.println("x" + x);
        }

        //Cloning of Arrays

        int intArray[] = {1,2,3};
        int cloneArray[] = intArray.clone();
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        //Strings

        String s1 = new String("Hello");
        System.out.println("before modifying: " + s1);
        //s1.append("World");
        //s1 += "World";
        //substring(3), concat, indexOf, lastIndexOf
        System.out.println("after modifying: " + s1 +" " + s1.charAt(2) + " " + s1.substring(2,3));

        String s2 = "World";
        int out = s1.compareTo(s2);
        System.out.println(out);

        //Delete in string buffer

        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(0,3);
        System.out.println(sb);


        Character c = 'a';
        Boolean b = true;

        Float f = 1.0f;

        Operation operation = new Operation();
        operation.perform();

        //Autoboxing
        byte by = 1;
        Byte b1 = by;

        //Constructor channing
        Test test = new Test();

    }

}


class Operation {
    Operation() {
        return;
    }
    protected void perform() {
        Number num = new Number(50);
        addInA(num);
        num.print();
    }

    private Number addInA(Number num) {
        num = new Number(150);
        num.print();
        return num;
    }
}

class Number {
    protected int a;
    protected Number(int a) {
        this.a = a;
    }
    private Number(Number n){
        a = n.a;
    }

    public void print() {
        System.out.println(a);
    }
    public void setA(int a) {
        this.a = a;
    }
    public static void main(String args[]){
        Number n = new Number(10);
        //Involves a Copy Constructor call
        Number n2 = new Number(n);
    }
}