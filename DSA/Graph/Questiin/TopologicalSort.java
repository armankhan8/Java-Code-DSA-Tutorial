package DSA.Graph.Questiin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {
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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));


        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topological_sort(ArrayList<Edge> graph[], int curr, boolean visit[], Stack<Integer> stack) {
        visit[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(visit[e.dst] == false){
                topological_sort(graph, e.dst, visit, stack);
            }
        }
        stack.push(curr);

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList[] graph = new ArrayList[V];
        boolean visit[] = new boolean[V];   
        Stack<Integer> stack = new Stack<>();

        CreateGraph(graph);

        for(int i = 0; i<V; i++){
            if(visit[i] == false){
                topological_sort(graph, i, visit, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
