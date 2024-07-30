package Stacks;

import java.util.*;

public class Q6_Valid_Parentheses{

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                //closing 
                if(s.isEmpty()){
                    return false;
                }

                if((s.peek() == '(' && ch == ')' )  // ()
                    || (s.peek() == '[' && ch == ']') // []
                    || (s.peek() == '{' && ch == '}')){ // {}
                        s.pop();
                    }else{
                        return false;
                    }
                
            }
           
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;  //duplicate
                }else{
                    s.pop(); //opening pair
                }
            }else{
                //opening
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
       /*  String str = "({})[]"; //true 
            System.out.println(isValid(str));
       */

       String str = "((a+b))"; //true
       String str1 = "(a+b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
       

    }
}