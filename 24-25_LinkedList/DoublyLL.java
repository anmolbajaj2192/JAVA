package LinkedList;

public class DoublyLL{

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; 

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //print 
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){ //to resolve that line error
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;  //line error
        size--;
        return val;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            tail = head = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        //newNode.next = null;
    }

    //removeLast
    public int removeLast(){
        if(tail == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = tail.data;
            tail = null;
            head = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null; //line error
        size--;
        return val;
    }

    public void reverse(){
        
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }


     
    
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();

        /*dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();
        System.err.println(dll.size);

        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);

        dll.removeLast();
        dll.print();
        System.out.println(dll.size);*/
        
    }
}