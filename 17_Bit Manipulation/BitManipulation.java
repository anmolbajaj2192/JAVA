import java.util.*;

public class BitManipulation{

    public static void oddorEven(int n){

        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }


    }

    public static int getIthBit(int n, int i){
        int BitMask = (1 << i);

        if((n & BitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
       /*Update Ith Bit
       //Approach 1 
        if(newBit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        } */

        //Approach 2
         n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }
    public static int clearIBits(int n, int i){
        int bitMask = ((~0) << i);
        return n & bitMask;
    }
    
    public static int cleaRangeOfBits(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;

        while(n>0){
            if((n & 1) != 0){ //Check our LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){  //check LSb
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1; //right shift
        }
        return ans;
    }

    public static int modularExpo(int a, int n, int x){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
       return ans % x;
    }
    public static void main(String args[]){
        
/*  EXTRA ----->>>> Modular Exponentiation       
        System.out.println(modularExpo(2, 4, 5)); */
 /* Fast Exponentiation       
        System.out.println(fastExpo(5,3));
 */
/* Count Set Bits in a number        
        System.out.println(countSetBits(15));
 */
/* check if a number is a power of two or not
        System.out.println(isPowerOfTwo(8));  //true
        System.out.println(isPowerOfTwo(15)); //false
 */
       /* Clear Range of Bits
        System.out.println(cleaRangeOfBits(10, 2, 4));
 */
        /* Clear Ith Bits
        System.out.println(clearIBits(15, 2)); */ 

       /*Update ith Bit  
       System.out.println(updateIthBit(10, 2, 1));
 */
/* Clear Ith bit
        System.out.println(clearIthBit(10, 1)); */


/* Set iTh Bit
        System.out.println(setIthBit(10, 2)); */

/* Get iTH Bit 
       System.out.println(getIthBit(10, 2)); //0
       System.out.println(getIthBit(10, 3)); //1 */


    /* Check if Odd or Even
        oddorEven(3);
        oddorEven(11);
        oddorEven(14); */

      /* Bitwise Operators  
        //Binary AND (&)
        System.out.println((5 & 6));

        //Binary OR (|)
        System.out.println((5 | 6));

        //Binary XOR( ^ )
        System.out.println((5 ^ 6));

        //Binary One's Complement( ~ )
        System.out.println(( ~5 ));

        //Binary Left Shift 
        System.out.println((5 << 2));

        //Binary Right Shift
        System.out.println((6 >> 1)); */
    }
}