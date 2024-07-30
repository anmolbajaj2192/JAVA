import java.util.*;

public class bonuslecture{


    public static void palindromicPatternwithNums(int n){
                //outer loop
                for(int i=1; i<=n; i++ ){
                    //spaces
                    for(int j=1; j<=n-i; j--){
                        System.out.print(" ");
                    }
                    //descending
                    for(int j=1; j>=1; j--){
                        System.out.print(i);
                    }
                    //ascending
                    for(int j=2; j<=i; j++){
                        System.out.print(i);
                    }

                    System.out.println();
                }


    }
    public static void main (String arg[]){
        // public static void palindromicPatternwithNums(5);

        //outer loop
        //for(int i =1; i<=n; i++){
        //    //spaces
        //    for(int j = 1; j<=n-i; j++){
        //        System.out.print(" ");
        //
        //    //numbers 
        //    for(int j =1; j<=i; j++){
        //        System.out.print(i+ " ");
        //    }

        //    System.out.println();
        //}

    }
}


