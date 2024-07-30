package BinaryTrees;
import java.util.*;


public class Q1_BuildTreePreOrderCode{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{ 
        static int idx = -1;
        public static Node buildTree(int nodes[]){ //yaha Node return hoga mtlb ROOT of a tree
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
             
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){  //O(n)
            if(root == null){
            // System.out.print("-1 "); //same q ko he print kar dia
                return;
            }
            
            System.out.print(root.data+" ");
            preorder(root.left);            //preorder ka recursive function
            preorder(root.right);

        }

        public static void inorder(Node root){ //O(n)
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postoder(Node root){ //O(n)
            if(root == null){
                return;
            }
            postoder(root.left);
            postoder(root.right);
            System.out.print(root.data+" ");

        }

        public static void levelorder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{ //agar null nhi hua tho woh data ko print kara lenge
                    System.out.print(currNode.data+ " ");

                    if(currNode.left != null){
                        q.add(currNode.left);
                    }

                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
    // System.out.println(root.data);

       // tree.preorder(root);
       //tree.inorder(root);
       //tree.postoder(root);
       tree.levelorder(root);
    }

}