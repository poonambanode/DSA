package inheritance;

class One {
    // abstract void myAbstractFun();
    public void print_greek(){
        System.out.println("Greeks");
    }

    /*One () {
       System.out.println("Base Class Constructor");
    }*/
}

class Two extends One{
    Two () {
        System.out.println("derive class constructor");
    }

    public void print_for(){
        System.out.println("For");
    }
}

class Three extends Two {
    @Override
    public void print_greek(){
        System.out.println("Greeks");
    }
}

public class SingleInheritance {
    public static void main(String args[]){
        Two t = new Two();
        t.print_greek();
        t.print_for();
        t.print_greek();

        One one = new One();
    }

    //Inner Class
    private class Four{

    }
}