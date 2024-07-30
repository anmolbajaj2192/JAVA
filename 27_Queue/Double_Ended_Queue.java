package Queue;
import java.util.*;


public class Double_Ended_Queue {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //2 1
        deque.addLast(3);  //2 1 3
        deque.addLast(4);  //2 1 3 4
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        
        System.out.println("first ele = " + deque.getFirst());
        System.out.println("last ele = "+ deque.getLast());
    }
    
}
