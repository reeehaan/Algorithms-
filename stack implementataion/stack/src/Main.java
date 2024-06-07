import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.isEmpty());
        stack.push("Minecraft");
        stack.push("Spiderman");
        stack.push("last of us II");
        stack.push("DOOM");

        //System.out.println(stack);

        stack.pop();

        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        System.out.println(stack.peek());

    }
}