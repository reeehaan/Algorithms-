public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;

    }
    public void traverseForward()
    {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void traverseBackward()
    {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public void insertAtBeginning(int value){
        Node dummy = new Node(value);
        if(head == null){
            head = dummy;
            tail = dummy;
        }
        else{
            dummy.next = head;
            head.prev = dummy;
            head = dummy;
        }
    }

    public void insertAtEnd(int value){
        Node dummy = new Node(value);
        if(tail == null){
            head = dummy;
            tail = dummy;
        }
        else{
            tail.next = dummy;
            dummy.prev = tail;
            tail = dummy;
        }
    }

    public void insertAtPosition(int value , int position){
        Node dummy = new Node(value);
        if(position == 1){
            insertAtBeginning(value);
        }else{
            Node current = head;
            int currPosition = 1;
            while (current != null && currPosition < position);
            current = current.next;
            currPosition++;

            if (current == null) {
                insertAtEnd(value);
            }
            else{
                dummy.next = current;
                dummy.prev = current.prev;
                current.prev.next = dummy;
                current.prev = dummy;
            }
        }
    }

    public void deleteAtBeginning(){
        if(head == null) {
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node dummy = head;
        head = head.next;
        head.prev = null;
        dummy.next = null;
    }

    public void delete(int position){
        if(head == null){
            return;
        }
        if(position == 1){
            deleteAtBeginning();
            return;
        }
        Node  current = head;
        int count = 1;

        if(current != null && count != position){
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position wrong");
            return;
        }

        if (current == tail) {
            deleteAtEnd();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }

    public void deleteAtEnd()
    {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
    public void display(Node head)
    {
        Node dummy = head;
        while (dummy != null) {
            System.out.print(dummy.data + " --> ");
            dummy = dummy.next;
        }
        System.out.println("NULL");
    }


}
