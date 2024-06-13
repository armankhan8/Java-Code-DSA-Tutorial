package DSA.Graph.AdjacencyList;

import java.util.ArrayList;

public class MakingGraphWithout_Wgt {
    static class Edge {
        int src;
        int dst;

        Edge(int src, int dst) {
            this.dst = dst;
            this.src = src;
        }
    }

    public static void Creating(ArrayList<Edge> graph[]) {
        // Create Empty list beacz null pointer is exit in built    
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        Creating(graph);

        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);  // Corrected index from graph[1] to graph[2]
            System.out.print(e.dst + " ");
        }
    }
}
