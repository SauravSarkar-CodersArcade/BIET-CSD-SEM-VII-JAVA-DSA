package algos.dp;
public class FibRec {
    static int fib(int n){
        if ( n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + "th number is " + fib(n));
    }
}
