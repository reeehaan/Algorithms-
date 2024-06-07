public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(6);

        System.out.println( stack.isFull()); //false
        stack.push(5);
        stack.push(10);
        stack.push(15);

        stack.printStack(); //5, 10, 15

        stack.pop(); //pop 15
        stack.printStack();

        //check if the stack is empty or not
        System.out.println(stack.isEmpty());//false

        //check the top element
        System.out.println(stack.peek()); //10

        //pop element
        System.out.println(stack.pop());// 10
        System.out.println(stack.pop());// 5

        System.out.println(stack.isEmpty());//true
    }

}