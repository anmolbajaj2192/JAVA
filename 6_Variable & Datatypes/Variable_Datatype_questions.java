import java.util.*;

public class Variable_Datatype_questions{
    public static void main(String args[]){       
        Scanner sc = new Scanner(System.in);
        


    /* Q5 

    int $ = 12;

     ---> no, the statement will not give any error.
     Names of variables are called IDENTIFIERS  in Java.
     Identifier rule says, identifiers can start with 
     any alphabet or underscore("_") or dollar ("$").
     According to the rule the give variable name is a 
     valid identifier.
     
     */
     
     
     /*Q4.

       in the mentioned code, the result variable will be
       of double type becasue of TYPE CONVERSION.

      */




        /* 
        Q3. Enter cost of 3 items from the user (using float datatype)
            - a pencil, a pen and a eraser. You have to output the total
            cost of the items back to the user as their bill.
            (Add on: You can also try adding 18% gst to the items in 
            the bill as an advanced problem)

        float pencil = sc.nextFloat();   ]
        //System.out.println(pencil);

        float pen = sc.nextFloat();
      // System.out.println(pen);

        float eraser = sc.nextFloat();
       // System.out.println(eraser);

        float total = (pencil + pen + eraser);
        System.out.println("Total price : " + total);

        //Add on - with 18% tax

        float gst = (total * 0.18f);
        System.out.println("gst appicable on given products :" + gst);

        float newTotal = total + gst;
        System.out.println("Bill with 18% tax : " + newTotal);
        */
        
         





        /* 
      Q2. In a program, input the side of a square. You have
          to output the area of the square.
          (Hint: area of square is (side*side))

        int side = sc.nextInt();        

        int area = (side*side);
        
        System.out.println("area of the square is : " + area);
      */



      
      /* 
        Q1. In a program input a 3 numbers:
            A,B,C. You have to output the 
            average of these 3 numbers
            (Hint: Average of N numbers is
              sum of those numbers divided 
              by N )
    
        int a = sc.nextInt();               
        System.out.println(a);

        int b = sc.nextInt();
        System.out.println(b);

        int c = sc.nextInt();
        System.out.println(c);

        int avg = (a+b+c)/3;
        System.out.println("average is : " + avg);

      */
        
    }
}