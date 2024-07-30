package Stacks;

import java.util.*;

public class Stack_using_Collection_Framework {

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>(); //this one line makes the whole change
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
