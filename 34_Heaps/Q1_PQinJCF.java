package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1_PQinJCF {
    public static void main(String[] args) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>(); //by default ASCENDING ORDER -> priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //Descending Order -> priority dega

        
        pq.add(3);  //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){ //value kam mtlb priority jyada
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(logn)
        }
        
    }
    
}
