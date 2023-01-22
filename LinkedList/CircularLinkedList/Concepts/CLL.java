package LinkedList.CircularLinkedList.Concepts;

public class CLL {

    private Node head;

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            node.next = node;
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        head = node;
    }

    public int delete(int value) {
        Node temp = head;
        int val;
        if (temp == null) {
            return -1;
        }
        if (head.value == value) {
            val = head.value;
            head = head.next;
            return -1;
        }
        while (temp.next.value != value) {
            temp = temp.next;
            if (temp.next == head) {
                return -1;
            }
        }
        val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }

    public void display() {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head;
        // while (temp.next != head) {
        // System.out.print(temp.value + "->");
        // temp = temp.next;
        // }
        // System.out.print(temp.value + "->" + temp.next.value);
        // System.out.println();
        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.print("Start");
        System.out.println();

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        // this.value = value;
        // this.next = next;
        // }

    }
}
