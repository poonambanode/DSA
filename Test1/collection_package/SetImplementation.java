package collection_package;

import java.util.*;

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ};

public class SetImplementation {
    public static void main(String [] args) {

        //HashSet
        Set<String> set = new HashSet<>();
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println("set: " + set);

        //EnumSet
        Set<Gfg> set2;
        set2 = EnumSet.of(Gfg.CODE, Gfg.CONTRIBUTE,Gfg.LEARN,Gfg.QUIZ);
        System.out.println("Enum Set: " + set2);

        //LinkedHashSet
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("B");
        set3.add("B");
        set3.add("C");
        set3.add("A");
        System.out.println("set: " + set3);

        //TreeSet
        Set<String> set4 = new TreeSet<>();
        set4.add("B");
        set4.add("B");
        set4.add("C");
        set4.add("A");
        System.out.println("set: " + set4);





        //NavigableSet
        //SortedSet

    }
}
