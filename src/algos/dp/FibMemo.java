package algos.dp;
import java.util.Arrays;
public class FibMemo {
    public static int fib(int n, int[] dp){
         if(n <= 1){
             return n;
         }
         // Step 2: If we know the value, don't calculate, just return the answer
        if(dp[n] != -1){
            return dp[n];
        }
        // Step 3: Calculate if you don't have the answer
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    public static void main(String[] args) {
          int n = 6;
          // Step 1: Create a dp array of n + 1 values all -1
          int[] dp = new int[n+1];
          Arrays.fill(dp, -1);
        System.out.println("Fibonacci of " + n + "th number is " + fib(n, dp));
    }
}
