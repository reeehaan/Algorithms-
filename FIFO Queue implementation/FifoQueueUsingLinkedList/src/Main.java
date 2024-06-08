import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("Rehan");
        queue.offer("Vinsika");
        queue.offer("Hareen");
        queue.offer("kavindu");
        queue.offer("Nirodha");


        System.out.println("!-----------Call center-----------!");
        for(int i = 1 ; i <= queue.size(); i++){
            System.out.println(i+" "+"Customer is " + queue.poll());
        }


        // Peek at the front of the queue
        System.out.println("Peek: " + queue.peek());
    }
}