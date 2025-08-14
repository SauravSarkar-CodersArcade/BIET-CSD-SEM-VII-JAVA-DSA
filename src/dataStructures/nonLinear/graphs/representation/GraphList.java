package dataStructures.nonLinear.graphs.representation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GraphList {
    public static void main(String[] args) {
        // n -> nodes
        // m -> edges
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // List< Inner List is not initialized >
        List<List<Integer>> adjList = new ArrayList<>();
        // We need to initialize each inner list
        for (int i=0; i<=n; i++){
            adjList.add(new ArrayList<>());
        }
        // Now we need to input the edges
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Just skip this line for a directed graph
        }
        // Print the adjacency list
        for (int i=1; i<=n; i++){
            System.out.print("Node " + i + ": List of neighbours --> ");
            for (int v : adjList.get(i)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
