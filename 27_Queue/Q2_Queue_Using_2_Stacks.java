package Queue;

import java.util.*;

public class Q2_Queue_Using_2_Stacks {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){ //If stacks are empty then accordingly add operation work 
            return s1.isEmpty();
        }

        //add - O(n)
        public void add(int data){
            while(!s1.isEmpty()){ 
                s2.push(s1.pop());       
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove - O(n)
        public int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }

            return s1.pop(); //s1 ka top mtlb front mil jayega
        }

        //peek - O(n)
        public int peek(){
                if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }

            return s1.peek();
        }
        }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3
       
        //Print Q
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        } 
    }
    
}
