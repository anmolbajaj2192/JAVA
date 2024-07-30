package Hashing;
import java.util.*;

import javax.swing.tree.TreeModel;

public class LinkedHM {
    public static void main(String[] args) {
/* 
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); //Never save file with this name HashMap.java 
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        
        System.out.println(lhm);
        System.out.println(hm); */

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(tm);
        System.out.println(hm);

    }
    
}
