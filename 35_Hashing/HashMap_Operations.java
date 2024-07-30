package Hashing;

import java.util.*;

public class HashMap_Operations{
    public static void main(String[] args) {
        //create

        HashMap<String, Integer> hm = new HashMap<>();

        //Insert -O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); //return NULL
        
        //ContainsKey - O(1)

        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonesia")); //false
    
        //Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());
    } 
}