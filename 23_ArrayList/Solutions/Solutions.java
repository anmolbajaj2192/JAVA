package ArrayList.Solutions;

import java.util.ArrayList;
import java.util.Collections;


public class Solutions {

    public static boolean solution(ArrayList<Integer> nums){

    boolean inc = true;
    boolean dec = false;

    for(int i=0; i<nums.size(); i++){
        if(nums.get(i) > nums.get(i+1))
            inc = false;
        
        if(nums.get(i) < nums.get(i+1))
            dec = false;
    }

    return inc || dec;
}

    public ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        
        ArrayList<Integer> list = new ArrayList<>();
        //1st part
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i-1)){

                list.add(nums.get(i));
            }
        }

        //2nd part
        if(nums.size() == 1){
            list.add(nums.get(0));
        }

        //3rd part
        if(nums.size() > 1){
            if(nums.get(0) + 1 < nums.get(1)){
                list.add(nums.get(0));
            }

            if(nums.get(nums.size()-2) + 1 < nums.get(nums.size() - 1)){
                list.add(nums.get(nums.size() - 1));
            }
        }
        return list;
    }

    public static int mostFrequent(ArrayList<Integer>nums, int key){

        int result[] = new int[1000];

        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i+1)-1 == key){
                result[nums.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++){
            if(result[i] > max){
                max = result[i];
                ans = i+1;
            }
        }

        return ans;
    }

    public ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(1);

        for(int i=2; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            //case1: even number generate kar rahe hai from "ans" ki value se ie 1
            for(Integer e:ans){
                if(e*2 <= n){
                    temp.add(e*2);
                }
            }

            //case2: odd number generate karenge from "ans" ki value se
            for(Integer e:ans){
                if(e*2-1 <= n){
                    temp.add(e*2-1);
                }
            }

            ans = temp;
        }

        return ans;

    }
    
    public static void main(String args[]){

        // ArrayList<Integer> nums = new ArrayList<>();

        /* nums.add(1);
        nums.add(3);
        nums.add(2);
    
        System.out.println(solution(nums)); */

        // nums.add(1);
        // nums.add(100);
        // nums.add(200);
        // nums.add(1);
        // nums.add(100);

        // int key = 1;

        
        // System.out.print(mostFrequent(nums, key));

        int n=4;
        beautifulArray();

    
    }
    
}
