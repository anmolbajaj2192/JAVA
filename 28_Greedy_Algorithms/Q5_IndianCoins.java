package Greedy_Algorithms;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Q5_IndianCoins {

    public static void main(String[] args) {

        //Integer class ke objects hona zaruri hai to use Comparator.reverseOrder()
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins=0;
        int amount=590;
        ArrayList<Integer> ans = new ArrayList<>(); //store woh max. notes ko jisse amount mile  

        for(int i=0; i<coins.length; i++){
            if(coins[i] < amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used = " + countOfCoins);
        
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    

    
}
