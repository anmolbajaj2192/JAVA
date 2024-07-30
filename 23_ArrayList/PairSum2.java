package ArrayList;

import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum2(ArrayList<Integer>list, int target){

    int bp=-1; //Breaking point i.e. PIVOT
    
    for(int i=0; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            bp=i;
            break;
        }
    }

    int lp=bp+1; //smallest
    int rp=bp;   //largest
    int n = list.size();

    while(lp != rp){
        if(list.get(lp)+list.get(rp) == target){
            return true;
        }

        //case:2
        if(list.get(lp) + list.get(rp) < target){
            lp = (lp+1) % n;
        }//case3:
        else{
            rp = (n + rp -1) % n;
        }
    }
    return false;
}

    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();

        //11 15  6 8  9 10- sorted & rotated 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;
        System.out.println(pairSum2(list, target));

    }
    
}
