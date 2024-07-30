package LinkedList;

import LinkedList.LinkedList.Node;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
		public Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    //Defined as Property in a class i.e. LinkedList
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods - elements add(), remove(), print(), search()

    /*
    Since main function is static so it can call only static functions.
    with the help of linkedlist object i.e. ll we we call, so objects are
    static or non static it doesnt matter.
    */
    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        //Base case:
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;  //link

        //step3 - head = newNode
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        //Bydefault -> if head is null -> LL is EMPTY i.e. head == null
        //Base case:
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){ //O(n)

      /*   //base case:
        if(head == null){
            System.out.println("LL is EMPTY");
            return;
        } */
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
    public void add(int idx, int data){
        //SPECIAL CASE: 
        if(idx == 0){
            addFirst(data);
            return;
        }
        //add opertion -> create newNode
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){

        //Special case:
        //case 1:
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        //case2:
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail =  null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){ //O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){ //key FOUND
                return i;
            }
            temp = temp.next;
            i++;
        }
         
        //key not found
        return -1;
    }

    //helper function-> ACTUAL RECURSIVE FUNCTION
    public int helper(Node head, int key){  //O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){

        return helper(head, key);
    }

    public void reverse(){
        Node prev =null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            //4Step process:

            //1. next banyega
            next = curr.next;
            //2. REVERSE:
            curr.next = prev;
            //3.  
            prev = curr;
            //4. 
            curr = next;
        }

        head = prev; //head ki value prev jitni hogi
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //corner case: 
        if(n == sz){
            head = head.next; //removeFirst
            return;
        }

        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;

        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        //Corner case:
        if(head == null || head.next == null){
            return true;
        }

        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode; //single change of initialization than a reverse code
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle(){  //Floyd's CFA
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2

            if(slow == fast){
                return true;   //cycle exists
            }
        }
        return false;  //cycle doesnt exist
    }

    public static void removeCycle(){
        
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                    cycle = true;
                    break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point 
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev =fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }

    //Merge Sort In linkedList  O(nlogn)

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp=temp.next;
            }else{
                temp.next = head2;
                head2 =head2.next;
                temp=temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head1;
            head1 =head1.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        //Base case:
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        
            //find mid
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;
             
            //reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;
    
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
    
            Node left = head;
            Node right = prev;
            Node nextL, nextR;
    
            //alt merge - zig-zag merge
            while(left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;
    
                left = nextL;
                right = nextR;
            }

    }

public static void main(String[] args) { 

    LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    //1->2->3->4->5
    ll.print();
    ll.zigZag();
    ll.print();

    /* 
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    //5->4->3->2->1

    ll.print();
    ll.head = ll.mergeSort(ll.head);
    ll.print(); 
    */
    

   /*  head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;

    //1->2->3->2
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle()); */

    /* LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(2);
   // ll.addLast(1);

    ll.print();  //1 -> 2 -> 2 -> 1
    System.out.println(ll.checkPalindrome()); */
    
    /* ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(4);
    ll.print();
    ll.addLast(5);
    ll.print();
    ll.add(2, 3);
    ll.print(); */    //1->2->3->4->5->null i.e. size = 5
    
    //System.out.println(ll.size);
    /* ll.removeFirst();
    ll.print();
    ll.removeLast();
    ll.print(); */
    
   /*  System.out.println(ll.itrSearch(3));
    System.out.println(ll.itrSearch(10)); */
    /* System.out.println(ll.recSearch(3));
    System.out.println(ll.recSearch(10));

    ll.reverse();
    ll.print(); */

    
    /* ll.deleteNthfromEnd(3);
    ll.print(); */



    }


    
}
