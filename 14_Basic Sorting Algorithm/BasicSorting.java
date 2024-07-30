import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {
    public static void bubblesort(int arr[]){

        // loop to access each array element
        for(int turn=0; turn<arr.length-1; turn++){

            // check if swapping occurs
           boolean swap =false;

           // loop to compare adjacent elements
            for(int j=0; j<arr.length-1-turn; j++){


                 // compare two array elements
                 // change > to < to sort in descending order
                 if(arr[j]> arr[j+1]){

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap=true;
                 }
            }
            if(!swap)
            break;

        }        
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println();
    }


    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){   //minumum element ko lekar aata
  /*if(arr[minPos] < arr[j]) ----> maximum element ko lekar aata */
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

   
    public static void insertionSort(int arr[]){
           for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev-- ;
            }
            //insertion
            arr[prev+1] = curr;
           }
    }

    public static void countingSort(int arr[]){  //Range
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];   
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; //Number ko index ki tarah lena hai phir count mein UPDATE karna hai
        }

         //sorting
         int j=0;                          // for new sorted 
         for(int i=0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }

         }

    }
    public static void main(String args[]){
       int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
     
       printArr(arr);
    }


    /*Bubble sort
        bubblesort(arr);
        printArr(arr); 

     */

/*Selection sort
 selectionSort(arr);
 */

/*Insertion sort
    insertionSort(arr);
 */

/*Inbuilt Sort
  Arrays.sort(arr);
 Arrays.sort(arr, Collections.reverseOrder());  ----> Integer
 */


}