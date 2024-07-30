package BinarySearchTrees;


public class Q1_BuildBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            //bydefault left & right is null
        }
    }

    public static Node insert(Node root, int val){
            if(root == null){
                root = new Node(val); //New node create kia aur usse root bana dia
                return root;
            }

            if(root.data > val){
                //left subtree
                root.left = insert(root.left, val);
            }else{
                //right subtree
                root.right = insert(root.right, val);
            }

            return root;

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){ //O(H)
        if(root == null){ 
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
            
        }else{
            return search(root.right, key); 
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7}; 
        /* HW: int values[] = {5, 2, 8, 10, 1, 3, 6, 4, 9, 7}; */
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(search(root, 6)){
            System.out.println("found");
        }else{
            System.out.println("Not found ");
        } 

        
    }
    
}
