package algos.greedy;

import java.util.ArrayList;
import java.util.List;
public class MinNumberOfCoins {
    public static void findMinCoins(int[] coins, int V){
        // Sort the array if it's not sorted
        List<Integer> result = new ArrayList<>();
        for (int i=coins.length - 1; i>=0; i--){
            while (V >= coins[i]){
                V -= coins[i];
                result.add(coins[i]);
            }
        }
        System.out.print("Coins selected: ");
        for (int x : result){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("The minimum number of coins is: " + result.size());
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,200,500,1000,2000};
        int V1 = 91, V2 = 31;
        findMinCoins(coins, V1);
        findMinCoins(coins, V2);
    }
}
