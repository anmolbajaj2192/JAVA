package Stacks;
import java.util.*;

public class Q5_Next_greater_element {

    public static void main(String[] args) { //O(n) using stacks
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            //2 if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            //3 push in s
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();

        //other forms:
        //next greater right -> we have analyzed that
        //next greater left -> only change in loop (0 to n) 
        //next smaller right -> only this condition: arr[s.peek()] >= arr[i]
        //next smaller left -> change in both loop as well as conditon mentioned above
    }
    
}
