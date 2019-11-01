package Algorithm;

import DataStructure.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    static void DFSUtil(Graph graph, int start, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[start] = true;
//        System.out.print(start+" ");

        LinkedList<Integer> adj[] =graph.getGraph();
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[start].listIterator();
        System.out.println("START:" + start);
        while (i.hasNext())
        {
            int n = i.next();
            System.out.println("checking on:" + n);
            if (!visited[n])
                DFSUtil(graph, n, visited);
        }
    }

    static void runDFS(Graph graph, int n, int start) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[n];

        // Call the recursive helper function to print Algorithm.DFS traversal
        DFSUtil(graph, start, visited);
    }

    public static void main(String[] args) {
        int V = 6;
        Graph graph = new Graph(V);

        graph.addEdge(graph,0, 1);
        graph.addEdge(graph,0, 2);
        graph.addEdge(graph,1, 2);
        graph.addEdge(graph,2, 0);
        graph.addEdge(graph,2, 3);
        graph.addEdge(graph,3, 3);
        graph.addEdge(graph, 3, 4);
        graph.addEdge(graph, 5, 1);

//        graph.addEdge(graph, 55, 12);

        graph.printGraph(graph);

        runDFS(graph, V, 2);
    }
}
