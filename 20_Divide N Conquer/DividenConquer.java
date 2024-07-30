public class DividenConquer {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        //last element 
        int pIdx = partiton(arr, si ,ei);
        quickSort(arr, si, pIdx-1); //Left
        quickSort(arr, pIdx+1, ei); //Right
    
    }

    public static int partiton(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }

        i++;
         //swap
         int temp = pivot;
         arr[ei] = arr[i];  //pivot = arr[i] --->>> WRONG if written like this
         arr[i] = temp;
         return i;

    }

    public static void mergeSort(int arr[], int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }

        //Kaam
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid); //Left part
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }


//merge method to merge the sorted parts
    public static void merge(int arr[], int si, int mid, int ei){
        //left(0,3) = 4 -->total elements in left
        //right(4,6) = 3 ====>>>> 6 - 0 +1 where 0 & 6 idx number

        int temp[] = new int[ei - si + 1];
        int i = si; //idx for 1st sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0; //idx for temp;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;

            }else{
                temp[k] = arr[j];
                j++;
            }

            k++;
        }
        //for leftover elements of 1st sorted part
        while( i <= mid ){
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while( j <= ei ){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }


    public static int search(int arr1[], int tar, int si, int ei){

        //Base case
        if(si > ei){
            return -1;  //-1 as idx return 
        }

        //kaam
        int mid = si + (ei - si)/2;  //(si + ei)/2

        //case FOUND
        if(arr1[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr1[si] <= arr1[mid]){
            //case a: LEFT
            if(arr1[si] <= tar && tar <= arr1[mid]){
                return search(arr1, tar, si, mid-1);
            }else{
                //case b: RIGHT
                return search(arr1, tar, mid+1, ei);
            }
        }

        //mid on L2
            if(arr1[mid] <= tar && tar <= arr1[ei]){
                //case c : right
                return search(arr1, tar, mid+1, ei);
            }else{
                //case d: left
                return search(arr1, tar, si, mid-1)
            }

    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
      /*   mergeSort(arr, 0, arr.length-1);
        printArr(arr); */
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

        int arr1[] = {4,5,6,7,0,1,2};
        int target = 0; //Output -> 4
        int tarIdx = search(arr1, target, 0, arr1.length-1);
        System.out.println(tarIdx);

    }

    
}
