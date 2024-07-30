public class StringsQuestion{


    public static void main(String args[]){
        /* Q1. Count how many times lowercase vowels occurred in a String entered by the user.

        String str = new Scanner(System.in).next(); 
        int count = 0;
    

        for(int i=0; i<str.length(); i++ ){

            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Count of a vowels is :" + count); */
        
       /* Q2. what will be the output of the following code
       // output: false true
       //why?
       //The equals() method compares two strings, and returns true if the strings are equal, and false if not. 
       //Tip: Use the compareTo() method to compare two strings lexicographically.

        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1)+ " " + str.equals(str2)); */
        
        /* Q3. what will be the output of the following code
        //OUTPUT: ApnaCoege
        //HOW?
        //replace() method searches a string for a specified character, 
          and returns a new string where the specified character(s) are replaced.
        String str="ApnaCollege".replace("l",""); 
        System.out.println(str); */

        /* // Q4. Determine if 2 Strings are anagrams of each other.What are anagrams?

      //  If two strings contain the same characters but in a different order,they can be said to be anagrams.Consider race and care.
       // In this case,race's characters can be formed into a study,or care's characters can be formed into race.
       // Below is a java program to check if two strings are anagrams or not. 

        String str1 = "earth";
        String str2 = "heart";

        //Convert Strings to lowercase. 
        //WHY?
        //SO that we dont have to check separtely for lowercase & uppercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //First Check - if length are same 
        if(str1.length() == str2.length()){

            //convert STRINGS into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted char arrays are same or identical then the strings are ANAGRAM

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagram of each other ");
            }else{
                System.out.println(str1 + " " + str2 + " are not a anagram of each other ");
            }
        }else{

            //case where length are not equal
            System.out.println(str1 + " " + str2 + " are not a anagram of each other ");
        }
 */

 /* Question 5 :Search and read about
a. intern() method in String:
    https://www.geeksforgeeks.org/interning-of-string/

b. StringBuffer:
   https://www.geeksforgeeks.org/stringbuffer-class-in-java/
 */
    }
}    