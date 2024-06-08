public class Main {
    public static void main(String[] args) {
        DequeUsingTwoQueues deque = new DequeUsingTwoQueues();

        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(30);
        deque.addRear(40);

        System.out.println("Removed from front: " + deque.removeFront()); // 10
        System.out.println("Removed from rear: " + deque.removeRear());   // 20
        System.out.println("Removed from front: " + deque.removeFront()); // 30
        System.out.println("Removed from rear: " + deque.removeRear());   // 40
    }
}