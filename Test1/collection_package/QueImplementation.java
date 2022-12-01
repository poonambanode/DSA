package collection_package;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueImplementation {
    public static void main(String args []) {

        Queue<String> pq = new PriorityQueue();
        pq.add("Poonam");
        pq.add("Banode");
        pq.add("Hedau");
        pq.add("");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        pq.remove("Hedau");
        System.out.println("After remove: " + pq);

    }
}
