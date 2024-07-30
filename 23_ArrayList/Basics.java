import java.util.ArrayList;


public class Basics {
    //Java collection Framework
    //ClassName objectName = new Classname();
    public static void main(String args[]){
    //Java collection Framework
    //ClassName objectName = new Classname();
    ArrayList<Integer> list = new ArrayList<>();
   /*  ArrayList<Boolean> list2 = new ArrayList<>(); 
    ArrayList<String> list3 = new ArrayList<>(); */

    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);

   /*  list.add(1, 9);  // O(n) */
    
    System.out.println(list);

 /*    //Get operation - O(1)
    int element = list.get(2);
    System.out.println(element);

    //delete
    list.remove(2);
    System.out.println(list); 

    //Set element at index 
    list.set(2, 10);
    System.out.println(list);

    //Contains Element -> True or False
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));
    
    */

/*     //Size of AL -  .size()
    System.out.println(list.size());
     */

    //print the arrayList
    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i) + " ");
    }
    System.out.println();

    //Reverse Print
    for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i) + " ");
    }
    System.out.println();

    //Maximum

    int max = Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++){
     /*    if(list.get(i) > max){
            max = list.get(i);
        } */

        max = Math.max(max, list.get(i));
    }
    System.out.println("max element = " + max);



    }
}
