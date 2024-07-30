package Stacks;

import java.util.*;

public class Q1_push_at_bottom_of_the_stack {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if(s.empty()){
            s.push(data);  //4 push if stack is empty
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

        
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();  //Stack is of Character type 

        int idx = 0;                        //track string 
        while(idx < str.length()){      
            s.push(str.charAt(idx));        
            idx++;
        }

        StringBuilder result = new StringBuilder(""); //New String Builder and Initialize with empty string
        while(!s.isEmpty()){                              
            char curr = s.pop();            
            result.append(curr);
        }

        return result.toString();   // to string function is used to store string since we are using builder
    }



    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);  //PUSH AT BOTTOm -> Q1 ka function is used here

    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3, 2, 1

        
        reverseStack(s);
        printStack(s);
        //1, 2, 3


    /* Q2 Reverse a string using a stack
    String str ="abc";
    String result = reverseString(str);
    System.out.println(result); */

    /* Q1. Push at the BOTTOM of the stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        } 
    */
    }
    
}
