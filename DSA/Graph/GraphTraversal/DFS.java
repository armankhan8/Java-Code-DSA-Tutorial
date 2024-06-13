package DSA.Graph.GraphTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
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

    public static void DFST(ArrayList<Edge> graph[], int curr, boolean visit[]) {
        System.out.print(curr + " ");
        visit[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(visit[e.dst] == false){
                DFST(graph, e.dst, visit);
            }
        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList[] graph = new ArrayList[V];
        boolean visit[] = new boolean[V];
        
        CreateGraph(graph);
        // if Connected 
        // DFST(graph, 0, visit);

        // if graph is disconnected, it work on both condition dis, con..
        for(int i = 0; i<V; i++){
            if(visit[i] == false){
                DFST(graph, 0, visit);
            }
        }
        System.out.println();

    }
}
