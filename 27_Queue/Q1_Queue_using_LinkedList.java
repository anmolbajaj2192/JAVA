package Queue;



public class Q1_Queue_using_LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public void add(int data){
            Node newNode = new Node(data);

            if(head == null){  //if element is added first time then head and tail will point to newNode
                head = tail = newNode;
                return;
            }

            //linked list exist karta hai pehle se
            tail.next = newNode;
            tail = newNode;
        }

        //remove 
        public int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data; //head ki value store karli front mein

            //single element
            if(tail == head){

            tail = head = null;

            }else{

                head = head.next;            
            }

            return front;            //wahi store value ko return kia
        }

        //peek
        public int peek(){    //O(1)
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
         Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3
       
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
