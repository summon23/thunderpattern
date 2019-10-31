package Algorithm;

import DataStructure.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    static void runBFS(Graph graph, int n, int start) {
        boolean visited[] = new boolean[n];

        // Create a queue for Algorithm.BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        LinkedList<Integer> adj[] =graph.getGraph();


        // Mark the current node as visited and enqueue it
        visited[start]=true;
        queue.add(start);

        while(queue.size() > 0) {

            // Dequeue a vertex from queue and print it
            start = queue.poll();
            System.out.print(start+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[start].listIterator();
            while (i.hasNext())
            {
                int t = i.next();
                if (!visited[t])
                {
                    visited[t] = true;
                    queue.add(t);
                }
            }

        }
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

        runBFS(graph, V, 2);
    }
}
