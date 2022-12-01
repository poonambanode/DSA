package inheritance;

interface One1 {
    public void printGreeks();
}

interface Two2 {
    public void printFor();
}

interface Three3 extends One1,Two2 { }

public class MultipleInheritance implements Three3{

    public void printGreeks() {
        System.out.println("Greeks");
    }
    public void printFor() {
        System.out.println("For");
    }
    public static void main(String args[]){
        MultipleInheritance mul = new MultipleInheritance();
        mul.printGreeks();
        mul.printFor();
        mul.printGreeks();
    }
}
