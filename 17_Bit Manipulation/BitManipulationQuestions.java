

public class BitManipulationQuestions{

    public static void main(String args[]){
 /*     Question 1: What is the value of x^x for any valueof x?
        Solution 1:The value of x^x = 0. Think about it, xor gives 0 when the bits are the same.
                   If we compare the same number to itself, the bits will always be the same. 
                   So, the answer of x^x will always be 0.
                   
        System.out.println(Exponentiation(10)); */

/*      Question 2: Swap two numbers without using any third variable 
        Solution 2: 3 methods to apply same logic
        int x = 10, y=5;
        System.out.println("before swap =" + x + " and y = " + y);

        //swap using XOR  //Method-1
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        //swap using 

        System.out.println("After swap: x = " + x + " and y = " + y);

        //Method-2 (Using arithmatic operators)
        int a=21, b=31;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping: " + "x = " + a + " and  y = " + b);

         //Method - 3 (A mixture of bitwise operators and arithmatic operators)
         int p = 5;
         int q = 9;

        //same as a = a + b
         p = (p & q) + (p | q);
        
         //same as b = a - b
         q = p + (~q) + 1;

         //same as a = a - b
         p = p + (~q) + 1;

         System.out.println("After Swapping: " + "p = " + p + " and q = " + q); */

/*      Question 3: Add 1 to an integer using Bit Manipulation.
                    (Hint: try using Bitwise NOT Operator)   
                    
           Solution 3:The expression -~x will add 1 to an integer x.We know that to get negative of a number,
                    invert its bits and add 1 to it(Remember negative numbers are stored in 2’s complement form),
                    i.e. 
                    -x = ~x + 1;
                    -~x = x + 1 (by replacing x by ~x)

                    int x = 21;
                    System.out.println(x + " + " + 1 + " is " + --x);

                    int y = -31; 
                    System.out.println( y+ " + " + 1 + " is " + --y);

                    int z = 4;
                    System.out.println(z + " + " + 1 + " is " + --z);
                    
                    */

/*      Question 4: This question is based on a trick, pleasedirectly look at the solution.
                    Convert uppercase characters to lowercase using bits. 
        Solution 4:
                    for(char ch = 'A'; ch <= 'Z'; ch++){
                            System.out.println((char)(ch | ' '));
                    //prints abcdefghijklmnopqrstuvwxyz
                    } */
                    
/*          Question 5: A Good read of hacks using bits (you can check this out in your free time) :     
         solution 5: https://graphics.stanford.edu/~seander/bithacks.html  */     
                    
                    
                    
                    
    }

       


    
    // public static int Exponentiation(int x){
    //     int ans = 1;
        
    //     while (x>0){
    //         if((x & 1 ) != 0){
    //             ans = ans * x;
    //         }
    //         x = x*x;
    //         x = x >> 1;
    //     }
    //     return ans;
    // }
}