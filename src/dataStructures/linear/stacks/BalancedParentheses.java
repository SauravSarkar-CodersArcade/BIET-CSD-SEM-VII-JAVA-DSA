package dataStructures.linear.stacks;
import java.util.Stack;
public class BalancedParentheses {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch); // Push open braces into the stack
            }else {
                if(!stack.empty()){
                    if((stack.peek() == '{' && ch == '}') ||
                       (stack.peek() == '[' && ch == ']') ||
                       (stack.peek() == '(' && ch == ')')){
                        stack.pop(); // remove matching braces from the stack
                    }
                }else {
                    return false;
                }
            }
        }
        // If the stack became empty after the comparisons, return true
        return stack.empty();
    }

    public static void main(String[] args) {
        String s1 = "[]{()[]}";
        String s2 = "[}{{)]";
        System.out.println(isBalanced(s1) ? "Balanced" : "Not Balanced");
        System.out.println(isBalanced(s2) ? "Balanced" : "Not Balanced");
    }
}
