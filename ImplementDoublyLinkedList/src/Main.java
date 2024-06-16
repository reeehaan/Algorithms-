public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtEnd(1);
        doublyLinkedList.insertAtEnd(2);
        doublyLinkedList.insertAtEnd(3);
        doublyLinkedList.insertAtEnd(4);
        doublyLinkedList.insertAtEnd(5);

        System.out.print("After insertion at tail: ");
        doublyLinkedList.display(doublyLinkedList.head);


        System.out.print("After insertion at head: ");
        doublyLinkedList.insertAtBeginning(0);
        doublyLinkedList.display(doublyLinkedList.head);


        doublyLinkedList.insertAtPosition(6, 2);
        System.out.print("After insertion at 2nd position: ");
        doublyLinkedList.display(doublyLinkedList.head);


        doublyLinkedList.deleteAtBeginning();
        System.out.print("After deletion at the beginning: ");
        doublyLinkedList.display(doublyLinkedList.head);


        doublyLinkedList.deleteAtEnd();
        System.out.print("After deletion at the end: ");
        doublyLinkedList.display(doublyLinkedList.head);


        doublyLinkedList.delete(2);
        System.out.print("After deletion at 2nd position: ");
        doublyLinkedList.display(doublyLinkedList.head);
    }
}