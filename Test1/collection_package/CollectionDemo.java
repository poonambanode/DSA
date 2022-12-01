package collection_package;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    public static void main( String args[] ) {
        int arr[] = new int[] {1, 2, 3, 4, };
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String > h = new Hashtable<>();

        v.addElement(1);
        v.addElement(2);
        v.add(3);

        h.put(1, "Poonam");
        h.put(2, "Hedau");

        System.out.println("Array " + arr[2] );
        System.out.println("Vector " + v.elementAt(2));
        System.out.println("Hashtable " + h.get(2));
    }
}
