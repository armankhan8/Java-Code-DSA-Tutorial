package DSA.Graph.ShortestPath;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class BellmanFord {
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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
        
        graph[2].add(new Edge(2, 3, 2));
        
        graph[3].add(new Edge(3, 4, 4));
        
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void Bellmanf(ArrayList<Edge> graph[], int src, int V){
        int distance[] = new int[V];
        for(int i = 0; i<V; i++){
            if(i!=src){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        for(int k = 0; k<V-1; k++){
            for(int i = 0; i<V; i++){
                for(int j = 0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(j);

                    int u = e.src;
                    int v = e.dst;

                    if(distance[u] != Integer.MAX_VALUE && distance[u] + e.wt < distance[v]){
                        distance[v] = distance[u] + e.wt;
                    }
                }
            }
        }
        for(int i = 0; i<distance.length-1; i++){
            System.out.print(distance[i] + " "); 
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
 
        CreateGraph(graph);
        Bellmanf(graph, 0, V);

    }
}
