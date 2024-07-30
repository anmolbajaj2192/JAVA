package BinaryTrees;
import java.util.*;

import javax.xml.crypto.dsig.keyinfo.KeyName;

public class Q5_LowestCommonAncestor {

    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){

        if(root == null){
            return false;
        }

        
        path.add(root);

        if(root.data == n){ //data found
            return true;
        }

        //data not found
        boolean foundLeft = getPath(root.left, n, path); //left subtree
        boolean foundRight = getPath(root.right, n, path);//right subtree

        if(foundLeft || foundRight){ //found 
            return true;
        }
        //not found
        path.remove(path.size()-1);//mere wala curr root path ka part nhi hai mtlb path se remove kardia currRoot ko which is at my last index
        return false;
    }

    public static Node lca(Node root, int n1, int n2){ //O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1); // root se lekar n1 tak ka path nikal liya
        getPath(root, n2, path2);// root se lekar n2 tak ka path nikal liya

        //Last Common Ancestor
        int i=0; 
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last eqaul node -ith  
        Node lca = path1.get(i-1); //i-1 isliye qki upar i par equal hue hai
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2); //Leftsubtree mein LCA cal. 
        Node rigthLca = lca2(root.right, n1, n2);//Right subtree mei LCA calculate.

        //leftLCA = val but rightLca = null
        if(rigthLca == null){
            return leftLca;
        }
        //vice versa
        if(leftLca == null){
            return rigthLca;
        }

        return root; // mtlb dono mein valid value hai (not null)
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return  0;
        }

        int leftDist = lcaDist(root.left, n); 
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDist(Node root, int n1, int n2){

        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        
        return dist1+dist2;
    }

    public static int KAncestor(Node root, int n, int k){
        
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;

    }
    public static void main(String[] args) {
          /*
                         1
                        / \
                       2   3
                      / \ / \
                     4  5 6  7

         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       /*  int n1=4, n2=5; */
       /*  System.out.println(lca2(root, n1, n2).data);
 */
        /* System.out.println(minDist(root, n1, n2)); */

        int n=5, k=1;
        KAncestor(root, n, k);

        
    }
    
}
