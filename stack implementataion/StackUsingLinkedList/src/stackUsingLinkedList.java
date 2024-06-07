public class stackUsingLinkedList {
    private Node top;

    public stackUsingLinkedList(){
        this.top = null;
    }

    public boolean push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        return true;
    }
    //Pops the top element from the stack. Returns -1 if the stack is empty.
    public int pop(){
        if(top == null){
            return -1;
        }
        else{
            int data = top.data;
            top = top.next;
            return data;
        }
    }
    // Returns the topmost element of the stack.
    public int top(){
        if(top == null){
            return -1; //if stack is empty
        }
        else{
            return top.data;
        }
    }
    //Returns true if the stack is empty, otherwise false
    public boolean isEmpty() {
        return top == null;
    }

    //size of the stack
    public int size(){
        int size = 0;
        Node current = top;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
