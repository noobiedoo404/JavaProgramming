package LinkedList.DoublyLinkedList.Concepts;

public class DLL {
    private Node head;

    public void InsertNode(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void InsertEnd(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            // node.next=null;
            node.prev = temp;
        }
    }

    public void InsertAfter(int after, int value) {
        Node temp = head;
        while (temp.value != after) {
            temp = temp.next;
            if (temp.next == null) {
                System.out.println(after+" is not present in the list.");
                return;
            }
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("Φ");
        System.out.println();
    }

    public void displayREV() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            // System.out.print(temp.value+"->");
            last = temp;
            temp = temp.next;
        }
        // System.out.print(" Φ");
        // System.out.println();
        temp = last;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.print("Φ");
        System.out.println();
    }

    // making it private means that you cant access it outside the class "DLL"
    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node prev, Node next) {
        //     this.value = value;
        //     this.prev = prev;
        //     this.next = next;
        // }

    }
}
