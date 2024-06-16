public class Main {
    public static void main(String[] args) {
        FifoQueue queue = new FifoQueue();
        queue.enqueue(10);
        queue.enqueue(20);

        queue.printQueue();
        System.out.println("Size :" + queue.size());
        queue.deque();
        queue.deque();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        System.out.println("Size :" + queue.size());
        System.out.println("Front item is: " + queue.peek());
    }
}