package collection_package;

import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {

    public static void main(String [] args) {
        Stack<Integer> stack = new Stack<>();
        //Adding
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        System.out.println("add ele: " + stack);

        //Removing
        stack.pop();
        System.out.println("remove ele: " + stack);

        //getting top element
        stack.peek();
        System.out.println("get top element: " + stack.peek());

        int b = stack.search(3); //returns position of ele from top of stack
        System.out.println("search element: " + b);

        stack.add(7);
        System.out.println("add ele: " + stack);

        stack.add(3,8);
        System.out.println("stack: " + stack);

        System.out.println("last element: " + stack.lastElement());

        //Stack iterate

        Iterator itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(" ");

        for (Integer o: stack){
            System.out.println(o);
        }

    }
}