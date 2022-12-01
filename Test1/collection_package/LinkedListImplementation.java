package collection_package;

import java.util.*;

public class LinkedListImplementation {

    public static void main(String [] args){

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Monday");
        ll.add("Saturday");
        ll.add("Tuesday");
        ll.add("Friday");
        ll.add("Wednesday");

        System.out.println(ll);
        System.out.println("");

        ll.add("Thursday");
        System.out.println(ll);
        System.out.println("peek ele: "+ ll.peekLast());
        System.out.println("");

        System.out.println("poll: "+ ll.poll());
        System.out.println("");

        System.out.println("last index of friday: "+ ll.lastIndexOf("Friday"));
        System.out.println("");

        ll.set(1,"Friday");

        System.out.println("get Ele:" + ll.get(2));
        System.out.println("");

        //Sort
        //Collections.sort(ll);

        Iterator itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
