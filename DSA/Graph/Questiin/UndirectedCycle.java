package Questiin;

import java.util.ArrayList;

public class UndirectedCycle {
    static class Edge {
        int src;
        int dst;

        Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        
        graph[0].add(new Edge(0, 4));
        graph[4].add(new Edge(4, 0));
        
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        
        graph[1].add(new Edge(1, 4));
        graph[4].add(new Edge(4, 1));
        
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
        
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));
    }

    public static boolean Cycle_undirected(ArrayList<Edge> graph[], boolean visit[], int curr, int parent) {
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (visit[e.dst] && e.dst != parent) {
                return true;
            } else if (!visit[e.dst]) {
                if (Cycle_undirected(graph, visit, e.dst, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        boolean[] visit = new boolean[V];

        CreateGraph(graph);
        System.out.println(Cycle_undirected(graph, visit, 0, -1));
    }
}
