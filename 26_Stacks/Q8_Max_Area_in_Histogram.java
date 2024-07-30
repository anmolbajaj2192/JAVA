package Stacks;

import java.util.*;

public class Q8_Max_Area_in_Histogram{

    public static void maxArea(int arr[]){

        int maxArea=0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        //Next smaller right = O(n)
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i] = arr.length;
            }else{
                //top
                 nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left = O(n)
        s = new Stack<>();     //stack upar bana hua hai, abhi khali kardia usko
        for(int i=0; i<=arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i] = -1;
            }else{
                //top
                 nsr[i] = s.peek();
            }
            s.push(i);
        }


        //Current Area: width = j-i-1 = nsr[i] - nsl[i] - 1  = O(n)

        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("max area in histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
    }

}