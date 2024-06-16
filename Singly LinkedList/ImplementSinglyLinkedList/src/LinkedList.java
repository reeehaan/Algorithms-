import org.w3c.dom.Node;

import static sun.util.locale.LocaleUtils.isEmpty;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        this.head = head;
        size = 0;
    }

    public int get(int index){
        if(index >= size || index < 0 ) return -1;
        Node node = head;
        for(int i = 0 ; i < index; i++) {
            node = node.next;
        }
        return node == null ? -1 : node.val;
    }


    public void addAtHead(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val){
        if (index < 0 || index > size) {
            return;
        }

        Node node = new Node(val);

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void getHeadValue() {
        if (head == null) {
            throw new IllegalStateException("LinkedList is empty");
        }
        System.out.println("Head value: " + head.val);
    }




    private static class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val= val;
            this.next = null;
        }
    }
}

