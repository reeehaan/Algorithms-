public class Stack {
    private int cap;
    private int[] stack;
    private int top;

    public  Stack(int cap){
        this.cap = cap;
        this.stack = new int[cap];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
        return top == cap - 1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return stack[top];
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

}

