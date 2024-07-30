package BinarySearchTrees;

public class Q2_DeleteNode {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node delete(Node root, int val){
         if(root.data < val){
            root.right = delete(root.right, val);
         }
         else if(root.data > val){
            root.left = delete(root.left, val);
         }
         else{ //voila  -> woh node mil gayi jisko hume delete karna hai
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 - both childer
            Node IS = findInoderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node findInoderSuccessor(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
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
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        root = delete(root, 1);
        System.err.println();

        inorder(root);

    }
    
}  
