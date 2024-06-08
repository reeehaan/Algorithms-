import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("task 01");
        queue.add("task 02");
        queue.add("task 03");

        System.out.println(queue);
        //top element of the queue
        System.out.println(queue.peek());//task 01

        //removing the element in the queue
        System.out.println(queue.poll());//task 01
        System.out.println(queue.remove());//task 02

        System.out.println(queue.peek());//task 03
    }
}