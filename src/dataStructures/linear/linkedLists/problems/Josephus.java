package dataStructures.linear.linkedLists.problems;
public class Josephus {
    static int solve(int n, int k){
        // Base Case
        if(n == 1){
            return 0;
        }
        return (solve(n-1, k) + k) % n;
    }
    public static int findTheWinner(int n, int k) {
        int winner = solve(n,k) + 1; // Add 1 for 1-based indexing
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(1,2));
    }
}
