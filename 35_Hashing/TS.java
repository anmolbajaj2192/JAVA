package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TS {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(); //UNORDERED print karte hai hashset
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        LinkedHashSet<String> lhs = new LinkedHashSet<>(); //Ordered Maintained
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        TreeSet<String> ts = new TreeSet<>(); //Sorted in Ascending order
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(cities);
        System.out.println(lhs);
        System.out.println(ts);
    }
    
}
