package collection_package;

import java.util.*;

public class ListTests {
    public static void main(String args []) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);

        System.out.println(list.size());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        System.out.println(set.size());


        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("red");
        stack.push("blue");
        stack.push("green");
        stack.push("yellow");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        stack.pop();

        itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
