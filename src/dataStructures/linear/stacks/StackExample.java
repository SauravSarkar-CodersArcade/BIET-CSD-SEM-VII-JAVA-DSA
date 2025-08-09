package dataStructures.linear.stacks;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Current Size: " + stack.size());
        Stack<Object> objects = new Stack<>();
        objects.push(1);
        objects.push("Ajay");
        System.out.println(objects);
    }
}
