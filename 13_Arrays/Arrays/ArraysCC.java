package Arrays;


public class ArraysCC {

    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }      
    }

    public static int linearSearch(int numbers[], int key, String menu[], String key_1){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                    return i;
            }
            for(int j=0; j<menu.length; j++){
                /* if(menu[j] == key_1){
                    return j;
                } */
                if(menu[j].equals(key_1)){
                    return j;
                }
                
            }
        }
        
        return -1;
    }

    public static int binarySearch(int numbers[], int key){
        int start=0, end = numbers.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key){ //found
                return mid;
            }

            if(numbers[mid] < key){ //right
                start = mid+1;
            }else{  //left
                end = mid -1;
            }
        }
        return -1;
    }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    /*REVERSE AN ARRAY || TWO-POINTER APPROACH */
    public static void reverse(int numbers[]){
      int first = 0, last = numbers.length-1;
      
      while(first < last){
        //swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;

        first++;
        last--;
      }
    }

    /*PAIRS IN AN ARRAY  */
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i= 0; i<numbers.length; i++){
            int curr= numbers[i];  // 2, 4, 6, 8, 10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    /*PRINT SUBARRAYS || 3 VARIABLES  */
    public static void printSubarrays(int numbers[]){

        int totalsubarray=0;
        
        for(int i=0; i<numbers.length; i++){
            int sum = 0;
          //  int start = i;
            for(int j=i; j<numbers.length; j++){
             //   int end = j;
                for(int k=i; k<=j; k++) {  //print
                  System.out.print(numbers[k]+" "); //subarray
                }
              
                System.out.println();
                
                sum += numbers[j];
                System.out.println("the sum of subarray is : " + sum);
                totalsubarray++;
            }
            System.out.println();
        }
        System.out.println("total subarrays ="+ totalsubarray);
    }

    public static void maxSubarraySum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){

                currentSum = 0;

                for(int k=i; k<=j; k++){   //print
                    currentSum+=numbers[k];  //subarray sum

                }
                System.out.println(currentSum);
                if (maxSum < currentSum){
                        maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void PrefixMaxSubarraySum(int numbers[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                         // i -> start & j -> end 
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currsum){
                    maxSum = currsum;
                }
            }
        }
        System.out.println("max sum =" + maxSum);
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int special_case = Integer.MIN_VALUE;

        for(int i=0;  i<numbers.length; i++){
            cs = cs + numbers[i];
            special_case = Math.max(special_case, numbers[i]);
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
            System.out.println("our max subarray sum is : "+ ms);
    }

    

        
        public static int trappedWater(int height[]){ //O(n)
        int n = height.length;
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
                int waterLevel = Math.min(leftMax[i], rightMax[i]);

                trappedWater += waterLevel - height[i];
        }
        //waterLevel = min(leftmax bound, rightmax bound)
        //trapped water = waterLevel - height[i]
        return trappedWater;

    }
    
    
    public static int buyAndSellStocks(int prices[]){
            int buyprice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for(int i=0; i<prices.length; i++){
                if(buyprice < prices[i]){ //profit
                    int profit = prices[i] - buyprice;// today's profit
                    maxProfit = Math.max(maxProfit, profit);
                }else{
                    buyprice = prices[i];
                }
            }
            return maxProfit;
    }

    
        
    public static void main(String args[]){ 
        int prices[] = {7, 1, 5, 3, 6, 4};
     System.out.println( buyAndSellStocks(prices));
     int numbers[] = {2, 4, 6, 8, 10};
     printSubarrays(numbers);
        /* Max Subarray sum
         maxSubarraySum(numbers);
        */
        
    /* Arrays - Create, Input, Output & Update

        int marks[] = new int[100];             //array create

        Scanner sc = new Scanner(System.in);     
        int physics = sc.nextInt();
        marks[0] = sc.nextInt();   //phy        //array input
        marks[1] = sc.nextInt();   //chem
        marks[2] = sc.nextInt();  //math

        System.out.println("phy : " + marks[0]);   //array output
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[2] = marks[2] - 1;                    //array update  
        System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage : " + percentage + "%");

        System.out.println("length of array = " + marks.length);  //find length of an array

    */

    /* Arrays as Function arguments
        
        int marks[] = {97,98,99};         //call by reference --> VALUE UPDATED
        int nonchangable = 5;             //call by value --> value UNUPDATED
        update(marks, nonchangable);
        System.out.println(nonchangable);

                //print marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
        */

    /* Linear Search
          
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18};
        String menu[] = {"dosa", "chole bhature", "samosa", "coke", "pepsi"};
        String key_1 = "samosa";
        int key = 10;

        int index = linearSearch(numbers, key, menu, key_1);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND AT INDEX LOCATION : " + index);
        }

         */
   
    /*Largest of an Array

        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is : " + getLargest(numbers));

         */

    /*Binary Search
         
         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 20;
        
        System.out.println("index for key is :" + binarySearch(numbers, key));

         */
    
    /* Reverse of an array 
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

         */

    /*Pairs in an Array

    int numbers[] = {2, 4, 6, 8, 10};
    printPairs(numbers);    

    */     

    /* Print Subarrays
    printSubarrays(numbers);
    */
     
    /* Max Subarray Sum - I (Brute Force)
            maxSubarraySum(numbers);
         */

        /*Max Subarray Sum = II (Prefix Sum)
          PrefixMaxSubarraySum(numbers);
         */
   
          /* Max Subarray Sum - III (Kadanes Algorithm )
        
                int numbers[] = {-2, -3, -1, -2, -3};
        kadanes(numbers);
        
        
                 */


        /*  Trapping rain water
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater(height)); */
        
        
}       

}