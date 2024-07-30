package ArrayList;

import java.util.ArrayList;

public class MultiDimen {

    public static void main(String args[]){

       /* Multi- Dimensional Array sweet example
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);
        
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList); */

        ArrayList<ArrayList<Integer>> mainList2 =  new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList2.add(list1);
        mainList2.add(list2);
        mainList2.add(list3);

        list2.remove(2);
        list2.remove(3);

        System.out.println(mainList2);

        //nested loop
        for(int i=0; i<mainList2.size(); i++){
            ArrayList<Integer> currList = mainList2.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        
    }

    
}
