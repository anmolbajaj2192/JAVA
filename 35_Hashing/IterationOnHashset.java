package Hashing;
import java.util.*;

public class IterationOnHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(); //UNORDERED print karte hai hashset
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        /* Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } */

        //foreach
        for (String city : cities) {
            System.out.println(city);
            
        }
        
    }
    
}
