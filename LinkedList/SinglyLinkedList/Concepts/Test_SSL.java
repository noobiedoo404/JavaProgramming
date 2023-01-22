package LinkedList.SinglyLinkedList.Concepts;

public class Test_SSL {
    public static void main(String[] args) {
        SLL list=new SLL();
        // System.out.println;
        list.insertNode(15);
        list.insertNode(4);
        list.insertNode(7);
        list.insertNode(23);
        list.insertAtEnd(34);
        list.display();
        // list.insertWithIndex(55,3);
        // list.display();
        // list.insertWithIndex(53,6);
        // list.display();
        // list.insertWithIndex(54,1);
        // list.display();
        // System.out.println("Deleted item- "+list.deletelast());
        // System.out.println("Deleted item-> "+list.deleteWtihIndex(69, 3));
        // list.display();
        // System.out.println(list.findNode(4));
        list.insertRec(9,  2);
        list.display();
        // list.display();
        
    }
}
