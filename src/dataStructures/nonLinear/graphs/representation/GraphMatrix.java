package dataStructures.nonLinear.graphs.representation;
import java.util.Scanner;
public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> nodes
        // m -> edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMatrix = new int[n+1][n+1]; // 0-based indexing
        // Take the edges as input
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph u <--> v
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // Skip this line for directed
        }
        // Print the matrix
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
