public class RecursionQuestion{

    public static void allOccurrences(int arr[], int i, int key){
        //Base case:
        if(i == arr.length){
            return; 
        }

        if(arr[i] == key){
            System.out.print(i + " ");
        }

        //Kaam
        allOccurrences(arr, i+1, key);
        
    }

    static String digits[]={"zero", "one", "two","three","four","five", "six","seven","eigth","nine"};
    
        public static void printDigit(int number){

            //Base case
            if(number == 0){
                return;
            }
            
            //kaam
            int lastDigit = number % 10;
            printDigit(number/10);
            System.out.print(digits[lastDigit]+" ");
        }

    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }

        return length(str.substring(1))+1;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        //Base case
        if(n==1){
            System.out.println(" transferred disk " + n + " from " + src + " to " + dest);
            return;
        }

        //kaam
        towerOfHanoi(n-1, src, dest, helper);
        System.out.print(" transferred disk " + n + " from " + src + " to " + dest);

        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[])  {

      /*   int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        allOccurrences(arr, 0, key);
        System.out.println(); */

       /*  printDigit(1234);
        System.out.println(); */
        
       /*  String str = "abcde";
        System.out.println(length(str));
 */

         int n = 3;
         towerOfHanoi(n, "S", "H", "D");
        
    }
    
}