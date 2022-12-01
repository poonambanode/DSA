package abstraction;


interface Interface1{
    int a = 10;
    default void i1(){

    }
}
abstract public class Abstraction {
    public void m1(){
        System.out.println("called m1 method");
    }
    abstract public void m2();
}

class Main extends Abstraction implements Interface1{
    public void m2(){

    }
    public static void main(String []args){

    }
}