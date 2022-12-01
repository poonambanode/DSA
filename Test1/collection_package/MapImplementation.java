package collection_package;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String [] args) {
        //HashMap
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1000);
        map.put("b",3000);
        map.put("c",4000);
        System.out.println("map: " + map);

        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }



        for (String x: map.keySet()) {
            if (map.get(x) == 7) {

            }
        }

        //res.toArray(new String[res.size()]);


        char ch = 'Z';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

        //LinkedHashMap
        Map<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("Poonam",29);
        map2.put("Palash",29);
        map2.put("Golu",33);
        System.out.println(map2);

        //TreeMap
        //SortedMap

    }
}
