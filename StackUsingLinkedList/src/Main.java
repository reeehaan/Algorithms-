public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);
        stk.display();
        System.out.printf("\nTop element is %d\n", stk.peek());
        System.out.println("Stack after popping 2 times");
        stk.pop();
        stk.pop();
        stk.display();
        System.out.printf("\nTop element is %d\n", stk.peek());
    }
}