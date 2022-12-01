package collection_package;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation {
    public static void main(String args[]) {
        Queue<Book> queue = new PriorityQueue<>();


        queue.add(new Book(1,"Let us C","Yashwant Kanetkar", "BPB",8));
        queue.add(new Book(3,"Operating System","Galvin", "Wiley",6));
        queue.add(new Book(2,"Data Communications & Networking","Forouzan", "Mc Graw Hill",4));
        queue.add(new Book(4,"Life Rules","Poonam Hedau", "XYZ",12));

        System.out.println(queue);

        for(Book b: queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

        System.out.println(queue.peek());

    }
}
class Book implements Comparable<Book> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

    }

    @Override
    public int compareTo(Book b) {
        if(this.id > b.id) {
            return 1;
        } else if(id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}