
public class RecursionBasics {

    public static void printDec(int n){
        //base case
        if(n == 1){
            System.out.println(n+" ");
            return;
        }

        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        //Base Case
        if (n == 1){
            System.out.print(n+" ");
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        //Base case
        if (n == 0){
            return 1;
        }
        int fnm1 = fact(n-1); 
        int fn = n * fnm1;


        return fn;
    }

    public static int sumOfNnumbers(int n){
        //Base case:
        if ( n == 1){
            return 1;
        }
        //snm1 --> Sum of N-1   ||   son --> sum of N

        int Snm1 = sumOfNnumbers(n-1);
        int Sn = n + Snm1;

        return Sn;

    }

    public static int fib(int n){

        //Base Case
      /* Traditional  if(n == 1){
            return 1;
        }

        if(n == 0){
            return 0;
        } */

        //Smart 
        if(n == 0 || n == 1){
            return n;
        }

        int fnm1 = fib(n-1); //vishwas rakho ki recursion sahi ans dega
        int fnm2 = fib(n-2);

        int fibn = fnm1+fnm2;

        return fibn;
    }

    public static boolean isSorted(int arr[], int i){

        //Base Case:
        if(i == arr.length-1){
            return true;
        }


        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int i, int key){

        //Base case:
        if(i > arr.length-1){
            return -1;
        }
        if(arr[i] ==  key){
            return i;
        }

        return firstOccurence(arr, i+1, key);
        }

    public static int lastOccurence(int arr[], int key, int i){ // i --> index no
        //base case
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int Power(int x, int n){
        //Base case:
        if(n == 0){
            return 1;
        }

       /*  int xpn = x * (int)Math.pow(x, n-1);
        return xpn; */

        int xm1 = Power(x, n-1);
        int xn = x * xm1;
        return xn;  
        
        /*only in one line
        return x*xPowern(x, n-1)
         */ 

    }

    public static int optimizedPower(int x, int n){ //O(log n)
        //Base case:
        if (n==0){
            return 1;
        }

        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n){ //n is floor size
        //Base Case:
        if (n==0 || n==1){
            return 1;
        }

        return tilingProblem(n-1) + tilingProblem(n-2);
/* 
        //Kaam
        //verticle tiles
        int fnm1 = tilingProblem(n-1);

        //horizontal tiles
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2; */

        
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        //Base case:
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        
        if(map[currChar - 'a' ] ==  true){
            //duplicates
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {

        //Base case:
        if (n==1 || n==2){
            return n;
        }

        //In one line

        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
/* 
        //kaam
        //choice: single
        int fnm1 = friendsPairing(n-1);

        //choice: Pairing
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //total ways
        int totWays = fnm1 + pairWays; */

        
        
    }
    public static void main(String args[]){
      //  int n = 5;
      //  printDec(n);
      //  printInc(n);
      //    System.out.println(fact(n));
      //   System.out.print(sumOfNnumbers(n));
      //    System.out.print(fib(n));    
    
     /* int arr[] ={1,2,3,4,5};
    System.out.println(isSorted(arr, 0)); */

     int arr[]={8,3,6,9,5,10,2,5,3};
    //System.out.println(firstOccurence(arr, 0, 10));
    // System.out.println(lastOccurence(arr, 5, 0));
    // System.out.println(xPowerN(2, 10));
    //System.out.println(optimizedPower(2, 10));
     System.out.println(tilingProblem(4));

  //  String str = "appnnacollege";
   // removeDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);
 
     System.out.println(friendsPairing(3));

    }
    
}
