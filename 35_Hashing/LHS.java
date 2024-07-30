package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHS {
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

        System.out.println(cities);
        System.out.println(lhs);
    }
    
}
