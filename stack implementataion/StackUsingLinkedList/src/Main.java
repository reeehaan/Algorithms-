public class Main {
    public  static void main(String[] args) {
        stackUsingLinkedList stack = new stackUsingLinkedList();
        System.out.println(stack.push(20));//true
        System.out.println(stack.push(40));//true
        System.out.println(stack.push(60));//true
        System.out.println(stack.push(80));//true

        //print stack node
        stack.printStack();
        //check peek node
        System.out.println("Top element: " + stack.top()); //return 80
        //node pop
        System.out.println("Popped element: " + stack.pop());//80
        //node pop
        System.out.println("Popped element: " + stack.pop());//60
        //check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());//false
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());//true

        System.out.println("Top element: " + stack.top());//stack is empty, return -1
    }
}