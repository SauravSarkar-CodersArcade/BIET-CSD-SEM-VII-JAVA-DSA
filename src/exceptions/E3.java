package exceptions;
public class E3 {
    public static void main(String[] args) {
        try {
            // If you want to throw a forceful exception
            throw new Throwable("This is a custom Throwable Exception");
        }catch (Throwable t){
            System.out.println("Caught Throwable.");
            // Print the message
            System.out.println("Message: " + t.getMessage());
            // Name of the class
            System.out.println("Class: " + t.getClass().getName());
            // Get the stack trace
            System.out.println("Stack Trace: ");
            t.printStackTrace();
        }
    }
}
