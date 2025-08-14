package algos.dp;
import java.util.Arrays;
public class FibTabulation {
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        // Step 1: Create a dp array of n + 1 values all -1
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        // Step 2: Store the known values 0 & 1
        dp[0] = 0;
        dp[1] = 1;
        // Step 3 : Calculate the unknown values
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + "th number is " + fib(n));
    }
}
