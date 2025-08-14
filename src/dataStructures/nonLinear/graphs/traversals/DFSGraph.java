package dataStructures.nonLinear.graphs.traversals;
import java.util.ArrayList;
import java.util.List;
class GraphDFS {
    private void dfs(int node, List<List<Integer>> adjList,
                     boolean[] visited, List<Integer> ans){
        visited[node] = true; // Mark the starting node as visited
        ans.add(node);
        // Traverse its neighbours one by one if they are not visited
        for (int neighbour : adjList.get(node)){
            // If the neighbour is not visited, perform a dfs call for the neighbour
            if(!visited[neighbour]){
                dfs(neighbour, adjList, visited, ans);
            }
        }
    }
    public List<Integer> dfs(int V, List<List<Integer>> adjList){
        boolean[] visited = new boolean[V+1]; // 0-based indexing
        List<Integer> ans = new ArrayList<>();
        int start = 1; // Assuming DFS starts from 1, make sure you write the correct node
        dfs(start, adjList, visited, ans);
        return ans;
    }
}
public class DFSGraph {
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
        addEdge(adjList, 2,3);
        addEdge(adjList, 2,4);
        addEdge(adjList, 2,5);
        addEdge(adjList, 3,4);
        addEdge(adjList, 4,5);
        GraphDFS obj = new GraphDFS();
        List<Integer> ans = obj.dfs(V, adjList);
        printDFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // This is only for undirected graph
    }
    public static void printDFS(List<Integer> ans){
        for(int x : ans){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
