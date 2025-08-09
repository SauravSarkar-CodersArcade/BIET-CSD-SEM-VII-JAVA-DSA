public class Main {
    public static void main(String[] args) {
        int n = 10;
        String res = (n % 2 == 0) ? "true" : "false";
        System.out.println((n % 2 == 0) ? "true" : "false");
        System.out.println(res);
        int status = (n % 2 == 0) ? 1 : 0;
        // return_type var_name = (condition) ? trueValue : falseValue;
        int a = 10;
        int b = 20;
        System.out.println(--a + b++);
        System.out.println("a=" + a + " b=" + b);
        System.out.println("Max: " + Integer.MAX_VALUE);
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
    }
}