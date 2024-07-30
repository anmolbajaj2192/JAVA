
public class Strings{

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalimdrome(String str){

        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palimdrome
                return false;
            }  
        }
        return true;  
    }

    public static float shortestPath(String path){
        int x = 0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    
    public static String subString(String str, int si, int ei){

        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;

    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String compress(String str){
        /* String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr; */
        //StringBuilder
        StringBuilder sb = new StringBuilder("");

        char ch = str.charAt(0);
        int count = 1;

        for(int i=1; i<str.length(); i++){

            if(str.charAt(i) == ch){
                count++;
            }else{
                if(count > 1){
                    sb.append(""+ch+count);
                }else{
                    sb.append(ch);
                }

                count = 1;
                ch = str.charAt(i);
            }
        }
            
            //sb.append(ch);
            if(count > 1){
                sb.append(""+ ch + count);
            }else{
                sb.append(ch);
            }
        
        return sb.toString();

        

    }
    public static void main(String args[]){

        String str = "aaaabbbccddd";
        System.out.println(compress(str));

        

        

        /* 
        Convert Letters to UpperCase
        String str = "hi, i am shradha";
        System.out.println(toUpperCase(str)); */


/* StringBuilder
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }//O(26)  ---> StringBuilder ka Kamaal --> O(n)
        //(26 * n^2) --> O(n^2) if use " + " operator since it would copy the string from previous and create a new object.
        System.out.println(sb);
        System.out.println(sb.length()); */

     /* //Substring
        String str = "HelloWorld";
      //  System.out.println(subString(str, 0, 5));

      //Shortcut
     System.out.println(str.subSequence(0, 5)); */ 

        /* String Function - Compare 
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

         if(s1 == s2){
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } 

         if(s1 == s3){
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } 

        if(s1.equals(s3)){   // to check value for equality of a string
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } */
    
        /* Print Largest String
        String fruits[] = {"apple", "mango","banana"};

        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println(largest); */
        
/*
 String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
 */
        
/*  String str = "racecar";
        System.out.println(isPalimdrome(str));*/
       



        //Strings can be define as given below
        /*char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz@#1234");*/
        
        //Strings are IMMUTABLE

        /* //INPUT a string        
         Scanner sc = new Scanner(System.in);
         String name;

         //name = sc.next();
         name =  sc.nextLine();
         //Output 
         System.out.println(name); */

         /* //String Length
         String fullName = "Tony Stark";
         System.out.println(fullName.length());
 */
/*    //conatenation
         String firstName = "Anmol";
         String lastName = "Bajaj";
         String fullname = firstName + " " + lastName;
         System.out.println(fullname);

        //String charAt Method
         System.out.println(fullname.charAt(0));

         printLetters(fullname);
         */
      
    }
}