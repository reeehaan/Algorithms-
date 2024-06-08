public class Main {
    public static void main(String[] args) {
        UsingArrayList<Integer> queue = new UsingArrayList<>();

        System.out.println(queue.isEmpty());//true
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element is: " + queue.peek()); //1
        System.out.println("Removed element: " + queue.dequeue()); //1

        System.out.println("Front element is: " + queue.peek()); //2
        System.out.println("Queue size is: " + queue.getSize()); // size = 2

    }
}