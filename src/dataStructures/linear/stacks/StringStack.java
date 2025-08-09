package dataStructures.linear.stacks;
public class StringStack {
    private static final int MAX_SIZE = 100;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1; // The stack is empty in the beginning
    public void push(String data){
        if(top == MAX_SIZE - 1){
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = data;
        System.out.println("Pushed: " + data + " onto the stack...!");
    }
    public String pop(){
        // If the stack is empty, can't remove the top element
        if(top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        String popped = arr[top--];
        return popped;
    }
    public String peek(){
        // If the stack is empty, can't view the top element
        if(top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        return arr[top];
    }
    public boolean isFull(){
        return (top == MAX_SIZE - 1);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public int size(){
        return top + 1;
    }
    public void displayStack(){
        // If the stack is empty, can't remove the top element
        if(top == -1){
            System.out.println("Stack Underflow.");
            return;
        }
        for (int i=0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.push("Mango");
        stack.push("Avocado");
        stack.push("Guava");
        System.out.println(stack.size());
        String popped = stack.pop();
        System.out.println(popped);
        stack.push("Pineapple");
        stack.push("Banana");
        stack.displayStack();
        System.out.println(stack.peek());
    }

}
