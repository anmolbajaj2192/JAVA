package BinarySearchTrees;

public class Q5_ValidateBST {
     static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
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

    public static boolean isValidBST(Node root, Node min, Node max){ //min & max is null 
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){//Invalid BST
            return false;
        }

        else if(max != null && root.data >= max.data){//Invalid BST
            return false;
        }
        
        return isValidBST(root.left, min, root)
               && isValidBST(root.right, root, max);

    }
    public static void main(String[] args) {
        int values[] = {1,1,1};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    
}
