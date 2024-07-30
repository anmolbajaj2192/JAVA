package Arrays;
import java.util.*;

public class ArrayASSIGN{
    
        public static boolean containsDuplicate(int nums[]){//O(n^2)

            
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                   
                    if(nums[i] == nums[j]){
                            return true;
                    }
                }
            }
            return false;
        }   

        public static boolean usingSets(int nums[]){ //O(n)

            HashSet<Integer> set = new HashSet<>();

            for(int i=0; i<nums.length; i++){
                if(set.contains(nums[i])){
                    return true;
                }else{
                    set.add(nums[i]);
                }
            }
            return false;
        }


    public static int search(int nums[], int target){

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid - 1;
             }
        }
    }
    return -1;
    }

    public static int buynsell(int prices[]){
        int profit=0;
        int buyPrice = prices[0];

        for(int i=1; i<prices.length; i++){

            if(buyPrice < prices[i]){
                profit = Math.max(prices[i] - buyPrice, profit );
            }else{
                buyPrice = prices[i];
            }
        }
        return profit;
    }

    public static int trappedRainWater(int height[]){

        int n = height.length;


        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

        
    }
public static void main(String args[]){
    /* int nums[] = {1,1,1,3,3,4,3,2,4,2};
    System.out.println(containsDuplicate(nums)); */


    int nums[] =  {4, 5, 6, 7, 0, 1, 2};
    int target = 1; 

    System.out.println(search(nums, target)); 

    /* int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.println(buynsell(prices)); */

    // int height[] = {4, 2, 0, 3, 2, 5};
    // System.out.println(trappedRainWater(height));
}

}