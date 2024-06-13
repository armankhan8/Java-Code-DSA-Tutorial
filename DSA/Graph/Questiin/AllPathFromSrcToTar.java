package DSA.Graph.Questiin; // Corrected package name

import java.util.*;

public class AllPathFromSrcToTar { // Corrected class name
    static class Edge {
        int src;
        int dst;

        Edge(int src, int dst) {
            this.dst = dst;
            this.src = src;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) { // Corrected method name
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
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

        graph[6].add(new Edge(6, 5)); // Corrected the edge
    }

    public static void printAllPaths(ArrayList<Edge> graph[], boolean visit[], int curr, String path, int target) { // Corrected method name
        if (curr == target) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dst]) {
                visit[curr] = true;
                printAllPaths(graph, visit, e.dst, path + e.dst, target);
                visit[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V]; // Corrected the generic type
        boolean visit[] = new boolean[V];
        createGraph(graph);

        int s = 0, target = 5;
        printAllPaths(graph, visit, s, "0", target);
    }
}
