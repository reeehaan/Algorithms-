public class Main {
    public static void main(String[] args) {
        CircularFIFOQueue circularQueue = new CircularFIFOQueue(5);

        System.out.println(circularQueue.isEmpty());//true

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);

        System.out.println("Peek: " + circularQueue.peek()); //peek 10

        System.out.println("Dequeue: " + circularQueue.dequeue());//10

        System.out.println("Peek after dequeue: " + circularQueue.peek()); //20

        System.out.println(circularQueue.isEmpty()); //false

    }
}