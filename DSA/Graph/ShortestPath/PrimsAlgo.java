package DSA.Graph.ShortestPath;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
    static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;

        }
    }

    public static void Prims(ArrayList<Edge> graph[], int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();   // O(ElogE)
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        int cost_mst = 0; // Minimumspininig tree
        while (!pq.isEmpty()) {
            Pair cur = pq.remove();
            if (!vis[cur.node]) {
                vis[cur.node] = true;
                cost_mst += cur.cost;

                for (int i = 0; i < graph[cur.node].size(); i++) {
                    Edge e = graph[cur.node].get(i);

                    if (!vis[e.dst]) {
                        pq.add(new Pair(e.dst, e.wt));
                    }
                }

            }
        }

        System.out.println("Cost of Minimum Spining tree: " + cost_mst);

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        CreateGraph(graph);
        Prims(graph, V);

    }
}
