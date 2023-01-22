package LinkedList.SinglyLinkedList.Concepts;

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // insert at the very beginning
    public void insertNode(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // insert at the end
    public void insertAtEnd(int value) {
        Node node = new Node(value);

        // with tail pointer
        // by using tail pointer,the insertion at the end can be done in O(1) time.

        // if(tail==null){
        // insertNode(value);
        // return;
        // }
        // tail.next=node;
        // tail=node;

        // without using tail pointer
        if (head == null) {
            insertNode(value);
            size++;   
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;

    }

    // insert anywhere
    public void insertWithIndex(int value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            insertNode(value);
        } else if (index == size-1) {
            insertAtEnd(value);
        }

        else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }

    //insert using recursion 

    public void insertRec(int val, int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val, index-1, node.next);
        return node;
    }

    // delete from first
    public int deletefirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // delete from last
    public int deletelast() {

        if (head.next == null) {
            return deletefirst();
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = null;
        size--;
        return val;
    }

    // delete from anywhere
    public int deleteWtihIndex(int value, int index) {

        if (index == 0) {
            deletefirst();
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        return val;
    }
    //find node containing the value
    public Node findNode(int value){
        Node temp=head;
        while (temp!=null) {
            if(temp.val==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    //length of the cycle
    public int cycleLength(Node head){
        Node fast=head;
        Node slow=head;
        int count=0;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    //finding the start of the cycle
    // 1. Find the length of the cycle
    // 2. move first pointer length of the cycle times.
    // 3. Then move two pointers one by one. Once they meet,thats the start of the cycle.

    

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        // System.out.print(tail.val);
        System.out.print(temp.val);
        System.out.println();
    }

}
