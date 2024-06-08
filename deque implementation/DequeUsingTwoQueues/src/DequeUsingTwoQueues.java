import java.util.LinkedList;
import java.util.Queue;
public class DequeUsingTwoQueues {



        private Queue<Integer> frontQueue;
        private Queue<Integer> rearQueue;

        public DequeUsingTwoQueues() {
            frontQueue = new LinkedList<>();
            rearQueue = new LinkedList<>();
        }

        // Adds an element at the front of the deque
        public void addFront(int element) {
            frontQueue.offer(element);
        }

        // Adds an element at the rear of the deque
        public void addRear(int element) {
            rearQueue.offer(element);
        }

        // Removes an element from the front of the deque
        public int removeFront() {
            if (frontQueue.isEmpty()) {
                while (!rearQueue.isEmpty()) {
                    frontQueue.offer(rearQueue.poll());
                }
            }
            if (!frontQueue.isEmpty()) {
                return frontQueue.poll();
            }
            throw new IllegalStateException("Deque is empty");
        }

        // Removes an element from the rear of the deque
        public int removeRear() {
            if (rearQueue.isEmpty()) {
                while (!frontQueue.isEmpty()) {
                    rearQueue.offer(frontQueue.poll());
                }
            }
            if (!rearQueue.isEmpty()) {
                return rearQueue.poll();
            }
            throw new IllegalStateException("Deque is empty");
        }

        // Checks if the deque is empty
        public boolean isEmpty() {
            return frontQueue.isEmpty() && rearQueue.isEmpty();
        }

        // Returns the size of the deque
        public int size() {
            return frontQueue.size() + rearQueue.size();
        }


}


