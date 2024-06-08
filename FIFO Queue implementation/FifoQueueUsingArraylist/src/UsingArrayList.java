import java.util.ArrayList;
import java.util.NoSuchElementException;

public class UsingArrayList <T> {
    private ArrayList<T> queue;
    public UsingArrayList(){
        queue = new ArrayList<>();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size of the queue
    public int getSize() {
        return queue.size();
    }

    public void enqueue(T data) {
        queue.add(data);
    }

    // Remove and return the front element of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.get(0); // get the element at index 0
    }
}
