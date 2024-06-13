package DSA.Graph.AdjacencyList;

import java.util.ArrayList;

public class WithWght {
    static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int src, int dst, int wt) {
            this.dst = dst;
            this.src = src;
            this.wt = wt;
        }
    }

    public static void Creating(ArrayList<Edge> graph[]) {
        // Create Empty list beacz null pointer is exit in built    
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        Creating(graph);

        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);  // Corrected index from graph[1] to graph[2]
            System.out.println(e.dst + ", " + e.wt);
        }
    }
}
