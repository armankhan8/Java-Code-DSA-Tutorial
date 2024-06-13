package DSA.Graph.GraphTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge {
        int src;
        int dst;

        Edge(int src, int dst) {
            this.dst = dst;
            this.src = src;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[5].add(new Edge(6, 5));

    }

    public static void BFST(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[V];

        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visit[curr] == false) {
                System.out.println(curr + " ");
                visit[curr] = true;
                // Add Neighbours of curr 
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList[] graph = new ArrayList[V];
        CreateGraph(graph);
        BFST(graph, V);
        System.out.println();

    }
}
