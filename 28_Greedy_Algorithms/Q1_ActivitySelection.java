package Greedy_Algorithms;
import java.util.*;

public class Q1_ActivitySelection {

    public static void main(String[] args) { //O(n)
        
        /* CASE1: END TIME SORTED
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>(); //arraylist use karke activites ka index store kar rahe hai

        //1st Activity
        maxAct=1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("maxActivites = "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        
        }
        System.out.println();
    } */

    //CASE2: END TIME IS NOT SORTED 
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activites[][] = new int[start.length][3]; // nx3 
        for(int i=0; i<start.length; i++){
            activites[i][0] = i;         //original index store which help in after sorting 
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        //Lambda function -> shortform
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));  

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>(); //arraylist use karke activites ka index store kar rahe hai

        //1st Activity
        maxAct=1;
        ans.add(activites[0][0]);
        int lastEnd = activites[0][2];

        for(int i=1; i<end.length; i++){
            if(activites[i][1] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = activites[i][2];
            }
        }

        System.out.println("maxActivites = "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        
        }
        System.out.println();
    }

    
}
