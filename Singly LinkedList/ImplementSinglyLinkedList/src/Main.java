public class Main {
    public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    linkedList.addAtHead(10);
    linkedList.addAtIndex(2,52);
    linkedList.addAtHead(12);
    linkedList.addAtHead(40);
    linkedList.addAtHead(67);
    linkedList.addAtTail(55);
    linkedList.deleteAtIndex(3);
    linkedList.printLinkedList();
    linkedList.getHeadValue();
    }
}