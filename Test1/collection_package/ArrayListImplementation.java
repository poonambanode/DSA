package collection_package;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {


    public static void main(String [] args) {

        Student s1 = new Student(1,"Poonam",29);
        Student s2 = new Student(2,"Palash",29);
        Student s3 = new Student(3,"Akansha",22);
        Student s4 = new Student(4,"Pragati",33);

        ArrayList<Student> StudArray = new ArrayList<>();

        StudArray.add(s1);
        StudArray.add(s2);
        StudArray.add(s3);
        //StudArray.set(2,s4); // changing element
        StudArray.remove(1); // removing element


        StudArray.isEmpty(); // check array is empty;
        System.out.println("isEmpty: " + StudArray.isEmpty());

        //Sort array by roll no
        //Collections.sort(new sortByRollNo());

        //System.out.println("StudArray: " + StudArray);

        Iterator itr = StudArray.iterator();

        while (itr.hasNext()) {
            Student s = (Student) itr.next();
            System.out.println(s.rollNo + " " + s.name + " " + s.age);
        }
    }
}



class Student {
    public int rollNo;
    public String name;
    public int age;

    Student(int rollNo,String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

