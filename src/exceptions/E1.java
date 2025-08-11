package exceptions;
public class E1 {
    {
        System.out.println("Instance Initializer Block - 2");
    }
    public static void main(String[] args) {
        new E1();
        int i, j, k=0;
        i = 10;
        j = 10;
        try {
            k = i / j; // Intellisense
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[100]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Some error occurred...!!!");
            // e.printStackTrace(); // This gives a detail of the exception
        }catch (Exception e){
            System.out.println("Something unexpected happened.");
        }finally {
            System.out.println("I will execute no mater what...!!");
        }
        System.out.println("The value of k is: " + k);
    }
    static {
        System.out.println("Start");
    }
    {
        System.out.println("Instance Initializer Block - 1");
    }
}
