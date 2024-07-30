import java.util.*;

import javax.swing.plaf.TextUI;
import javax.swing.text.PlainDocument;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class JavaBasics {
    public static void printHelloWorld(){
      //block of code
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        // if return-type int hai then,
        //                return 3;
    }

    public static int calculateSum(int num1, int num2){   //parametes or formal parameters
       int sum = num1 + num2;
       return sum;

    }
    
    public static void swap(int a, int b){
      //swap
      int temp=a;
      a=b;
      b=temp;

      System.out.println("a = " + a);
      System.out.println("b =" + b);

    }
    //code to calculate sum
    public static int multiply(int a, int b){
      int product=a*b;
      return product;
    }
    public static int factorial(int n){
      int f=1;

      for(int i=1; i<=n; i++){
              f = f * i;
      }
      return f;   //factorial of n
    }
    public static int binCoeff(int n, int r){
      int fact_n = factorial(n);
      int fact_r = factorial(r);
      int fact_nmr = factorial((n-r));

      int binCoeff = fact_n/(fact_r*fact_nmr);
      return binCoeff;
    }


    ////func to calc sum of 2 nums
    //public static int sum(int a, int b){
    //  return a+b;
    //}

    ////func to calc to 3 nums
    //public static int sum(int a, int b, int c){
    //  return a+b+c;
    //}

    //func to calc int sum
    public static int sum(int a, int b){
      return a+b;
    }

    //func to calc float sum
    public static float sum(float a, float b){
      return a+b;
    }

  //    //only for n>=2
  //  public static boolean isPrime(int n){
      //corner cases
      //1
  //    if(n==2){
  //      return true;
  //    }
  //      for(int i=2; i<=n-1; i++){ 
  //        if(n%i==0){  //completely dividing
  //          return false;
  //        }
  //      }
  //      return true;
  //  }
  public static boolean isPrime(int n){     //OPTIMIZED PROGRAM FOR PRIME OR NOT PRIME
    if(n ==2){
      return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n % i == 0){
        return false;

      }
    }
    return true;
  }

    public static void primesInRange(int n){
      for(int i=2; i<=n; i++){
        if(isPrime(i)){
          System.out.print(i + " ");
        }
      }
      System.out.println();
    }

    public static void binToDec(int binNum){
      int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
          int lastDigit = binNum % 10;
          decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

          pow++;
          binNum = binNum/10;


        }

        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n){

      int myNum = n;
      int pow = 0;
      int binNum = 0;

      while(n>0){
        int rem = n % 2;
        binNum = binNum + (int)(rem * Math.pow(10, pow));
        pow++;
        n=n/2;

      }
      System.out.println("binary form of " + myNum + " is " + binNum);
    }

    public static double average(double x, double y, double z){

          return (x+y+z)/3;
    }

    public static boolean isEven( int number ){

    
      if(number % 2 == 0){
        return true;
      }else{
        return false;
      }

    }

    public static boolean ispalimdrome(int number){
      
      int palimdorme = number;   //copied number into variable
      int rev = 0;

      while(palimdorme != 0){
        int  remainder = palimdorme % 10;
       rev = (rev * 10) + remainder;
      palimdorme = palimdorme/10;
      }
      // if original and the reverse of number is equal means
      //number is palimdorm in Java
      if(number == rev){
        return true;
      }
      return false;
      }

  
    public static int sumofdigits(int number){

      int sumofdigits=0;
      while( number>0){
      
        int lastDigit = number % 10;
        sumofdigits+=lastDigit;
        number =number/10;

      }
       return sumofdigits;
    

      }     
    
    public static void main(String args[]){ 


      /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer of your choice: ");
        int digits = sc.nextInt();

        System.out.println("the sum is " + sumofdigits(digits)); */

/*  Q3.
    System.out.println("please enter a number: ");
    Scanner sc = new Scanner(System.in);
    int palimdorme = sc.nextInt();

    if(ispalimdrome (palimdorme)){
      System.out.println("Number : "+ palimdorme + " is a palindrome");
    }else{
      System.out.println("Number :"+ palimdorme + " is not a palimdrome" );
    }*/
   
      /*System.out.println();*/
     /* 
     Q2.   
       Scanner sc = new Scanner(System.in);
      int num;

      System.out.println("enter an integer: ");
      num = sc.nextInt();

      if(isEven(num)){
        System.out.println("number is even");
      }else{
        System.out.println("number is odd");
      }
     */ 
     
/*  
      Q1. 
    Scanner sc = new Scanner(System.in);

     System.out.print("Input the first number: ");
     double x = sc.nextDouble();
     System.out.print("Input the second number: ");
     double y = sc.nextDouble();
     System.out.print("Input the third number: ");
     double z = sc.nextDouble();
     System.out.print("The average value is "+ average(x, y, z)+ "\n");
     */
     
         /* decToBin(7);*/ 

      /* binToDec(1111);*/   

        /* primesInRange(100);   //2 to 20
*/ 
     /* System.out.println(isPrime(16));
*/ 
      /* System.out.println(isPrime(5));  */ 

      /*System.out.println(sum(3, 5));
      System.out.println(sum(3.2f, 4.8f)); */

      /*  System.out.println(sum(3,5));
          System.out.println(sum(3,5,7));*/
        
/*System.out.println(binCoeff(5,2)); */
      
/*  System.out.println(factorial(4)); 
*/
        
/*
     int a =3;
      int b=5;
      int prod = multiply(a, b);
      System.out.println("a * b = " + prod);
      prod=multiply(10,20);
      System.out.println("a * b = " + prod);

 */
      /*//swap - value exchange

        int a=10;
        int b=5;

        swap(a, b);
 */
        

       // printHelloWorld();   //this is FUNCTION CALL
      /* Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = calculateSum(a, b);                    // aruguments or actual parameters
       System.out.println("sum is: " + sum); */

   // }

   // private static char[] isEven(boolean n) {
    //  return null;
    }
}    


/*{  9. PATTERNS (PART-I)
    #PROGRAM PRINT CHARACTER PATTERN     
      int n=4;
      char ch='A';

      outer loop
      for(int line=1; line<=n; line++){
        for(int chars=1; chars<=line; chars++){
            System.out.print(ch);
            ch++;
        }
          System.out.println();
      }

     #PROGRAM HALF-PYRAMID PATTER     
      int n=4;
      for(int line=1; line<=n; line++){
        //number print
          for(int num=1; num<=line; num++){
              System.out.print(num);
          }
          System.out.println();
      }



     #PROGRAM INVERTED-STAR PATTERN
      int n = 7;
     for(int line=1; line<=n; line++){
          for(int star=1; star<=n-line+1; star++){
            System.out.print("*");
          }
          System.out.println();
     }
      

     #PRINT STAR PATTERN

    for (int line=1; line<=4; line++){
      //one line
      for(int star=1; star<=line; star++){
        System.out.print("*");
      }
      System.out.println();
*/

     /*   !!!LOOPS!!! 

     P1:
         int counter = 0;
         while(counter < 100){
         System.out.println("hello world");
         counter++;
    }
    System.out.println(" printed HW 10x");

     P2:
      int counter = 1;
      while(counter <= 100){
      System.out.print(counter + " ");        //SAME LINE MEIN PRINT KARTA HAI
      counter++;
      }
      System.out.println();

     P3:    
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the range of your choice : ");
       int range = sc.nextInt();

       int counter = 1;
       while(counter <= range){
       System.out.print(counter + " ");
       counter++;
    }

     P4:  
       Scanner sc = new Scanner(System.in);{
       System.out.println("Enter the value for number n :");
       int n = sc.nextInt();
       int sum = 0;

       int i = 1;  
       while(i <= n){
          sum+=i;
          i++;
       }
       System.out.println("Sum is : " + sum);

    }

        #FOR LOOP   
       // int i = 1;
       for(int i = 1; i <= 10; i++){
       System.out.println("Hello world");
    }

        #PRINT SQUARE PATTERN
         // for (int line=1; line <= 4; line++){    //USING FOR LOOP
         //   System.out.println("****");
         // }
         int line =1;                            //USING WHILE LOOP
          while (line<=4){
          System.out.println("****");
          line++;

         #PRINT REVERSE OF A NUMBER
         int n = 10899;
    
         while (n > 0){
           int lastDigit = n % 10;
           System.out.print(lastDigit);
           n = n / 10;     //n/=10
         }
         System.out.println();
          } 

          #REVERSE THE GIVEN NUMBER
          int n = 10899;
          int rev = 0;

          while(n>0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;     //n update
          }
            System.out.println(rev);

            #DO-WHILE LOOP
            int counter = 1;
            do{
                System.out.println("Hello World");
                counter++;
           }
                while(counter <= 10);

         #BREAK STATEMENT
                for(int i = 1; i<=5; i++){
                if(i==3){
                  break;
               }
                    System.out.println(i);
              }
                   System.out.println("I'm out of the loop");

           Q. Keep entering number till user enters a multiple of 1o       
                Scanner sc = new Scanner(System.in);
    
               do{
                    System.out.print("enter a number : ");
                    int n = sc.nextInt();

                     if(n%10==0){
                       break;
                  }
                  System.out.println(n);
                   }while(true);

            #CONTINUE STATEMENT
            for(int i=1; i<=5; i++){
                if(i==3){
                        continue;
                  }
                     System.out.println(i);
                    }

          Q2: display al numbers entered by user except multiple of 10
              Scanner sc = new Scanner(System.in);
    
              do{
                System.out.print("enter your number : ");
                int n = sc.nextInt();
          
                if(n%10==0){
                  continue;
                }
                System.out.println("number was :" + n);
              }while(true);       

              Scanner sc = new Scanner(System.in);



        P5: CHECK IF NUMBER IS PRIME OR NOT
        Scanner sc = new Scanner(System.in);
               int n = sc.nextInt();

              if(n==2){
                 System.out.println("n is prime");
               }else{
                 boolean isPrime = true;                   //BOOLEAN TYPE IS USED HERE !!!!!!!
                 for(int i=2; i<=Math.sqrt(n); i++){       //MATH LIBRARY IS USED HERE!!!!!!!!!!!!
                   if(n % i ==0 ){
                     isPrime = false;                      //n is not prime i.e. COMPOSITE NUMBER
                   }
  
                 }
                 if(isPrime==true){
                   System.out.println("n is prime");
                 }else{
                   System.out.println(" n is not prime");
                 }

        //////////////////////////////////////////////////////////////////////////////////////////////
        // Question2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

   int number;
   int evenSum=0;
   int oddSum=0;
   int choice;

   do{

    System.out.print("Enter a number: ");
    number = sc.nextInt();

    if(number%2 == 0){
      evenSum+=number;
    }
    else{
      oddSum+=number;
    }
    System.out.println("Do you wish to continue? if yes then choose 1 or choose 0");
    choice = sc.nextInt();

   }while(choice == 1);

   

   System.out.println("Even sum of interger : " + evenSum);
   System.out.println("Odd sum of Integer: " + oddSum);




        Q4: Write a programto print the multiplication table of a number N,entered by the user         
        Scanner sc = new Scanner(System.in);
                      System.out.println("multiplication table of a number N : ");
                      int n = sc.nextInt();

                      for(int i = 1; i<=n; i++){
                         
                          int multiple = (i*n);
       
                          System.out.println("Multiplication table of " + n + " * " + i + " = " +multiple );
                      }

                       System.out.println( "MULTIPILCATION TABLE OF " + n + " is printed");
                    }

                Question 3 :Write a program to find the factorialof any number entered by the user.
  
                    Scanner sc = new Scanner(System.in);
    
                    int num; //to hold number
                    int fact = 1; // to hold factorial

                    System.out.print("enter any positive interger: ");
                    num = sc.nextInt();

                    for(int i=1; i<=num; i++){
                      fact = fact *i;
                    }

                    System.out.println("Factorial: " + fact);
                    }

         Scope of variable is referred to the part of the program where the variable can be used.
         
                    
      */
  
     /*  // CONDITIONAL STATEMENTS QUESTIONS
         Q1: WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
     Scanner sc = new Scanner(System.in);     

           System.out.println("enter a number");
           int number = sc.nextInt();

           if( number > 0){
            System.out.println("Given number is POSITIVE");
           }else{
            System.out.println("Given number is NEGATIVE");

         Q2:FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever  
           double temp = 103.5;
           if (temp > 100){
             System.out.println("you have a fever");
           }else{
             System.out.println("you dont have a fever");
           }   

        Q3:WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case.
          
          Scanner sc = new Scanner(System.in);

          System.out.println("Input week number (1-7) : ");
          int weeknumber = sc.nextInt();

          switch(weeknumber){

            case 1 : System.out.println("Day is Monday");
                        break;
            case 2 : System.out.println("Day is Tuesday");
                        break;            
            case 3 : System.out.println("Day is Wednesday");
                        break;         
            case 4 : System.out.println("Day is Thursday");
                        break;
            case 5 : System.out.println("Day is Friday");
                        break;
            case 6 : System.out.println("Day is Saturday");
                        break;
            case 7 : System.out.println("Day is Sunday");        
                        break;
            default : System.out.println("Retry & try to Pass the value from (1-7)");                  
          }

          Q4: What will be the value of x & y in thefollowing program:
           Ans : x = false         //int a = 63, b =36;
                  y = 63            boolean x = (a<b) ? true : false;
                                    System.out.println(x);

                                    int y = (a>b) ? a:b;
                                    System.out.println(y);
                                    
          Q5. WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not                         
              Scanner sc = new Scanner(System.in);
    
              System.out.println("Enter a YEAR of your choice : ");
              int year = sc.nextInt();

              boolean x = (year % 4 ) == 0;
              boolean y = (year % 100 ) != 0;
              boolean z = (year % 400 ) == 0;

              if (x && (y || z)){
               System.out.println(year + " is a leap year");
              }
              else{
               System.out.println(year + " is not a leap year");
              }                        
           }*/      
        
           /* System.out.println("enter a :");
           int a = sc.nextInt();
           System.out.println("enter b : ");
           int b = sc.nextInt();
           System.out.println("enter operator : ");
           char operator = sc.next().charAt(0);     //!!!!!ATTENTION!!!!!!

           switch(operator){
                case '+' : System.out.println(a+b);
                            break;
                case '-' : System.out.println(a-b);
                            break;
                case '*' : System.out.println(a*b);
                            break;
                case '/' : System.out.println(a/b);
                            break;
                case '%' : System.out.println(a%b);
                            break;
                default : System.out.println("wrong");                      
           }*/
           
      /* int num = 2;
      switch(num){
        case 1: System.out.println("samosa");
                break;
        case 2: System.out.println("burger");
                break;
        case 3: System.out.println("mango shake");
                break;
        default : System.out.println("we wake up");
      }

*/
    /* int num = 2;
      switch(num){
        case 1: System.out.println("samosa");
                break;
        case 2: System.out.println("burger");
                break;
        case 3: System.out.println("mango shake");
                break;
        default : System.out.println("we wake up");
      }*/  
      /*
        int a = 1, b= 3, c=6;

      if((a >= b) && (a >= c)){
        System.out.println("largest is A");
      }

    else if(b >= c){
        System.out.println("largest is B");
    }

    else{
        System.out.println("largest is C");
    }
      */
       
        /* 
          int income = sc.nextInt();      // INCOME TAX CALCULATOR
            int tax;

          if(income < 500000){
                tax =0;
          }

          else if(income >= 500000 && income <= 1000000){
            tax = (int) (income * 0.2);
          }
          else{
            tax = (int)(income *0.3);
          }

          System.out.println("your tax is : " + tax);
        */
        
     /* 
     int age = 22 ;
        
        if(age >= 18){
            System.out.println("adult");
        }
        else if( age >= 13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("child");
        }*/   
           
        /* 
      int number = sc.nextInt();
        
        if (number % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }*/  

        /*    int a = 1;          //print largest of 2 using conditional if else statements
            int b = 5;

            if(a>=b){
                System.out.println("a is largest of 2");
            }   else{
                System.out.println("b is largest of 2");
            }
            */  

       /* 
       int age = 16;

        if (age >= 18){
            System.out.println("adult : drive, vote");

        }

        if(age >13 && age <18){
            System.out.println("teenager");
        }
        
        else{
            System.out.println("not adult");
        }
      */ 
     /* int a = 10;
           a +=10;
            System.out.println(a);

        System.out.println( !(3<2));

        int A = 10;
        int B = 10;
 System.out.println((A <= B));
        

      int a = 10;
      int b = --a;
      System.out.println(a);
      System.out.println(b);
      int a = 10;
      int b = ++a;
      System.out.println(a);
       System.out.println(b);

      int a = 10;
      int b = a++;
      System.out.println(a);
      System.out.println(b);

      int A = 10;
      int B = 5;
      System.out.println("modulo(remainder) = " + (A%B)); */
            
           /*float rad = sc.nextFloat();       //area of circle
            float area = 3.14f * rad *rad;
            System.out.println(area); */ 

        /*int a = sc.nextInt();                  //Sum of a and b using scanner
        int b = sc.nextInt();
        //int sum = a+b;
        int product = a*b;
        System.out.println(product); */

     /* String input = sc.next();
        System.out.println(input);

     String name = sc.nextLine();
     System.out.println(name);
    
               Short chota = sc.nextShort();
               System.out.println(chota);
        
            Long num = sc.nextLong();
            System.out.println(num);

            boolean myBool = true;
            System.out.println(myBool);
*/   
      /* 
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);*/  

//boilerplate code