
/**
 * Steque is a stack-ended data structure which
 * supports stack operations as well as queue's
 * enqueue operation.
 * */
public class Steque<T> {

        private Node<T> front;
        private Node<T> back;
        private int size;

        private static class Node<T> {
            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }
        }

        public Steque() {
            front = null;
            back = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        // Push to the front of the steque
        public void push(T item) {
            Node<T> newNode = new Node<>(item);
            if (isEmpty()) {
                front = newNode;
                back = newNode;
            } else {
                newNode.next = front;
                front = newNode;
            }
            size++;
        }

        // Pop from the front of the steque
        public T pop() {
            if (isEmpty()) {
                throw new RuntimeException("Steque underflow");
            }
            T item = front.data;
            front = front.next;
            size--;
            if (isEmpty()) {
                back = null;
            }
            return item;
        }

        // Enqueue to the back of the steque
        public void enqueue(T item) {
            Node<T> newNode = new Node<>(item);
            if (isEmpty()) {
                front = newNode;
                back = newNode;
            } else {
                back.next = newNode;
                back = newNode;
            }
            size++;
        }

}


