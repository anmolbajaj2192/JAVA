package Tries;
import java.util.*;

public class Q3_startWithProblem{
    static class Node{  
        Node children [] = new Node[26];  //'a' - 'z'
        boolean eow = false;

        public  Node(){
            for(int i=0; i<26; i++){
                children[i] = null;  //all children nodes are intialized with nu;;
            }
        }
    
    public static Node root = new Node(); //static node initialized with null

    public static void insert(String word){ //O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){ //O(L)
        Node curr = root; 
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;

    }

    public static boolean startsWith(String prefix){
    
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] ==  null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {

        String words[] = {"apple", "app", "mango", "man", "women"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
 
    }

}
}
