package collection_package;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueImplementation {
    public static void main(String [] args) {
        Deque<String> d = new LinkedList<>();
        d.add("Element 1 (Tail)");
        d.addFirst("Element 2 (Head)");
        d.addLast("Element 3 (Tail)");
        d.push("Emenet 4 head");
        d.offer("Element last");
        d.offerLast("Element last 2");
        System.out.println(d);

        //Array Deque

        Deque<Integer> adq = new ArrayDeque<>();
        adq.add(10);
        adq.add(40);
        adq.addFirst(20);
        adq.addLast(30);
        adq.offer(50);
        adq.offerLast(60);

        System.out.println(adq.peek());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());

        System.out.println("Array Deque: " + adq);
    }
}
