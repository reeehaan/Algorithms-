public class FifoQueue {
    Node front, rear;
    int size;

    public FifoQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node temp = new Node(value);

        if (this.rear == null) {
            this.front = temp;
            this.rear = temp;
        } else {
            this.rear.next = temp;
            this.rear = temp;
        }

        this.size++;
    }

    public void deque() {
        if (this.front == null)
            return;

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        temp.next = null;

        this.size--;
    }

    public int peek() {
        if (this.front != null)
            return this.front.data;

        return Integer.MIN_VALUE;
    }

    public int size() {
        return this.size;
    }

    public void printQueue() {
        Node temp = this.front;

        System.out.print("Elements of Queue: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}



