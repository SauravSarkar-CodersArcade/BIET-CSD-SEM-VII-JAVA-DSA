package dataStructures.nonLinear.graphs.traversals;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList){
        List<Integer> bfs = new ArrayList<>(); // This is to store output
        boolean[] visited = new boolean[V+1]; // 0-based indexing
        Queue<Integer> q = new LinkedList<>();
        // BFS starts from the starting node
        // Mark the starting node as visited
        visited[1] = true;
        // Push the starting node into the queue
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node); // Store in the output
            // Traverse all of its neighbours if they are not visited
            for (int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    // If not visited, mark as visited & add to queue
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
public class BFSGraph {
    public static void main(String[] args) {
        int V = 5;
        // List< Inner List is not initialized >
        List<List<Integer>> adjList = new ArrayList<>();
        // We need to initialize each inner list
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList, 1,2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 1,4);
        addEdge(adjList, 2,4);
        addEdge(adjList, 3,4);
        addEdge(adjList, 3,5);
        addEdge(adjList, 4,5);
        GraphBFS obj = new GraphBFS();
        List<Integer> bfs = obj.bfsGraph(V, adjList);
        printBFS(bfs);
    }
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // This is only for undirected graph
    }
    public static void printBFS(List<Integer> ans){
        for(int x : ans){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
