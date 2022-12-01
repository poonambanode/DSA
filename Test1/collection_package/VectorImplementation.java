package collection_package;

import java.util.Vector;

public class VectorImplementation {

    public static void main(String args[]) {
        Vector<String> vec = new Vector<String>(3,2);
        vec.add("RED");
        vec.addElement("Blue");
        vec.addElement("Yellow");
        vec.addElement("Green");

        // vec.removeAllElements();

        Object vec2 = vec.clone();
        System.out.println("Vector" + vec);
        System.out.println("Vector" + vec.size());
        System.out.println("Vector" + vec.capacity());
        System.out.println("Clone Vector" + vec2);
    }
}
