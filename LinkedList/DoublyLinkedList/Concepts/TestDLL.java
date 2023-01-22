package LinkedList.DoublyLinkedList.Concepts;

public class TestDLL {
    public static void main(String[] args) {
        DLL list= new DLL();
        list.InsertNode(5);
        list.InsertNode(4);
        list.InsertNode(3);
        list.InsertNode(2);
        list.InsertNode(1);
        list.display();
        list.displayREV();
        list.InsertEnd(6);
        list.display();
        list.InsertAfter(3, 32);
        list.display();
        list.InsertAfter(34, 32);
        list.display();
    }
}
