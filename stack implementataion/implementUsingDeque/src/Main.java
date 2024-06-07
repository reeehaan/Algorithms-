import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Deque <String> stack = new ArrayDeque<>();

        stack.push("Minecraft");
        stack.push("Spiderman");
        stack.push("DOOM");
        stack.push("Elder Ring");
        stack.push("Witcher");

        //printing the stack.
        System.out.println(stack);

        //top element of the stack
        System.out.println(stack.peek());// top element is "Witcher"

        //pop element from the stack
        System.out.println(stack.pop());//pop "Witcher"

        String myFavGame = stack.pop();
        System.out.println(myFavGame); //Elder Ring

        //check if the stack is empty
        System.out.println(stack.isEmpty()); // return false

        stack.pop();
        stack.pop();
        stack.pop();
        //check if the stack is empty
        System.out.println(stack.isEmpty());// return true
    }
}