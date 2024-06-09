public class Main {

    public static void main(String[] args) {
        Steque<String> steque = new Steque<>();

        // Push elements to the steque
        steque.push("Regular Task 1");
        steque.push("Regular Task 2");
        steque.push("Regular Task 3");

        // Enqueue elements to the steque
        steque.enqueue("High priority task 1");
        steque.enqueue("High priority task 2");

        // Pop elements from the steque
        System.out.println("Pop: " + steque.pop()); // regular task 3
        System.out.println("Pop: " + steque.pop()); // regular task 2
        System.out.println("Pop: " + steque.pop()); // regular task 1
         //Print remaining elements
        while (!steque.isEmpty()) {
            System.out.println("Pop: " + steque.pop());
        }
    }
}