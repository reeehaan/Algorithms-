import static java.lang.System.exit;

public class Stack {

    private class Node{
        int data;
        Node next;
    }
    Node top;

    Stack(){
        this.top = null;
    }

    public void push(int value){
        Node dummy = new Node();

        if(dummy == null){
            System.out.print("\nStack Overflow");
            return;
        }
        dummy.data = value;
        dummy.next = top;
        top = dummy;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).next;
    }

    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.next;
            }
        }
    }
}
