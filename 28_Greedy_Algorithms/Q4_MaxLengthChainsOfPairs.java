package Greedy_Algorithms;
import java.util.*;

public class Q4_MaxLengthChainsOfPairs {

    public static void main(String[] args) { //O(nlogn)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]) );

        int chainLen=1;    //First wale pair ko pick kar liya 
        int chainEnd=pairs[0][1]; //Last selected pair end //chain end
        
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("max length of chain = " + chainLen);
 
    }
    
}
