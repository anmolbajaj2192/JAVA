package Queue;

import java.util.*;

import java.util.Queue;

public class queue_JCF { 
    public static void main(String[] args) {   //O(1) for all three operations
        // Queue q = new Queue();

       // Queue<Integer> q = new LinkedList<>();
       Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3
       
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
