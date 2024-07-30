package Hashing;
import java.util.HashMap;
import java.util.Set; 
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate
        //hm.entrySet
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) { 

            System.out.println("key="+k+" ,value="+hm.get(k));
        }


    }
    
}
